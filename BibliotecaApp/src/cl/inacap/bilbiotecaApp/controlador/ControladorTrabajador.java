/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bilbiotecaApp.controlador;

import cl.inacap.bibliotecaApp.modelo.Trabajador;
import cl.inacap.bibliotecaApp.modelo.TrabajadorDAO;
import cl.inacap.bibliotecaApp.vista.TrabajadorFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Corvalan
 */
public class ControladorTrabajador implements ActionListener{

    TrabajadorDAO dao = new TrabajadorDAO();
    Trabajador tr = new Trabajador();
    TrabajadorFrame trabajadorVista = new TrabajadorFrame();
    DefaultTableModel modelo = new DefaultTableModel();

        /**
     * ControladorTrabajador: metodo publico que recibe la vista de los trabajadores, mediante un escuchador activa los botones 
     * btnListar, btnAgregar, btnNuevo, btnEditar, btnActualizar y btnEliminar
     * @param tr tipo TrabajadorFrame
     * 
     */
    
    public ControladorTrabajador(TrabajadorFrame tr) {
        this.trabajadorVista = tr;
        this.trabajadorVista.agregar_trabajador_btn.addActionListener(this);
        this.trabajadorVista.listar_tr_btn.addActionListener(this);
        this.trabajadorVista.limpiar_trabajador_btn.addActionListener(this);
        this.trabajadorVista.editar_tr_btn.addActionListener(this);
        this.trabajadorVista.eliminar_tr_btn.addActionListener(this);
        this.trabajadorVista.actualizar_tr_btn.addActionListener(this);
    }

    /**
     * actionPerformed: metodo publico que proporciona las funciones a cada
     * boton cuando son clickeados por el usuario
     *
     * @param e tipo ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == trabajadorVista.listar_tr_btn) {
            limpiarTabla();
            listar(trabajadorVista.tabla);
            nuevo();
        }
        if (e.getSource() == trabajadorVista.limpiar_trabajador_btn) {
            nuevo();
        }
        if (e.getSource() == trabajadorVista.agregar_trabajador_btn) {
            agregar();
            listar(trabajadorVista.tabla);
        }
        if (e.getSource() == trabajadorVista.editar_tr_btn) {
            int fila = trabajadorVista.tabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(trabajadorVista, "Debe seleccionar una fila");
            } else {
                JOptionPane.showMessageDialog(trabajadorVista, "Modifica el dato y haz click en Actualizar");
                int id = Integer.parseInt((String) trabajadorVista.tabla.getValueAt(fila, 0).toString());
                String rutTr = (String) trabajadorVista.tabla.getValueAt(fila, 1);
                String nombreTr = (String) trabajadorVista.tabla.getValueAt(fila, 2);
                String apellidoPaterno = (String) trabajadorVista.tabla.getValueAt(fila, 3);
                String apellidoMaterno = (String) trabajadorVista.tabla.getValueAt(fila, 4);
                String direccionTr = (String) trabajadorVista.tabla.getValueAt(fila, 5);
                int telefonoTr = Integer.parseInt((String) trabajadorVista.tabla.getValueAt(fila, 6).toString());
                String correoTr = (String) trabajadorVista.tabla.getValueAt(fila, 7);
                String fechaContratoTr = (String) trabajadorVista.tabla.getValueAt(fila, 8);
                trabajadorVista.id_trabajador_txt.setText("" + id);
                trabajadorVista.rut_trabajador_txt.setText(rutTr);
                trabajadorVista.nom_trabajador_txt.setText(nombreTr);
                trabajadorVista.apePa_trabajador_txt.setText(apellidoPaterno);
                trabajadorVista.apeMa_trabajador_txt.setText(apellidoMaterno);
                trabajadorVista.direccion_trabajador_txt.setText(direccionTr);
                trabajadorVista.telefono_trabajador_txt.setText("" + telefonoTr);
                trabajadorVista.correo_txt.setText(correoTr);
                trabajadorVista.fecha_cont_trabajador_txt.setText(fechaContratoTr);
            }
        }
        if (e.getSource() == trabajadorVista.actualizar_tr_btn) {
            actualizar();
            listar(trabajadorVista.tabla);
            nuevo();
        }
        if (e.getSource() == trabajadorVista.eliminar_tr_btn) {
            eliminar();
            listar(trabajadorVista.tabla);
            nuevo();
        }
    }

    /**
     * listar: metodo publico que recibe la tabla ubicada en la parte grafica de
     * la aplicacion, centra los contenidos de la tabla con el metodo
     * centrarCeldas, define la tabla como el modelo de tabla por defecto, llama
     * al listar en la clase TrabajadorDAO, crea un objeto que contiene los datos de
     * los autores y estos son añadidos a la tabla
     *
     * @param tabla tipo jTable
     */
    private void listar(JTable tabla) {
        centrarCeldas(tabla);
        modelo = (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<Trabajador> lista = dao.listar();
        Object[] objeto = new Object[9];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getIdTrabajador();
            objeto[1] = lista.get(i).getRutTrabajador();
            objeto[2] = lista.get(i).getNombreTrabajador();
            objeto[3] = lista.get(i).getApePaternoTr();
            objeto[4] = lista.get(i).getApeMaternoTr();
            objeto[5] = lista.get(i).getDireccionTr();
            objeto[6] = lista.get(i).getTelefonoTrabajador();
            objeto[7] = lista.get(i).getCorreoTrabajador();
            objeto[8] = lista.get(i).getFechaContratoTr();
            modelo.addRow(objeto);
        }
        tabla.setRowHeight(35);
        tabla.setRowMargin(10);
    }

    private void agregar() {
        
        try {

            int id = Integer.parseInt(trabajadorVista.id_trabajador_txt.getText());
            String rutTr = trabajadorVista.rut_trabajador_txt.getText().trim();
            String nombreTr = trabajadorVista.nom_trabajador_txt.getText().trim();
            String apellidoPaterno = trabajadorVista.apePa_trabajador_txt.getText().trim();
            String apellidoMaterno = trabajadorVista.apeMa_trabajador_txt.getText().trim();
            String direccionTr = trabajadorVista.direccion_trabajador_txt.getText().trim();
            int telefonoTr = Integer.parseInt(trabajadorVista.telefono_trabajador_txt.getText().toString().trim());
            String correoTr = trabajadorVista.correo_txt.getText().trim();
            String fechaContraroTr = trabajadorVista.fecha_cont_trabajador_txt.getText().trim();
            
            tr.setIdTrabajador(id);
            tr.setRutTrabajador(rutTr);
            tr.setNombreTrabajador(nombreTr);
            tr.setApePaternoTr(apellidoPaterno);
            tr.setApeMaternoTr(apellidoMaterno);
            tr.setDireccionTr(direccionTr);
            tr.setTelefonoTrabajador(telefonoTr);
            tr.setCorreoTrabajador(correoTr);
            tr.setFechaContratoTr(fechaContraroTr);

            int r = dao.agregar(tr);
            if (r == 1) {
                JOptionPane.showMessageDialog(trabajadorVista, "Trabajador agregado");
            } else {
                JOptionPane.showMessageDialog(trabajadorVista, "Error al agregar");
            }
            limpiarTabla();
            nuevo();


        } catch (Exception ex) {
            System.err.println(ex);
        }

    }

    private void limpiarTabla() {
        for (int i = 0; i < trabajadorVista.tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    private void nuevo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void centrarCeldas(JTable tabla) {
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < trabajadorVista.tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }



}
