package expresscorreos.model;

public class Oficina {

    private String Cod_O;
    private String NMunicipio;
    private String Cod_CC;

    public Oficina(String Cod_O,String NMunicipio, String Cod_CC){
        this.Cod_CC=Cod_CC;
        this.Cod_O=Cod_O;
        this.NMunicipio=NMunicipio;
    }

    public String getCod_O() {
        return Cod_O;
    }

    public String getCod_CC() {
        return Cod_CC;
    }

    public String getNMunicipio() {
        return NMunicipio;
    }
}
