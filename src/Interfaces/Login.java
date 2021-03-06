/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import Conexion.ConexionDB;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author erick
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icon.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogImage = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jButtonSesion = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogIn.png"))); // NOI18N
        getContentPane().add(jLabelLogImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jButtonSalir.setBackground(new java.awt.Color(51, 0, 153));
        jButtonSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jTextFieldUsuario.setBackground(new java.awt.Color(51, 0, 153));
        jTextFieldUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 130, -1));

        jPasswordField1.setBackground(new java.awt.Color(51, 0, 153));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 130, -1));

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario:");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabelPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Password:");
        getContentPane().add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jButtonSesion.setBackground(new java.awt.Color(51, 0, 153));
        jButtonSesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSesion.setText("Iniciar Sesi??n");
        jButtonSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BlueWallpaper.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 269, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButtonSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSesionActionPerformed
        // TODO add your handling code here:
        if ("root".equals(jTextFieldUsuario.getText()) && "1234".equals(jPasswordField1.getText())) {
            this.dispose();
            Menu menu = new Menu();
            menu.setVisible(true);
        } else {
               this.dispose();
               PasswordIncorrecta passwordincorrecta = new PasswordIncorrecta();
               passwordincorrecta.setVisible(true);
        }
    }//GEN-LAST:event_jButtonSesionActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                ConexionDB conex = new ConexionDB();
                conex.establecerconexion();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSesion;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogImage;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
