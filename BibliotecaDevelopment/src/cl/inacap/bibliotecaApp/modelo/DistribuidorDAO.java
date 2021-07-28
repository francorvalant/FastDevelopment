package cl.inacap.bibliotecaApp.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DistribuidorDAO {
/**
 * Clase DistribuidorDAO: contiene los metodos para crear, modificar, eliminar y actualizar un distribuidor
 * mediante sentencias DML a la base de datos bibliotecadb en la tabla distribuidor.
 * @author Cristobal Cortés.
 * @since 12/05/2020.
 * @version 1.0.
 * @param ps es el objeto que representa una sentencia SQL precompilada, la sentencia sql se precompila y almacena en un objeto PreparedStatement.
 * @param rs representa el resultado de la base de datos
 * @param con esta variable representa la conexion que existe con la base de datos
 * @param p es el objeto en el que se crea un nuevo Autor
 * 
 */
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Distribuidor p = new Distribuidor();

    
      /**
     * 
     * listar: metodo publico que se conecta en la base de datos
     * prepara una sentencia sql que selecciona todos los distribuidores en la base de datos,
     * cuando el resultado este listo crea un nuevo distribuidor y los almacena en la lista datos.
     * @return devuelve una lista con todos los distribuidores en la base de datos.
     */
    public List listar() {
        List<Distribuidor> datos = new ArrayList<>();
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement("select * from distribuidor");
            rs = ps.executeQuery();
            while (rs.next()) {
                Distribuidor d = new Distribuidor();
                d.setNombreEmpresa(rs.getString(1));
                d.setDireccion(rs.getString(2));
                d.setTelefono(rs.getInt(3));
                d.setRutDistribuidor(rs.getInt(4));
                d.setAnioVenta(rs.getInt(5));
                datos.add(d);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return datos;
    }
    
     /**
     * agregar: metodo publico que inserta los datos de un nuevo distribuidor en la base de datos mediante 
     * una sentencia sql de insercion
     * @param dis de tipo Distribuidor
     * @return la respuesta del PrepareStatement
     */
    public int agregar(Distribuidor dis) {  
        int r=0;
        
        String sql="insert into distribuidor(Nombre_empresa,Direccion_dist,Telefono,Rut_distribuidor,Anio_venta)values(?,?,?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);   
            ps.setString(1,dis.getNombreEmpresa());
            ps.setString(2,dis.getDireccion());
            ps.setInt(3,dis.getTelefono());
            ps.setInt(4,dis.getRutDistribuidor());
            ps.setInt(5,dis.getAnioVenta());
            r=ps.executeUpdate();    
            if(r==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (Exception e) {
            System.out.println(e);
        }  
        return r;
    }
    /**
     * actualizar: metodo publico int que modifica los datos de un distribuidor ya existente mediante una 
     * sentencia sql donde se modificara desde el id seleccionado
     * @param dis de tipo Distribuidor
     * @return la respuesta del PrepareStatement
     */
    public int actualizar(Distribuidor dis) {  
        int r=0;
         con = conectar.getConnection();
        PreparedStatement ps = null;
        String sql="update distribuidor set Nombre_empresa=?,Direccion_dist=?,Telefono=?,Anio_venta=? where Rut_distribuidor=?";        
        try {
            
            ps = con.prepareStatement(sql);            
            ps.setString(1,dis.getNombreEmpresa());
            ps.setString(2,dis.getDireccion());
            ps.setInt(3,dis.getTelefono());
            ps.setInt(4,dis.getAnioVenta());
            ps.setInt(5,dis.getRutDistribuidor());
            r=ps.executeUpdate();    
            if(r==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (SQLException e) {
             System.err.println(e);
        }  
        return r;
    }
       /**
     * eliminar: metodo public int que recibe el id del distribuidor seleccionado y lo elimina mediante
     * una sentencia SQL DELETE 
     * @return la respuesta del PrepareStatement
     * @param rutDistribuidor tipo int
     */
    public int eliminar(int rutDistribuidor){
        int r=0;
        String sql="delete from distribuidor where Rut_distribuidor="+rutDistribuidor;
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            r= ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }
}
