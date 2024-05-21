package contas;

import classes.Pessoa;

public class ContaPoupanca extends Conta{
   
    public ContaPoupanca(){
    }
    public ContaPoupanca(int numero, Pessoa correntista, float valor){
        super(numero, correntista, valor);
    }
    
    public boolean sacar(float valor){
        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }




}
