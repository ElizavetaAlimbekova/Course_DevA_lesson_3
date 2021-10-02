import OS.SystemOperation;
import cpu.CPU;
import memory.SSD;

public abstract class Computer {

    private CPU cpu;
    private SSD ssd;
    private SystemOperation os;


    public Computer (CPU cpu, SSD ssd, SystemOperation os) {
        this.cpu = cpu;
        this.ssd = ssd;
        this.os = os;



    }
    @Override
    public String toString () {
        return "cpu, ssd, os";
    }

    public String checkSpeedCPU () {
        return cpu.processingSpeed ();
    }

    public String checkSpeedSSD () {
        return ssd.transfersData ();

    }

    public String checkOS(){
        return os.nameCompany ();
    }



}
