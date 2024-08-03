package one.digitalinovation.gof.subsistema2.cep;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Cidade";
    }

    public String recuperarEstado(String cep){
        return "Estado";
    }
}
