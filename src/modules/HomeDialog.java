package modules;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * KonfigurasiDialog.java
 *
 * Created on Jan 8, 2009, 12:35:09 AM
 */


//import modules.konfigurasi.*;
import core.system.DB;
import core.system.Startup;

/**
 *
 * @author Eko SW
 */
public class HomeDialog extends javax.swing.JDialog {

    private static HomeDialog instance = null;

    public static HomeDialog getInstance() {
        if (instance == null) {
            instance = new HomeDialog(Startup.getInstance().getMainFrame(), true);
            instance.initField();
        }
        return instance;
    }

    /** Creates new form KonfigurasiDialog */
    private HomeDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnPMK = new javax.swing.JButton();
        btnPMTS = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Home");
        setBackground(java.awt.Color.cyan);

        jLabel1.setText("Aplikasi Layanan SMS Telepon Seluler Sebagai Pengendali Jarak Jauh");

        btnPMK.setText("Pengendalian Melalui Komputer");
        btnPMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPMKActionPerformed(evt);
            }
        });

        btnPMTS.setText("Pengendalian Melalui Telepon Seluler");
        btnPMTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPMTSActionPerformed(evt);
            }
        });

        jLabel2.setText("Menu Utama (^_^)");

        jLabel3.setText("Peralatan Listrik Berbasis Komputer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnPMK, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPMTS)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addContainerGap(449, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPMK, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPMTS, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-550)/2, (screenSize.height-345)/2, 550, 345);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPMKActionPerformed
      //  DB.getInstance().update("konfigurasi", "password='" + txtPassword.getText() + "'", "");
      // DB.getInstance().update("konfigurasi", "nomor_hp='" + txtNomorHP.getText() + "'", "");
      // this.setVisible(false);
}//GEN-LAST:event_btnPMKActionPerformed

    private void btnPMTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPMTSActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_btnPMTSActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                HomeDialog dialog = new HomeDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
        if (b) {
            initField();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPMK;
    private javax.swing.JButton btnPMTS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    private void initField() {
     //   System.out.println("read");
     //   String[][] konfig = DB.getInstance().getDataSet("select password,nomor_hp from konfigurasi", false);
     //   if (konfig.length > 0) {
     //       txtPassword.setText(konfig[0][0]);
     //       txtNomorHP.setText(konfig[0][1]);
       // }
    }
}
