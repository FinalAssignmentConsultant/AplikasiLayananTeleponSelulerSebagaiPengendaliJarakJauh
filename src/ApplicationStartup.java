

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import core.system.ApplicationInfo;
import core.system.DB;
import core.system.LoggingWindow;
import core.system.SplashFrame;
import core.system.Startup;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

//import modules.MainFrame;
//import modules.smsgateway.PengendaliJarakJauhSmsProcessing;
import smsgateway.ATCommand;
import smsgateway.SMS;

/**
 *
 * @author SWDEV
 */
public class ApplicationStartup {

    private static ApplicationStartup instance;

    public static ApplicationStartup getInstance() {
        if (instance == null) {
            instance = new ApplicationStartup();
        }
        return instance;
    }

    public static void main(String arg[]) {
        try {
            LoggingWindow.getInstance().addToLog("System Startup");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            ApplicationInfo.TITLE = "SMS Server";
            ApplicationInfo.AUTHOR = "SWDEV";
            ApplicationInfo.VERSION = "2008";
            ApplicationInfo.ROOT_PASSWORD = "muhammad";
            ApplicationInfo.OFFICIAL_NAME = "SMS Server";

//            DB.USE_MYSQL = arg[0].equals("yes");
           // DB.DB = arg[1];
           // DB.USER_NAME = arg[2];
           // DB.PASSWORD = arg[3];

            getInstance().initialize();
//            ATCommand.getSingleton().setSendPolicy(arg[4]);
  //          ATCommand.getSingleton().setResponseMessage(arg[5]);
            SMS.getSingleton().setSmsProcessing(PengendaliJarakJauhSmsProcessing.getInstance());
            LoggingWindow.getInstance().addToLog("Main Window Initialization");
            Startup.getInstance().setMainFrame(MainFrame.getInstance());
            //SplashFrame.splashIcon = new ImageIcon(MainFrame.getInstance().getClass().getResource("/images/SPLASH.jpg"));
            Startup.getInstance().start();

            ControllParport.getInstance().matikanSemua();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ApplicationStartup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ApplicationStartup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ApplicationStartup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ApplicationStartup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void initialize() {
        ApplicationInfo.TITLE = "Aplikasi Layanan SMS Telepon Seluler Sebagai Pengendali Jarak Jauh Peralatan Listrik Bebasis Komputer";
        ApplicationInfo.AUTHOR = "Chandra Martha";
        ApplicationInfo.VERSION = "2008";
        ApplicationInfo.ROOT_PASSWORD = "muhammad";
        ApplicationInfo.OFFICIAL_NAME = "Aplikasi SMS Gateway";
        DB.USE_MYSQL = true;
        DB.DB = "chandra-ilkomp";
        DB.PASSWORD = "";//12345678";
        ATCommand.getSingleton().setSendPolicy("full");
        ATCommand.getSingleton().setResponseMessage("response");
    }
}
