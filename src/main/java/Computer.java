import cpu.CPU;
import memory.SSD;

public abstract class Computer {

    private CPU cpu;
    private SSD ssd;


    public Computer (CPU cpu, SSD ssd) {
        this.cpu = cpu;
        this.ssd = ssd;



    }

    public String checkSpeedCPU () {
        return cpu.processingSpeed ();
    }

    public String checkSpeedSSD () {
        return ssd.transfersData ();
    }



}
