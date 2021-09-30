package cpu;

import cpu.CPU;

public class IntelCore implements CPU {


    @Override
    public String processingSpeed () {
        return "2,6 MHz";
    }

    public String graphicsCore () {
        return "350 MHz";
    }


}
