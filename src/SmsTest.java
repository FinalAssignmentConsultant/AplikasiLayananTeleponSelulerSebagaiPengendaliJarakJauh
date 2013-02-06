
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import core.system.DB;
import smsgateway.SMS;

/**
 *
 * @author SWDEV
 */
public class SmsTest {
//ini adalah code simulasi untuk pengecekan apakah sms sudahberhasil dijalankan or not
    public static void main(String arg[]) {
        DB.DB = "chandra-ilkomp";
        DB.USE_MYSQL = true;
        DB.PASSWORD = "";
        SMS.getSingleton().setSmsProcessing(PengendaliJarakJauhSmsProcessing.getInstance());
        DB.getInstance().executeQuery("delete from sms_outbox where status='p0'");
        SMS.getSingleton().setIncomingPhoneNumber("6281373408466");
        System.out.println(SMS.getSingleton().messageProcessing("help"));
        System.out.println(SMS.getSingleton().messageProcessing("status 9 muhammad"));
        System.out.println(SMS.getSingleton().messageProcessing("status 9 islam"));
        System.out.println(SMS.getSingleton().messageProcessing("hidupkan 2 muhammad"));
        System.out.println(SMS.getSingleton().messageProcessing("MATIKAn 2 muhammad"));
        System.out.println(SMS.getSingleton().messageProcessing("MATIKAn 5 muhammad"));
        System.exit(0);
        // MENSIMULASIKAN SMS YG DIKIRM PEMAKAI, DAN SMS BALASAN SISTEM
    }
}
