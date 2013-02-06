
import core.system.DB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*ControllParport.java written feb 2nd 2008*/
public class ControllParport  {
    ioPort pp ;
    private static ControllParport instance = null;

    public static ControllParport getInstance() {
        if(instance==null) instance = new ControllParport();
        return instance;
    }
    private ControllParport() {

        pp = new ioPort();
    }

    public void matikanSemua() {
        for(int i=1;i<=12;i++)off(i);
    }

    private void set_bit(int address_port, int number_bit) {
        int value, status_port, new_value;
        value = 0;
        new_value = 0;
        switch (number_bit) {
            case 0:
                value = 1;
                break;
            case 1:
                value = 2;
                break;
            case 2:
                value = 4;
                break;
            case 3:
                value = 8;
                break;
            case 4:
                value = 16;
                break;
            case 5:
                value = 32;
                break;
            case 6:
                value = 64;
                break;
            case 7:
                value = 128;
                break;
        }
        status_port = pp.Inp32(address_port);
        new_value = status_port | value;
        pp.Out32(address_port, new_value);
    }

    private void clear_bit(int address_port, int number_bit) {
        int value, status_port, new_value;
        value = 0;
        new_value = 0;
        switch (number_bit) {
            case 0:
                value = 254;
                break;
            case 1:
                value = 253;
                break;
            case 2:
                value = 251;
                break;
            case 3:
                value = 247;
                break;
            case 4:
                value = 239;
                break;
            case 5:
                value = 223;
                break;
            case 6:
                value = 191;
                break;
            case 7:
                value = 127;
                break;
        }
        status_port = pp.Inp32(address_port);
        new_value = status_port & value;
        pp.Out32(address_port, new_value);
    }

    public void on(int nomorAlat){
        try {
            switch (nomorAlat) {
                case 1:
                    clear_bit(0x37A, 1);
                    break;
                case 2:
                    clear_bit(0x37A, 0);
                    break;
                case 3:
                    set_bit(0x378, 0);
                    break;
                case 4:
                    set_bit(0x378, 1);
                    break;
                case 5:
                    set_bit(0x378, 2);
                    break;
                case 6:
                    set_bit(0x378, 3);
                    break;
                case 7:
                    set_bit(0x378, 4);
                    break;
                case 8:
                    set_bit(0x378, 5);
                    break;
                case 9:
                    set_bit(0x378, 6);
                    break;
                case 10:
                    set_bit(0x378, 7);
                    break;
                case 11:
                    set_bit(0x37A, 2);
                    break;
                case 12:
                    clear_bit(0x37A, 3);
                    break;
            }
            java.sql.PreparedStatement p = DB.getInstance().getConnection().prepareStatement("update konfigurasi set statusAlat" + nomorAlat + " = true");
            p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControllParport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void off(int nomorAlat){
        try {
            
            switch (nomorAlat) {
                case 1:
                    set_bit(0x37A, 1);
                    break;
                case 2:
                    set_bit(0x37A, 0);
                    break;
                case 3:
                    clear_bit(0x378, 0);
                    break;
                case 4:
                    clear_bit(0x378, 1);
                    break;
                case 5:
                    clear_bit(0x378, 2);
                    break;
                case 6:
                    clear_bit(0x378, 3);
                    break;
                case 7:
                    clear_bit(0x378, 4);
                    break;
                case 8:
                    clear_bit(0x378, 5);
                    break;
                case 9:
                    clear_bit(0x378, 6);
                    break;
                case 10:
                    clear_bit(0x378, 7);
                    break;
                case 11:
                    clear_bit(0x37A, 2);
                    break;
                case 12:
                    set_bit(0x37A, 3);
                    break;
            }
            java.sql.PreparedStatement p = DB.getInstance().getConnection().prepareStatement("update konfigurasi set statusAlat" + nomorAlat + " = false");
            p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControllParport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
   
}
