/*
 * Beandaftar_rumah_sakit.java
 *
 * Created on 07 April 2008, 20:58
 */
package modules.outbox;


import core.gui.InputPanel;


/**
 *
 * @author  SWDEV
 */
 public class BeanOutbox extends InputPanel {

    /** Creates new form BeanForm */
    public BeanOutbox() {
        initComponents();
        super.setPnlUtama(pnlUtama);
        //ApplicationStartup.getInstance().initialize();

    }

    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUtama = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNomorTelpon = new core.dataview.JTextFieldEx();
        txtPesan = new core.dataview.JTextFieldEx();
        txtWaktu = new core.dataview.JTextFieldEx();
        jLabel8 = new javax.swing.JLabel();
        txtWaktu1 = new core.dataview.JTextFieldEx();

        jLabel2.setText("Nomor Telpon");

        jLabel3.setText("Pesan");

        jLabel7.setText("Waktu");

        txtNomorTelpon.setText("jTextFieldEx1");
        txtNomorTelpon.setFieldName("no_telp");

        txtPesan.setText("jTextFieldEx1");
        txtPesan.setFieldName("pesan");

        txtWaktu.setText("jTextFieldEx1");
        txtWaktu.setFieldName("waktu");

        jLabel8.setText("Status");

        txtWaktu1.setText("jTextFieldEx1");
        txtWaktu1.setFieldName("status");

        javax.swing.GroupLayout pnlUtamaLayout = new javax.swing.GroupLayout(pnlUtama);
        pnlUtama.setLayout(pnlUtamaLayout);
        pnlUtamaLayout.setHorizontalGroup(
            pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addGap(77, 77, 77)
                .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUtamaLayout.createSequentialGroup()
                        .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtWaktu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtPesan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtNomorTelpon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(pnlUtamaLayout.createSequentialGroup()
                        .addComponent(txtWaktu1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                        .addGap(32, 32, 32))))
        );
        pnlUtamaLayout.setVerticalGroup(
            pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomorTelpon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUtamaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel7))
                    .addGroup(pnlUtamaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUtamaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel8))
                    .addGroup(pnlUtamaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWaktu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel pnlUtama;
    private core.dataview.JTextFieldEx txtNomorTelpon;
    private core.dataview.JTextFieldEx txtPesan;
    private core.dataview.JTextFieldEx txtWaktu;
    private core.dataview.JTextFieldEx txtWaktu1;
    // End of variables declaration//GEN-END:variables
    @Override
    public void fillControl(String[][] data) {
        
    }

    @Override
    public void clearField() {
        txtNomorTelpon.requestFocus();
    }

    @Override
    public void setVisible(boolean aFlag) {
        if (aFlag) {
        }
        super.setVisible(aFlag);
    }

    @Override
    protected String delegateGetInsertSql() {
        return "";
    }

    @Override
    protected String delegateGetUpdateSql(int rowId) {
        return "";
    }
}
