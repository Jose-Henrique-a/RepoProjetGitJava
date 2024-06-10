package contas;

import classes.Pessoa;
import classes.Taxas;

public final class ContaEspecial extends Conta implements Taxas{
    private float limite;
// Construtor 
    public ContaEspecial(){
    }
    
    public ContaEspecial(int numero, Pessoa correntista, float valor, float limite){
        super(numero, correntista, valor);
        this.setLimite(limite);
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite){
        this.limite = limite;
    }

    public boolean sacar(float valor){
        if(this.getSaldo() - valor >= this.getLimite()){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }else{
            return false;
        }
    }

    public float getTaxaManutencao(){
        return 15.00f;
    }
    public void descontarTaxaManutencao(){
        this.setSaldo(this.getSaldo()- this.getTaxaManutencao());
    }







}
