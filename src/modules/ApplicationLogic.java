package modules;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author SWDEV
 */
public class ApplicationLogic {

    private static ApplicationLogic instance = null;

    public static ApplicationLogic getInstance() {
        if (instance == null) {
            instance = new ApplicationLogic();
        }
        return instance;
    }

    private ApplicationLogic() {
    }

    public String getDeleteTiketPemesanan(String idtiket_pemesanan) {
        return "delete from tiket_pemesanan where idtiket_pemesanan=" + idtiket_pemesanan;
    }

    public String getInsertTiketPemesanan(String idTiket, String idpelanggan, String tanggal, String kode_tiket) {
        return "insert into tiket_pemesanan(idtiket,idpelanggan,tanggal,nomor_tiket) values(" + idTiket + "," + idpelanggan + ",'" + tanggal + "','" + kode_tiket + "')";
    }

    public String getNomorTiket(String kode_tujuan) {
        return kode_tujuan + "-" + getNomorTiket();
    }

    public String getQueryPelangganForHP(String noHp) {
        return "SELECT * FROM pelanggan where hp='" + noHp + "'";
    }

    public String getInsertPelanggan(String nama, String pin, String hp, String alamat) {
        String sql = "insert into pelanggan(nama,pin,hp,alamat) values('" + nama + "','" + pin + "','" + hp + "','" + alamat + "')";
        return sql;
    }

    public String getQueryDaftarTiket() {
        return "SELECT * FROM daftar_tiket ";
    }

    public String getQueryInbox() {
        return "select ID,no_telp,pesan,waktu from sms_inbox Order BY waktu desc";
    }

    public String getQueryOutbox() {
        return "select ID,no_telp,pesan,status,waktu from sms_outbox Order BY waktu desc";
    }

    public String getQueryPeralatan() {
        return "SELECT id,nama,pin,keterangan,status from peralatan Order BY nama";
    }

    public String getNomorTiket() {
        return "" + (long) (1000000 + (Math.random() * 1000000));
    }

    public String getQueryPemesananTiket(String idtiket) {
        return "SELECT tiket_pemesanan.id,nomor_tiket,tiket_pemesanan.tanggal ,nama FROM tiket_pemesanan,tiket,pelanggan where tiket.id = tiket_pemesanan.idtiket and tiket_pemesanan.idpelanggan = pelanggan.id and tiket.id="+idtiket;
    }

    public String getQueryTiketPadaTanggalDanTujuan(String tanggal, String kode_tujuan) {
        return "select tiket.id, tiket.total_tiket-tiket_terbeli as sisa,tiket_terbeli from tiket,tujuan where tiket.idtujuan and tujuan.idtujuan=tiket.idtujuan and  kode_tujuan='" + kode_tujuan + "' and tiket.tanggal='" + tanggal + "'";
    }

    public String getQueryTiketPadaTanggalDanTujuanUntukPelangganTertentu(String tanggal, String kode_tujuan, String idpelanggan) {
        return "select tiket.id from tiket,tiket_pemesanan,tujuan where tiket_pemesanan.idtiket=tiket.id and tujuan.idtujuan=tiket.idtujuan and  kode_tujuan='" + kode_tujuan + "' and tiket.tanggal='" + tanggal + "' and idpelanggan=" + idpelanggan;
    }

    public String getUpdatePemesananBertambah(String idTiket, int tiket_terbeli) {
        return "update tiket set tiket_terbeli=" + (tiket_terbeli + 1) + " where id=" + idTiket;
    }
    
    public String getUpdatePemesananBerkurang(String idTiket, int tiket_terbeli) {
        return "update tiket set tiket_terbeli=" + (tiket_terbeli - 1) + " where id=" + idTiket;
    }
}
