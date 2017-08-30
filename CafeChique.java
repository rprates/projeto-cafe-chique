package modelos;

public class CafeChique extends MaquinaCafe {

    public CafeChique(int porcoes) {
        super(porcoes);
    }

    @Override
    public boolean validarCredito(double credito) {
        return credito>=4;
    }

    @Override
    protected String getMensagem() {
        return "Café chique saindo, patrão!";
    }
    
}
