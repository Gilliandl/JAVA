/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author gilli
 */
public class frameMenu extends javax.swing.JFrame {

    /**
     * Creates new form frameMenu
     */
    public frameMenu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        menuFrame = new javax.swing.JMenu();
        menuCliente = new javax.swing.JMenuItem();
        menuMecanico = new javax.swing.JMenuItem();
        menuVeiculo = new javax.swing.JMenuItem();
        menuPeca = new javax.swing.JMenuItem();
        menuOrdemServico = new javax.swing.JMenuItem();
        menuManutencao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuFrame.setText("Arquivos");
        menuFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFrameActionPerformed(evt);
            }
        });

        menuCliente.setText("Cliente");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });
        menuFrame.add(menuCliente);

        menuMecanico.setText("Mecanico");
        menuMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMecanicoActionPerformed(evt);
            }
        });
        menuFrame.add(menuMecanico);

        menuVeiculo.setText("Veiculo");
        menuVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVeiculoActionPerformed(evt);
            }
        });
        menuFrame.add(menuVeiculo);

        menuPeca.setText("Peca");
        menuPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPecaActionPerformed(evt);
            }
        });
        menuFrame.add(menuPeca);

        menuOrdemServico.setText("Ordem Serviço");
        menuOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOrdemServicoActionPerformed(evt);
            }
        });
        menuFrame.add(menuOrdemServico);

        menuManutencao.setText("Manutenção");
        menuManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManutencaoActionPerformed(evt);
            }
        });
        menuFrame.add(menuManutencao);

        jMenuBar1.add(menuFrame);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed
        // TODO add your handling code here:
         new dialogCliente(this, true).setVisible(true);
    }//GEN-LAST:event_menuClienteActionPerformed

    private void menuMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMecanicoActionPerformed
        // TODO add your handling code here:
        new dialogMecanico(this, true).setVisible(true);
    }//GEN-LAST:event_menuMecanicoActionPerformed

    private void menuOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOrdemServicoActionPerformed
        // TODO add your handling code here:
        new dialogOrdemServico(this, true).setVisible(true);
    }//GEN-LAST:event_menuOrdemServicoActionPerformed

    private void menuPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPecaActionPerformed
        // TODO add your handling code here:
        new dialogPeca(this, true).setVisible(true);
    }//GEN-LAST:event_menuPecaActionPerformed

    private void menuVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVeiculoActionPerformed
        // TODO add your handling code here:
        new dialogVeiculo(this, true).setVisible(true);
    }//GEN-LAST:event_menuVeiculoActionPerformed

    private void menuFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuFrameActionPerformed

    private void menuManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManutencaoActionPerformed
        // TODO add your handling code here:
        new dialogManutencao(this, true).setVisible(true);
    }//GEN-LAST:event_menuManutencaoActionPerformed

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
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenu menuFrame;
    private javax.swing.JMenuItem menuManutencao;
    private javax.swing.JMenuItem menuMecanico;
    private javax.swing.JMenuItem menuOrdemServico;
    private javax.swing.JMenuItem menuPeca;
    private javax.swing.JMenuItem menuVeiculo;
    // End of variables declaration//GEN-END:variables
}
