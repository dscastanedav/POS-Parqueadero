/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRONTERA;

import ENTIDAD.*;
import CONTROL.*;
/**
 *
 * @author Estudiante
 */
public class IniciarSesionAdmintrador extends javax.swing.JPanel {

    private AdministradorPrincipal administradorPrincipal = new AdministradorPrincipal();
    private PerdidaContrasena perdidaContrasena = new PerdidaContrasena();
    public static InicioAdministrador inicioAdministrador = new InicioAdministrador();

    /**
     * Creates new form IniciarSesionAdmintrador
     */
    public IniciarSesionAdmintrador() {
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

        PanelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        IntroduzcaSusDatosTF = new javax.swing.JLabel();
        UsuarioIngresarAdministradorL = new javax.swing.JLabel();
        ContrasenaIngresoAdministradorL = new javax.swing.JLabel();
        UsuarioIngresarAdministradorTF = new javax.swing.JTextField();
        AtrasB = new javax.swing.JButton();
        IngresarAdministradorB = new javax.swing.JButton();
        ContrasenaIngresoAdministradorTF = new javax.swing.JPasswordField();
        RecuperarAdministradorB = new javax.swing.JButton();

        PanelPrincipal.setLayout(new java.awt.BorderLayout());

        IntroduzcaSusDatosTF.setText("Por favor introduzca sus datos");

        UsuarioIngresarAdministradorL.setText("Nombre de usuario:");

        ContrasenaIngresoAdministradorL.setText("Contraseña:");

        AtrasB.setText("◄ Atras");
        AtrasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasBActionPerformed(evt);
            }
        });

        IngresarAdministradorB.setText("Ingresar ►");
        IngresarAdministradorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarAdministradorBActionPerformed(evt);
            }
        });

        RecuperarAdministradorB.setText("¿Olvidó su contraseña ó nombre de usuario? ►");
        RecuperarAdministradorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecuperarAdministradorBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AtrasB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IngresarAdministradorB))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(IntroduzcaSusDatosTF))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(79, 79, 79)
                                    .addComponent(RecuperarAdministradorB))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(62, 62, 62)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(UsuarioIngresarAdministradorL)
                                        .addComponent(ContrasenaIngresoAdministradorL))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ContrasenaIngresoAdministradorTF, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                        .addComponent(UsuarioIngresarAdministradorTF)))))
                        .addGap(0, 81, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IntroduzcaSusDatosTF)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsuarioIngresarAdministradorL)
                    .addComponent(UsuarioIngresarAdministradorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContrasenaIngresoAdministradorL)
                    .addComponent(ContrasenaIngresoAdministradorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(RecuperarAdministradorB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AtrasB)
                    .addComponent(IngresarAdministradorB))
                .addContainerGap())
        );

        PanelPrincipal.add(jPanel1, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RecuperarAdministradorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecuperarAdministradorBActionPerformed
        // TODO add your handling code here:
        PanelPrincipal.setVisible(false);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(perdidaContrasena);
        PanelPrincipal.setVisible(true);
    }//GEN-LAST:event_RecuperarAdministradorBActionPerformed

    private void AtrasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasBActionPerformed
        // TODO add your handling code here:
        PanelPrincipal.setVisible(false);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(inicioAdministrador);
        PanelPrincipal.setVisible(true);
    }//GEN-LAST:event_AtrasBActionPerformed

    private void IngresarAdministradorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarAdministradorBActionPerformed
        // TODO add your handling code here:
        Administrador administrador = new Administrador();
        administrador.setUsuarioAdministrador(UsuarioIngresarAdministradorTF.getText());
        administrador.setContraseñaAdministrador(ContrasenaIngresoAdministradorTF.getText());
        CrearAdministrador crear = new CrearAdministrador();
        System.out.println("-------------");
        String resultado = crear.verificarLogin(administrador);
        if(resultado.equals("Ya Registrado")){
            PanelPrincipal.setVisible(false);
            PanelPrincipal.removeAll();
            PanelPrincipal.add(administradorPrincipal);
            PanelPrincipal.setVisible(true);       
        }
        System.out.println(resultado);
//        PanelPrincipal.setVisible(false);
//        PanelPrincipal.removeAll();
//        PanelPrincipal.add(administradorPrincipal);
//        PanelPrincipal.setVisible(true);
    }//GEN-LAST:event_IngresarAdministradorBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasB;
    private javax.swing.JLabel ContrasenaIngresoAdministradorL;
    private javax.swing.JPasswordField ContrasenaIngresoAdministradorTF;
    private javax.swing.JButton IngresarAdministradorB;
    private javax.swing.JLabel IntroduzcaSusDatosTF;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton RecuperarAdministradorB;
    private javax.swing.JLabel UsuarioIngresarAdministradorL;
    private javax.swing.JTextField UsuarioIngresarAdministradorTF;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}