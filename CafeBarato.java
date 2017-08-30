package modelos;

public class CafeBarato extends MaquinaCafe {

    public CafeBarato(int porcoes) {
        super(porcoes);
    }

    @Override
    public boolean validarCredito(double credito) {
        return (credito>=1.5);
    }

    @Override
    protected String getMensagem() {
        return "Café simples saindo.";
    }
    
}
