package apps;

import classes.Pessoa;
import contas.ContaEspecial;

public class appContaEspecial {
    public static void main(String[] args) {
        
        ContaEspecial e1;
        Pessoa p1 = new Pessoa("Jão Ciclino", "jaociclano@email.com");
        e1 = new ContaEspecial(999999, p1, 0.00f, -1000.00f);

        System.out.println("Saldo inícial da conta: "+ e1.getSaldo());
        System.out.println("O limíte da conta é:"  + e1.getLimite());

        if (e1.sacar(1500.00f)) {  
            System.out.println("Operação de saque realizada com sucesso. ");
        }else{
            System.out.println("Limíte insuficiente para realizar saque.");
        }

        System.out.println("Saldo atual da conta: " + e1.getSaldo());
        e1.descontarTaxaManutencao();
        System.out.println("Saldo após desconto de taxa de manutenção: " + e1.getSaldo());
    }
}
