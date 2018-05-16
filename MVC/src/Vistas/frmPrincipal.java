/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;
import java.io.*;

/**
 *
 * @author PROGRAMACION 2do A
 */
public class frmPrincipal extends javax.swing.JFrame
{

    /**
     * Creates new form frmPrincipal
     */
    String strNombre;
    String strApellido;
    String strCedula;

    public frmPrincipal()
    {
        initComponents();
    }

    public frmPrincipal(String strNom, String strApe, String strCedu)
    {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        strNombre = strNom;
        strApellido = strApe;
        strCedula = strCedu;
        lblNombre.setText(strNombre);
        lblApellido.setText(strApellido);
        lblCedula.setText(strCedula);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        btnEstudiante = new javax.swing.JButton();
        btnDocente = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnMateria = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bienvenido al sistema");

        lblNombre.setText("Nombre");

        lblApellido.setText("Apellido");

        lblCedula.setText("Cedula");

        btnEstudiante.setText("Estudiante");
        btnEstudiante.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEstudianteActionPerformed(evt);
            }
        });

        btnDocente.setText("Docente");
        btnDocente.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDocenteActionPerformed(evt);
            }
        });

        btnUsuario.setText("Usuario");
        btnUsuario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnMateria.setText("Materia");
        btnMateria.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMateriaActionPerformed(evt);
            }
        });

        jLabel2.setText("ADMINISTAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblNombre)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnUsuario)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEstudiante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDocente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMateria))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblApellido)
                        .addGap(18, 18, 18)
                        .addComponent(lblCedula))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombre)
                        .addComponent(lblCedula)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEstudiante)
                    .addComponent(btnDocente)
                    .addComponent(btnMateria)
                    .addComponent(btnUsuario))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstudianteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEstudianteActionPerformed
    {//GEN-HEADEREND:event_btnEstudianteActionPerformed
      frmAdminEstu frmEstu = new frmAdminEstu();
      frmEstu.setVisible(true);
       
    }//GEN-LAST:event_btnEstudianteActionPerformed

    private void btnDocenteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDocenteActionPerformed
    {//GEN-HEADEREND:event_btnDocenteActionPerformed
        frmAdminDoc frmDoc = new frmAdminDoc();
        frmDoc.setVisible(true);
    }//GEN-LAST:event_btnDocenteActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUsuarioActionPerformed
    {//GEN-HEADEREND:event_btnUsuarioActionPerformed
        frmAdminUser frmAdm = new frmAdminUser();
       frmAdm.setVisible(true);
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnMateriaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMateriaActionPerformed
    {//GEN-HEADEREND:event_btnMateriaActionPerformed
        frmAdminMat frmMat = new frmAdminMat();
        frmMat.setVisible(true);
    }//GEN-LAST:event_btnMateriaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDocente;
    private javax.swing.JButton btnEstudiante;
    private javax.swing.JButton btnMateria;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
