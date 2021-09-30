package memory;

public class SATA implements SSD {

    @Override
    public String transfersData () {
        return "550 Mb/s";
    }

    public String connectionType () {
        return "SATA 3";
    }

}
