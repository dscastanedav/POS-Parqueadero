/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRONTERA;

/**
 *
 * @author danyy
 */
public class EliminarOperador extends javax.swing.JPanel {

    /**
     * Creates new form EliminarOperador
     */
    public EliminarOperador() {
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
        EliminarUsuarioB = new javax.swing.JButton();
        AtrasB = new javax.swing.JButton();
        UsuarioEliminarTF = new javax.swing.JTextField();
        DatosUsuarioEliminarL = new javax.swing.JLabel();

        PanelPrincipal.setLayout(new java.awt.BorderLayout());

        EliminarUsuarioB.setText("Eliminar ►");
        EliminarUsuarioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarUsuarioBActionPerformed(evt);
            }
        });

        AtrasB.setText("◄ Atrás");
        AtrasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasBActionPerformed(evt);
            }
        });

        UsuarioEliminarTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioEliminarTFActionPerformed(evt);
            }
        });

        DatosUsuarioEliminarL.setText("Por favor suministre el nombre de usuario del operador a eliminar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(AtrasB)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EliminarUsuarioB))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(DatosUsuarioEliminarL))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(131, 131, 131)
                                    .addComponent(UsuarioEliminarTF, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 33, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(DatosUsuarioEliminarL)
                    .addGap(55, 55, 55)
                    .addComponent(UsuarioEliminarTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AtrasB)
                        .addComponent(EliminarUsuarioB))
                    .addGap(16, 16, 16)))
        );

        PanelPrincipal.add(jPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioEliminarTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioEliminarTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioEliminarTFActionPerformed

    private void AtrasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtrasBActionPerformed

    private void EliminarUsuarioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarUsuarioBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarUsuarioBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasB;
    private javax.swing.JLabel DatosUsuarioEliminarL;
    private javax.swing.JButton EliminarUsuarioB;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JTextField UsuarioEliminarTF;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}