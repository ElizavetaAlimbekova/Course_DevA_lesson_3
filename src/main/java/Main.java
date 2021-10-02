import OS.SystemOperation;
import OS.Type2;
import cpu.AMD;
import cpu.IntelCore;
import memory.NVM;
import memory.SATA;



public class Main {


    public static void main (String[] args) {
        AMD amd = new AMD ();
        IntelCore intel = new IntelCore ();

        SATA sata = new SATA ();
        NVM nvm = new NVM ();

         Type2 type2 = new Type2 ();

        Macbook mac = new Macbook (intel, nvm, type2);



        System.out.println (mac.toString ());


    }


}
