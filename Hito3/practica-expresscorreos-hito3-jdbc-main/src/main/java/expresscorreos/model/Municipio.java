package expresscorreos.model;

public class Municipio {

    private String NMunicipio;
    private String NProvincia;

    public Municipio(String NMunicipio,String NProvincia){
        this.NMunicipio=NMunicipio;
        this.NProvincia=NProvincia;
    }

    public String getNMunicipio() {
        return NMunicipio;
    }

    public String getNProvincia() {
        return NProvincia;
    }
}
