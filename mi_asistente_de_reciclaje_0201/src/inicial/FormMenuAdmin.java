/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inicial;

/**
 *
 * @author danielortanapoleon
 */
public class FormMenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form FormMenuAdmin
     */
    public FormMenuAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_volver = new javax.swing.JButton();
        btn_validar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_contrasenia = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(223, 236, 230));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_volver.setBackground(new java.awt.Color(146, 199, 163));
        btn_volver.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        jPanel2.add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 170, -1));

        btn_validar.setBackground(new java.awt.Color(146, 199, 163));
        btn_validar.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        btn_validar.setForeground(new java.awt.Color(255, 255, 255));
        btn_validar.setText("Validar");
        btn_validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_validarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_validar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 170, -1));

        jPanel3.setBackground(new java.awt.Color(33, 90, 109));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Trash Hunters");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inicia secion como administrador");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(265, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(292, 292, 292))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 110));

        jPanel4.setBackground(new java.awt.Color(60, 162, 162));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(45, 45, 41));
        jLabel4.setText(" ©2024 TrashHunters - MAR");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 57, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Si no tienes una cuanta de administrador, vuelve al menu de inicio y pulsa \"Crear cuenta de administrador\"");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 32, 542, -1));
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 800, 80));

        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        jPanel2.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 490, -1));
        jPanel2.add(txt_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 490, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(45, 45, 41));
        jLabel3.setText("Contraseña");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(45, 45, 41));
        jLabel8.setText("Usuario");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        seleccion_inicio objetoSeleccion = new seleccion_inicio();
        objetoSeleccion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_validarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_validarActionPerformed
        CAdmin objetoAdmin = new CAdmin();
        objetoAdmin.validarAdmin(txt_usuario, txt_contrasenia);
        this.dispose();
    }//GEN-LAST:event_btn_validarActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_validar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField txt_contrasenia;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
