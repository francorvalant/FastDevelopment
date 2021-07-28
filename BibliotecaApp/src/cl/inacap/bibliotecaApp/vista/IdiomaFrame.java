/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bibliotecaApp.vista;

import cl.inacap.bilbiotecaApp.controlador.ControladorIdioma;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristobal
 */
public class IdiomaFrame extends javax.swing.JFrame {

    /**
     * Creates new form Libro
     */
    public IdiomaFrame() {
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
    }


    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono_img.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        nom_idioma_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        id_idioma_txt = new javax.swing.JTextField();
        agregar_idioma_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        eliminar_idioma_btn = new javax.swing.JButton();
        listar_idioma_btn = new javax.swing.JButton();
        editar_idioma_btn = new javax.swing.JButton();
        actualizar_idioma_btn = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Idioma - FastDevelopment");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(39, 151, 212));
        jPanel2.setForeground(new java.awt.Color(51, 0, 51));

        jLabel13.setBackground(new java.awt.Color(102, 102, 102));
        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Ingresa los idiomas de los libros");

        nom_idioma_txt.setBackground(new java.awt.Color(255, 255, 255));
        nom_idioma_txt.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13)); // NOI18N
        nom_idioma_txt.setForeground(new java.awt.Color(0, 0, 0));
        nom_idioma_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nom_idioma_txt.setToolTipText("");
        nom_idioma_txt.setBorder(null);
        nom_idioma_txt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nom_idioma_txt.setSelectedTextColor(new java.awt.Color(11, 0, 32));

        jLabel11.setBackground(new java.awt.Color(11, 0, 32));
        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Idiomas");

        jLabel16.setBackground(new java.awt.Color(102, 102, 102));
        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Idioma");

        jLabel17.setBackground(new java.awt.Color(102, 102, 102));
        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("ID");

        id_idioma_txt.setEditable(false);
        id_idioma_txt.setBackground(new java.awt.Color(255, 255, 255));
        id_idioma_txt.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        id_idioma_txt.setForeground(new java.awt.Color(255, 255, 255));
        id_idioma_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        id_idioma_txt.setToolTipText("");
        id_idioma_txt.setBorder(null);
        id_idioma_txt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        id_idioma_txt.setSelectedTextColor(new java.awt.Color(11, 0, 32));

        agregar_idioma_btn.setBackground(new java.awt.Color(255, 255, 255));
        agregar_idioma_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        agregar_idioma_btn.setText("Agregar");
        agregar_idioma_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_idioma_btnActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha_img.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(agregar_idioma_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(id_idioma_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(nom_idioma_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(178, 178, 178))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(54, 54, 54)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nom_idioma_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_idioma_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(agregar_idioma_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 590));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Idioma"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 510, 230));

        jLabel18.setBackground(new java.awt.Color(11, 0, 32));
        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(11, 0, 32));
        jLabel18.setText("Tabla de idiomas");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        jLabel19.setBackground(new java.awt.Color(102, 102, 102));
        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(11, 0, 32));
        jLabel19.setText("Selecciona un idioma en la tabla, puedes listar, editar, ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, -1));

        jLabel20.setBackground(new java.awt.Color(102, 102, 102));
        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(11, 0, 32));
        jLabel20.setText("y eliminar los datos si lo deseas");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, -1, 30));

        eliminar_idioma_btn.setBackground(new java.awt.Color(255, 255, 255));
        eliminar_idioma_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        eliminar_idioma_btn.setText("Eliminar");
        eliminar_idioma_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_idioma_btnActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar_idioma_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 320, 37));

        listar_idioma_btn.setBackground(new java.awt.Color(255, 255, 255));
        listar_idioma_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        listar_idioma_btn.setText("Listar");
        listar_idioma_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listar_idioma_btnActionPerformed(evt);
            }
        });
        jPanel1.add(listar_idioma_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 100, 37));

        editar_idioma_btn.setBackground(new java.awt.Color(255, 255, 255));
        editar_idioma_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        editar_idioma_btn.setText("Editar");
        editar_idioma_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_idioma_btnActionPerformed(evt);
            }
        });
        jPanel1.add(editar_idioma_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 100, 37));

        actualizar_idioma_btn.setBackground(new java.awt.Color(255, 255, 255));
        actualizar_idioma_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        actualizar_idioma_btn.setText("Actualizar");
        actualizar_idioma_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_idioma_btnActionPerformed(evt);
            }
        });
        jPanel1.add(actualizar_idioma_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 100, 37));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1187, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminar_idioma_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_idioma_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_idioma_btnActionPerformed

    private void listar_idioma_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listar_idioma_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listar_idioma_btnActionPerformed

    private void editar_idioma_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_idioma_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editar_idioma_btnActionPerformed

    private void actualizar_idioma_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_idioma_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizar_idioma_btnActionPerformed

    private void agregar_idioma_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_idioma_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregar_idioma_btnActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        GestionDatosFrame gtFrame = new GestionDatosFrame();
        gtFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       IdiomaFrame i = new IdiomaFrame();
       ControladorIdioma con = new ControladorIdioma(i);
       i.setVisible(true);
       i.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton actualizar_idioma_btn;
    public javax.swing.JButton agregar_idioma_btn;
    public javax.swing.JButton editar_idioma_btn;
    public javax.swing.JButton eliminar_idioma_btn;
    public javax.swing.JTextField id_idioma_txt;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton listar_idioma_btn;
    public javax.swing.JTextField nom_idioma_txt;
    public javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}