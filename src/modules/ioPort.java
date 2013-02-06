package modules;



//SIMULASI PUSAT PENGONTROLAN PENERANGAN PADA GEDUNG DENGAN JAVA APPLICATION
//First Project Aris Suryadi SN1 CEP-CCIT Faculty Engineering Univ of Indonesia
//Start Project last january 2006
//ioPort.java

/* Definitions in the build of jnpout32.dll are:            */
/*   short _stdcall Inp32(short PortAddress);               */
/*   void _stdcall Out32(short PortAddress, short data);    */


public class ioPort
{
	// declare native methods of 'jnpout32.dll'
	// output a value to a specified port address
    public native void Out32(int PortAddress, int data);

    // input a value from a specified port address
    public native short Inp32(int PortAddress);

    // load 'jnpout32.dll'
    static { System.loadLibrary("jnpout32");}
}
