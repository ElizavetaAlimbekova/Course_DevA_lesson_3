package memory;

public class NVM implements SSD {
    @Override
    public String transfersData () {
        return "8 Gb/s";
    }

    public String tire () {
        return "PCIe";
    }
}
