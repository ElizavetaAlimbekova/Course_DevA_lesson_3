package cpu;

public class AMD implements CPU {
    @Override
    public String processingSpeed () {
        return "3,4 MHz";
    }

    public String numberOfCores () {
        return "6";
    }

    public String streams () {
        return "12";
    }

}
