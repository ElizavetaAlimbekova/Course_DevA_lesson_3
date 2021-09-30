import cpu.AMD;
import cpu.CPU;
import cpu.IntelCore;
import memory.NVM;
import memory.SATA;
import memory.SSD;


public class Main {


    public static void main (String [] args){
        AMD amd = new AMD ();
        IntelCore intel= new IntelCore ();

        SATA sata = new SATA ();
        NVM nvm = new NVM ();

        Macbook mac = new Macbook (intel,nvm);

        mac.checkSpeedCPU ();
        mac.checkSpeedSSD ();


        System.out.println ("Характеристики MacBook Pro");
        System.out.println ("CPU: " + mac.checkSpeedCPU ());
        System.out.println ("Скорость передачи данных SSD: " + mac.checkSpeedSSD ());












    }


}
