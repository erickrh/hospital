/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Variables.funcionario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erick
 */
public class RegistrarFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarFuncionario
     */
    public RegistrarFuncionario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombres = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldIdentificacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCargo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldEdad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldVacuna = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCategoria = new javax.swing.JTextField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("Registrar Funcionario");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jButtonVolver.setBackground(new java.awt.Color(51, 0, 153));
        jButtonVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonVolver.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jButtonRegistrar.setBackground(new java.awt.Color(51, 0, 153));
        jButtonRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 300, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombres:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellidos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("N??mero de identificaci??n:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jTextFieldNombres.setBackground(new java.awt.Color(51, 0, 153));
        jTextFieldNombres.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldNombres.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombresActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 140, -1));

        jTextFieldApellidos.setBackground(new java.awt.Color(51, 0, 153));
        jTextFieldApellidos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldApellidos.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 140, -1));

        jTextFieldIdentificacion.setBackground(new java.awt.Color(51, 0, 153));
        jTextFieldIdentificacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldIdentificacion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 140, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cargo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jTextFieldCargo.setBackground(new java.awt.Color(51, 0, 153));
        jTextFieldCargo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldCargo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 140, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cargo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cargo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Edad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jTextFieldEdad.setBackground(new java.awt.Color(51, 0, 153));
        jTextFieldEdad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldEdad.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 140, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Vacuna:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jTextFieldVacuna.setBackground(new java.awt.Color(51, 0, 153));
        jTextFieldVacuna.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldVacuna.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 140, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Categoria:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jTextFieldCategoria.setBackground(new java.awt.Color(51, 0, 153));
        jTextFieldCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldCategoria.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 140, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BlueWallpaper.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombresActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
	Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        try {
            // TODO add your handling code here:
            crear_funcionario();
            System.out.println("Registro exitoso!");
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarFuncionario().setVisible(true);
            }
        });
    }
        
    
    void crear_funcionario()throws SQLException {
       funcionario func = new funcionario(jTextFieldIdentificacion.getText(), jTextFieldNombres.getText(), jTextFieldApellidos.getText(), jTextFieldEdad.getText(), jTextFieldVacuna.getText(), jTextFieldCategoria.getText(), jTextFieldCargo.getText()); 
       func.insertaFuncionario();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldIdentificacion;
    private javax.swing.JTextField jTextFieldNombres;
    private javax.swing.JTextField jTextFieldVacuna;
    // End of variables declaration//GEN-END:variables
}
