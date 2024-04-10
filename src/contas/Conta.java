// https://www.youtube.com/watch?v=IEkYU2sDXPo&list=PLqmCwMNmP1Ix0MMUoBHsCY7Fyzk2kotbg&index=9

package contas;

import classes.Pessoa;

public abstract class Conta {
    protected int numero;
    protected Pessoa correntista;
    protected float saldo;
    private static int numero_contas;
    public final static int SACAR = 0;
    public final static int DEPOSITAR = 1;
   

    
    public Conta(){ 
        incrementaContas();
    }
    public Conta(int numero, Pessoa correntista, float valor){ 
        this();
        this.setNumero(numero);
        this.setCorrentista(correntista);
        this.setSaldo(valor);
    }

    public final int getNumero() {
        return numero;
    }
    public final void setNumero(int numero) {
        this.numero = numero;
    }

    public final Pessoa getCorrentista() {
        return correntista;
    }
    public final void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }

    public final float getSaldo() {
        return saldo;
    }
    public final void setSaldo(float valor) {
        this.saldo = valor;
    }

    public int getNumeroContas(){
        return Conta.numero_contas;
    }



//Métodos 
public final void depositar(float valor){
    this.setSaldo(this.getSaldo() + valor);
}
public abstract boolean sacar(float valor);

public boolean movimentar(float valor, int operacao){
    boolean returno = true;
    switch (operacao) {
        case DEPOSITAR:
            this.depositar(valor);
            break;
        case SACAR:
            returno = this.sacar(valor);
            break;
        default:
            returno = false;
    }
    return returno;
}




private static void incrementaContas(){
    ++numero_contas;
}


 
}