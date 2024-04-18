package apps;

import classes.Pessoa;
import contas.Conta;

public class appConta {
    public static void main(String[] args) throws Exception {
        Pessoa p1, p2;
        Conta c1, c2;
        
        c1 = new Conta();
        p1 = new Pessoa("Fulano", "funalo@email.com");
        
        p2 = new Pessoa();
        c2 = new Conta(654321, p1 , 750.00f);

        p2.setNome("Ciclano" );
        p2.setEmail("ciclano@email.com");

        c1.setNumero(123456);;
        c1.setCorrentista(p2);
        c1.setSaldo(159.99f);
        
        System.out.println("--------------------------------------------");
        System.out.println("Conta número:     " + c1.getNumero());
        System.out.println("Correntista:      " + c1.getCorrentista().getNome());
        System.out.println("Saldo inicial:    " + c1.getSaldo());
        System.out.println("--------------------------------------------");
        
        System.out.println("Conta número:     " + c2.getNumero());
        System.out.println("Correntista:      " + c2.getCorrentista().getNome());
        System.out.println("Saldo inicial:    " + c2.getSaldo());

        if(c2.sacar(750.00f)){
            System.out.println("Saque esfetuado com sucesso. ");
        }else{
            System.out.println("Saque não realizado, salda insuficiente");
        }
        
        c2.depositar(100);

        System.out.println("Novo saldo da conta: " + c2.getSaldo());
    }
}



        