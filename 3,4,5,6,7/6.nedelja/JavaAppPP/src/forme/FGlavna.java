/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import javax.swing.JDialog;

/**
 *
 * @author student
 */
public class FGlavna extends javax.swing.JFrame {

    /**
     * Creates new form FGlavna
     */
    public FGlavna() {
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
        jmPoslovniPartner = new javax.swing.JMenu();
        jmiPretragaPoslovniPartner = new javax.swing.JMenuItem();
        jmiUnosPoslovniPartner = new javax.swing.JMenuItem();
        jmOAplikaciji = new javax.swing.JMenu();
        jmiOAutoru = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikacija:Poslovni partner");

        jmPoslovniPartner.setText("Poslovni partner");

        jmiPretragaPoslovniPartner.setText("Pretraga");
        jmiPretragaPoslovniPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPretragaPoslovniPartnerActionPerformed(evt);
            }
        });
        jmPoslovniPartner.add(jmiPretragaPoslovniPartner);

        jmiUnosPoslovniPartner.setText("Unos");
        jmiUnosPoslovniPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUnosPoslovniPartnerActionPerformed(evt);
            }
        });
        jmPoslovniPartner.add(jmiUnosPoslovniPartner);

        jMenuBar1.add(jmPoslovniPartner);

        jmOAplikaciji.setText("O aplikaciji");

        jmiOAutoru.setText("O autoru");
        jmOAplikaciji.add(jmiOAutoru);

        jMenuBar1.add(jmOAplikaciji);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiUnosPoslovniPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUnosPoslovniPartnerActionPerformed
        JDialog dialogUnos = new FPoslovniPartner(this, true);
        dialogUnos.setVisible(true);
    }//GEN-LAST:event_jmiUnosPoslovniPartnerActionPerformed

    private void jmiPretragaPoslovniPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPretragaPoslovniPartnerActionPerformed
        JDialog formaZaPretragu = new FPretragaPoslovniPartner(this, true);
        formaZaPretragu.setVisible(true);
    }//GEN-LAST:event_jmiPretragaPoslovniPartnerActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmOAplikaciji;
    private javax.swing.JMenu jmPoslovniPartner;
    private javax.swing.JMenuItem jmiOAutoru;
    private javax.swing.JMenuItem jmiPretragaPoslovniPartner;
    private javax.swing.JMenuItem jmiUnosPoslovniPartner;
    // End of variables declaration//GEN-END:variables
}
