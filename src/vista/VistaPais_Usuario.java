/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlUsuario;
import control.Control_Paises_Usuario;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Pais_Usuario;
import modelo.Usuario;

/**
 *
 * @author Home
 */
public class VistaPais_Usuario extends javax.swing.JFrame {

    LinkedList<Pais_Usuario> listaPais_Usuario;
    LinkedList<Usuario>listaU;

    /**
     * Creates new form VistaPais_Usuario
     */
    public VistaPais_Usuario() {
        initComponents();
        listaPais_Usuario = new LinkedList<>();
        listaU = new LinkedList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPaisUsuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        IdUsu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnmp = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(73, 181, 172));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel1.setText("Insertar país del ususario");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Nombre país del usuario:");

        jTextFieldPaisUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPaisUsuarioKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnInsertar1.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnEliminar1.png"))); // NOI18N
        jButtonBorrar.setBorderPainted(false);
        jButtonBorrar.setContentAreaFilled(false);
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
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

        IdUsu.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Id: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Ir al menú");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("principal");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldPaisUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(IdUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(btnmp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(140, 140, 140))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldPaisUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IdUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombrePaisU = jTextFieldPaisUsuario.getText();

        Control_Paises_Usuario objcpa = new Control_Paises_Usuario();

        if (nombrePaisU.isEmpty()) {

            JOptionPane.showMessageDialog(this, "no deben haber campos vacios");
            JOptionPane.showMessageDialog(this, "No se inserto el pais del usuario");
        } else {

            boolean t = objcpa.insertarPaises_Usuario(nombrePaisU);

            if (t == true) {
                JOptionPane.showMessageDialog(this, "Se inserto el pais del usuario");
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        // TODO add your handling code here:

   ControlUsuario obju = new ControlUsuario();
         listaU = obju.consultarUsuario();
        boolean PaisUsado = false;
        Object[] fila2=null;
        boolean t1=false;
        boolean vacio=true;
         String select = IdUsu.getText();//id
         
         int select2=0;
         
         if(IdUsu.getText().length()==0){select2=0;JOptionPane.showMessageDialog(this, "No puede haber campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
    }else{
         
          select2 =Integer.parseInt(select);//id
              int r = 0; 
              boolean b=false;

              if(select2==0){b=true;}else{b=false;}
              
              if(b==false){

              
        Control_Paises_Usuario objepn = new Control_Paises_Usuario();
           for (int i = 0; i < listaU.size(); i++) {
         r=listaU.get(i).getId_PaisUF();
         if(r==select2){
        
         PaisUsado=true;
         break;
         }else{
          PaisUsado=false;
         }
           }
           if((PaisUsado==false)){
               if (jTextFieldPaisUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "no deben haber campos vacios");
            
        } else {
             t1 = objepn.eliminarPais_Usuario(select);
           }
}
                  
        if (t1 == true && PaisUsado==false) {
            JOptionPane.showMessageDialog(this, "Se eliminó el pais del usuario");
                        
        } else {
            JOptionPane.showMessageDialog(this, "No se puede eliminar este pais", "Error", JOptionPane.ERROR_MESSAGE);
        } 
              } }  
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:

        String nombrePaisU = jTextFieldPaisUsuario.getText();
        Control_Paises_Usuario objmpn = new Control_Paises_Usuario();
        String selected = IdUsu.getText();

        if (nombrePaisU.isEmpty()) {
            JOptionPane.showMessageDialog(this, "no deben haber campos vacios");
            
        } else {
            boolean t1 = objmpn.modificarPais_Usuario(selected, nombrePaisU);

            if (t1 == true) {
                JOptionPane.showMessageDialog(this, "Se modifico el pais del usuario");
            }
        }

    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        // TODO add your handling code here:

        Control_Paises_Usuario objpn = new Control_Paises_Usuario();
        int ncol;
        Object[] fila;

        listaPais_Usuario = objpn.consultarPaises_Usuario();

        DefaultTableModel modelo = new DefaultTableModel();
        this.jTable1.setModel(modelo);

        modelo.addColumn("id Pais Usuario");
        modelo.addColumn("Pais");
        ncol = modelo.getColumnCount();

        //Object[] fila = new Object[ncol];
        for (int i = 0; i < listaPais_Usuario.size(); i++) {
            fila = new Object[ncol];
            fila[0] = listaPais_Usuario.get(i).getId_PaisU();
            fila[1] = listaPais_Usuario.get(i).getNombrePaisU();
            modelo.addRow(fila);

        }


    }//GEN-LAST:event_jButtonMostrarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int seleccion = jTable1.rowAtPoint(evt.getPoint());
        jTextFieldPaisUsuario.setText(String.valueOf(jTable1.getValueAt(seleccion, 1)));
        IdUsu.setText(String.valueOf(jTable1.getValueAt(seleccion, 0)));


    }//GEN-LAST:event_jTable1MouseClicked

    private void btnmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmpActionPerformed

        VistaMenu vmp = new VistaMenu();
        this.dispose();
        vmp.setVisible(true);

    }//GEN-LAST:event_btnmpActionPerformed

    private void jTextFieldPaisUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPaisUsuarioKeyTyped

        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {

            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Por favor ingresa solo letras");
        }

    }//GEN-LAST:event_jTextFieldPaisUsuarioKeyTyped

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(VistaPais_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPais_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPais_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPais_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPais_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdUsu;
    private javax.swing.JButton btnmp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldPaisUsuario;
    // End of variables declaration//GEN-END:variables
}
