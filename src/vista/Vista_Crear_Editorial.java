/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import control.Control_Editorial;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;
import modelo.Editorial;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Home
 */
public class Vista_Crear_Editorial extends javax.swing.JFrame {

    LinkedList<Editorial> listaE;
    
    public Vista_Crear_Editorial() {
        initComponents();
        setLocationRelativeTo(null);
        listaE = new LinkedList<>();
        jDateChooser1.getDateEditor().setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idpn = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextDireccionE = new javax.swing.JTextField();
        jTextTelefonoE = new javax.swing.JTextField();
        jTextCorreoE = new javax.swing.JTextField();
        jTextNombreE = new javax.swing.JTextField();
        jButtonInsertEditorial = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButtoNBorrar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonMostrar = new javax.swing.JButton();
        idE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnmp = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        idpn.setEditable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(73, 181, 172));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Correo de la editorial:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Fecha Creación editorial:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Nombre editorial:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Teléfono editorial:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel1.setText("Insertar editorial");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Dirección de la editorial:");

        jTextTelefonoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTelefonoEKeyTyped(evt);
            }
        });

        jTextCorreoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCorreoEActionPerformed(evt);
            }
        });

        jTextNombreE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreEActionPerformed(evt);
            }
        });
        jTextNombreE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreEKeyTyped(evt);
            }
        });

        jButtonInsertEditorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnInsertar1.png"))); // NOI18N
        jButtonInsertEditorial.setBorderPainted(false);
        jButtonInsertEditorial.setContentAreaFilled(false);
        jButtonInsertEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertEditorialActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy/MM/d");

        jButtoNBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnEliminar1.png"))); // NOI18N
        jButtoNBorrar.setBorderPainted(false);
        jButtoNBorrar.setContentAreaFilled(false);
        jButtoNBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoNBorrarActionPerformed(evt);
            }
        });

        jButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnModificar1.png"))); // NOI18N
        jButtonModificar.setBorderPainted(false);
        jButtonModificar.setContentAreaFilled(false);
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnMostrar1.png"))); // NOI18N
        jButtonMostrar.setBorderPainted(false);
        jButtonMostrar.setContentAreaFilled(false);
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        idE.setEditable(false);
        idE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Id: ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane4.setViewportView(jScrollPane1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Ir al menú");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("principal");

        btnmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnHome1.png"))); // NOI18N
        btnmp.setBorderPainted(false);
        btnmp.setContentAreaFilled(false);
        btnmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(idE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextCorreoE, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(jTextTelefonoE)
                                            .addComponent(jTextNombreE)))
                                    .addComponent(jTextDireccionE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnmp, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonInsertEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtoNBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4)
                            .addComponent(jSeparator1))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnmp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(idE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel5))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel8)
                                                        .addGap(10, 10, 10)))
                                                .addComponent(jTextTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(7, 7, 7)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jTextDireccionE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(4, 4, 4)))))
                                .addGap(8, 8, 8)
                                .addComponent(jTextCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonInsertEditorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtoNBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertEditorialActionPerformed
      
        //------------BOTON-------------------
    jDateChooser1.setCalendar(Calendar.getInstance());
    Control_Editorial objcE=new Control_Editorial();
        
    String nombre_editorial=jTextNombreE.getText();
    String telefono_E = jTextTelefonoE.getText();
    String direccion_E = jTextDireccionE.getText();
    String correo_E = jTextCorreoE.getText();
    
    Date Fecha_Creacion_Editorial2 = jDateChooser1.getDate();
    
    long d=Fecha_Creacion_Editorial2.getTime();
    
    java.sql.Date Fecha_Creacion_Editorial= new java.sql.Date(d);//Se hace esto por que date entrega sabado domigo lunes etc, aqui se acomoda el formato con d al ponerle get time   
        
        if (nombre_editorial.isEmpty() || telefono_E.isEmpty() || direccion_E.isEmpty() || correo_E.isEmpty()){
            JOptionPane.showMessageDialog(this, "No deben haber campos vacios","ERROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(this, "No se inserto la Editorial");
        } else {
            boolean t = objcE.insertar_Editorial(nombre_editorial,telefono_E,direccion_E,correo_E, Fecha_Creacion_Editorial );

        if (t == true) {
            JOptionPane.showMessageDialog(this, "Se inserto la Editorial con exito");
         }
        }
    }//GEN-LAST:event_jButtonInsertEditorialActionPerformed

    private void jButtoNBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoNBorrarActionPerformed
        // TODO add your handling code here:
        
                Control_Editorial objeu = new Control_Editorial();
        String selected = idE.getText();
        boolean t1 = objeu.eliminarEditorial(selected);

        if (t1 == true) {
            JOptionPane.showMessageDialog(this, "Se elimino la editorial con exito");
        } else {
            JOptionPane.showMessageDialog(this, "No se elimino la editorial");
        }

   
        
    }//GEN-LAST:event_jButtoNBorrarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
        
         String nombre_editorial = jTextNombreE.getText();
         String telefono_E=jTextTelefonoE.getText();
         String direccion_E=jTextDireccionE.getText();
         String correo_E = jTextCorreoE.getText();
         
         //Date Fecha_Creacion_Editorial=jDateChooser1.getDate();
         
         Date Fecha_Creacion_Editorial3 = jDateChooser1.getDate();
    
         long f=Fecha_Creacion_Editorial3.getTime();
    
         java.sql.Date Fecha_Creacion_Editoria4= new java.sql.Date(f);
         
        Control_Editorial objmpn = new Control_Editorial();
        String selected = idE.getText();
        
         if (nombre_editorial.isEmpty() || telefono_E.isEmpty() || direccion_E.isEmpty() || correo_E.isEmpty()){
            JOptionPane.showMessageDialog(this, "No deben haber campos vacios","ERROR",JOptionPane.ERROR_MESSAGE); 
        }else{
        
        boolean t1 = objmpn.modificarEditorial( selected,nombre_editorial,telefono_E,direccion_E,correo_E,Fecha_Creacion_Editoria4);
       
        if (t1 == true ) {
            JOptionPane.showMessageDialog(this, "Se modifico la editorial");
        } else {
            JOptionPane.showMessageDialog(this, "No se modifico la editorial");
        }
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        
        
        Control_Editorial objpn = new Control_Editorial();
        int ncol;
        Object[] fila;

        listaE = objpn.consultarEditoriales();

        DefaultTableModel modelo = new DefaultTableModel();
        this.jTable1.setModel(modelo);

        modelo.addColumn("id_editorial");
        modelo.addColumn("nombre_editorial");
        modelo.addColumn("telefono_E");
        modelo.addColumn("direccion_E");
        modelo.addColumn("correo_E");
        modelo.addColumn("Fecha_Creacion_Editorial");
        ncol = modelo.getColumnCount();

        //Object[] fila = new Object[ncol];
        for (int i = 0; i < listaE.size(); i++) {
            fila = new Object[ncol];
            fila[0] = listaE.get(i).getId_editorial();
            fila[1] = listaE.get(i).getNombre_editorial();
            fila[2] = listaE.get(i).getTelefono_E();
            fila[3] = listaE.get(i).getDireccion_E();
            fila[4] = listaE.get(i).getCorreo_E();
            fila[5] = listaE.get(i).getFecha_Creacion_Editorial();
            modelo.addRow(fila);

        }
   
    }//GEN-LAST:event_jButtonMostrarActionPerformed

    private void jTextCorreoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCorreoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCorreoEActionPerformed

    private void jTextNombreEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreEActionPerformed

    private void idEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idEActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        int seleccion = jTable1.rowAtPoint(evt.getPoint());
        
        jTextNombreE.setText(String.valueOf(jTable1.getValueAt(seleccion, 1)));
        jTextTelefonoE.setText(String.valueOf(jTable1.getValueAt(seleccion, 2)));
        jTextDireccionE.setText(String.valueOf(jTable1.getValueAt(seleccion, 3)));
        jTextCorreoE.setText(String.valueOf(jTable1.getValueAt(seleccion, 4)));
        
      
        
        //obtenemos la fecha de dicha fila
        String fecha = jTable1.getValueAt(seleccion, 5).toString();
        //creamos el formato en el que deseamos mostrar la fecha
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-mm-dd");
        //creamos una variable tipo Date y la ponemos NULL
        Date fechaN = null;
        try {
            //parseamos de String a Date usando el formato
            fechaN = formatoDelTexto.parse(fecha);
            //seteamos o mostramos la fecha en el JDateChooser
            jDateChooser1.setDate(fechaN);
            
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
     
          
       //jDateChooser1.setDateFormatString(String.valueOf(jTable1.getModel().getValueAt(seleccion, 5)));
         //jDateChooser1.setDateFormatString(String.valueOf(jTable1.getValueAt(seleccion, 5)));
        
       // jDateChooser1.setName(String.valueOf(jTable1.getValueAt(seleccion, 5)));//---> funciona modificar
        idE.setText(String.valueOf(jTable1.getValueAt(seleccion, 0)));
            
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmpActionPerformed
        
        VistaMenu vmp = new VistaMenu();
        this.dispose();
        vmp.setVisible(true);
        
    }//GEN-LAST:event_btnmpActionPerformed

    private void jTextTelefonoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTelefonoEKeyTyped
        
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor ingresa solo numeros");
        }
        
    }//GEN-LAST:event_jTextTelefonoEKeyTyped

    private void jTextNombreEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreEKeyTyped
        
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Por favor ingresa solo letras");
        }
        
    }//GEN-LAST:event_jTextNombreEKeyTyped
                                    


    /**     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista_Crear_Editorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Crear_Editorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Crear_Editorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Crear_Editorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Crear_Editorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmp;
    private javax.swing.JTextField idE;
    private javax.swing.JTextField idpn;
    private javax.swing.JButton jButtoNBorrar;
    private javax.swing.JButton jButtonInsertEditorial;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonMostrar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCorreoE;
    private javax.swing.JTextField jTextDireccionE;
    private javax.swing.JTextField jTextNombreE;
    private javax.swing.JTextField jTextTelefonoE;
    // End of variables declaration//GEN-END:variables
}
