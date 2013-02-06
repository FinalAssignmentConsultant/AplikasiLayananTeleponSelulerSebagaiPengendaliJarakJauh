
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import core.system.DB;
import java.util.Date;
import modules.ApplicationLogic;
import smsgateway.SMS;
import smsgateway.SMSProcessing;

/**
 * Ini adalah kelas yg bertanggung jawab u/ menangani perintah2 SMS. Berikut
 * adalah daftar perintah sms-nya:
 * 
 * REG nama alamat
 * 
 * @author Wahyu
 */
public class PengendaliJarakJauhSmsProcessing implements SMSProcessing {

    private static PengendaliJarakJauhSmsProcessing instance = null;

    public static PengendaliJarakJauhSmsProcessing getInstance() {
        if (instance == null) {
            instance = new PengendaliJarakJauhSmsProcessing();
        }
        return instance;
    }

    private PengendaliJarakJauhSmsProcessing() {
        SMS.getSingleton().setDelimiter(" ");
    }

    public String delegateMessageProcessing(java.lang.String[] token, java.lang.String incomingPhoneNumber) {
        final String perintah = token[0].trim();
        final int ntoken = token.length;
        String hasil = "Perintah " + perintah + " tidak dikenal";
        String passwordSystem = DB.getInstance().findId("konfigurasi", "password", "");
        String hpSystem = DB.getInstance().findId("konfigurasi", "nomor_hp", "");

        if ("".equals(passwordSystem)) {
            return "Password Anda belum diset. Mohon dicek untuk keamanan";
        }

        if (!incomingPhoneNumber.equals(hpSystem)) {
            return "Maaf, Nomor HP ini bukan pemilik sistem yang sah. Gunakan nomor Handphone yang tedaftar sebagai pemilik";
        }

        if ("HELP".equals(perintah)) {
            if (ntoken == 2) {

                if (!passwordSystem.equalsIgnoreCase(token[1])) {
                    return "Maaf, Anda bukan pemakai yang berhak. Anda harus menyertakan password yang benar.";
                }

                return "Kode perintah yang tersedia adalah STATUS, HIDUPKAN, MATIKAN dan HELP. Ketikkan perintah HELP#perintah untuk mendapatkan penjelasan lengkap";
            } else if (ntoken == 3) {

                if (!passwordSystem.equalsIgnoreCase(token[2])) {
                    return "Maaf, password Anda salah. Sertakan password yang benar.";
                }

                String keyword = token[1].trim();
                return helpDescription(keyword);
            } else {
                return helpDescription(perintah);
            }
        } else if ("HIDUPKAN".equals(perintah)) {
            System.out.println("ntoken = "+ntoken);
            if (ntoken != 3) {
                return helpDescription(perintah);
            }

            if (!passwordSystem.equalsIgnoreCase(token[2])) {
                return "Maaf, password Anda salah. Sertakan password yang benar.";
            }
            int nomorAlat = Integer.parseInt(token[1]);
            ControllParport.getInstance().on(nomorAlat);
            return "Alat ke " + token[1] + " sudah dihidupkan";

        } else if ("MATIKAN".equals(perintah)) {

            if (ntoken != 3) {
                return helpDescription(perintah);
            }
            if (!passwordSystem.equalsIgnoreCase(token[2])) {
                return "Maaf, password Anda salah. Sertakan password yang benar.";
            }
            int nomorAlat = Integer.parseInt(token[1]);
            ControllParport.getInstance().off(nomorAlat);
            return "Alat ke " + token[1] + " sudah dimatikan";
        } else if ("STATUS".equals(perintah)) {
            if (ntoken != 3) {
                return helpDescription(perintah);
            }
            if (!passwordSystem.equalsIgnoreCase(token[2])) {
                return "Maaf, password Anda salah. Sertakan password yang benar.";
            }
            String status[][]=DB.getInstance().getDataSet("select statusAlat"+token[1]+" from konfigurasi", false);
            final String statusnya = status[0][0].equals("1") ? "hidup" : "mati";
            return "Status alat ke " + token[1] + " adalah " +statusnya;
        }
        return hasil;
    }

    public void afterModemInstalled() {
    }

    public static void main(String arg[]) {
        PengendaliJarakJauhSmsProcessing s = new PengendaliJarakJauhSmsProcessing();
        s.afterModemInstalled();
    }

    private String helpDescription(String perintah) {
        if (perintah.equals("STATUS")) {
            return "Format : STATUS<spasi>ALAT1..12<spasi>PASSWORD. Contoh, STATUS 7 xxx, untuk mengecek status ALAT ke 7";
        } else if (perintah.equals("HIDUPKAN")) {
            return "Format : HIDUPKAN<spasi>ALAT1..12<spasi>PASSWORD. Contoh, HIDUPKAN 7 xxx, untuk menghidupkan ALAT ke 7";
        } else if (perintah.equals("HELP")) {
            return "Aplikasi ini akan mengecek status/menghidupkan/mematikan peralatan listrik via SMS. Perintah yang dikenal STATUS,HIDUPKAN,MATIKAN dan HELP. Ketik HELP<spasi>Nama Perintah untuk detail perintah";
        } else if (perintah.equals("MATIKAN")) {
            return "Format : MATIKAN<spasi>ALAT1..12<spasi>PASSWORD. Contoh, MATIKAN 7 xxx, untuk mematikan ALAT ke 7";
        }
        return perintah + " bukan bagian dari perintah aplikasi ini. Ketikkan HELP untuk melihat semua daftar perintah";
    }
}


