package modelos;

public abstract class MaquinaCafe {
    
    private int porcoes;
    
    public MaquinaCafe(int porcoes) {
        this.porcoes = porcoes;
    }
    
    public int getPorcoes() {
        return this.porcoes;
    }
    
    public abstract boolean validarCredito(double credito);
    
    protected abstract String getMensagem();
    
    public String produzirExpresso(double credito) {
        if(porcoes==0) {
            return "Não há mais café na maquina.";
        } else {
            if(this.validarCredito(credito)) {
               this.porcoes--;
               return getMensagem(); 
            } else {
                return "Valor insuficiente para comprar café.";
            }
        }
    }
    
}
