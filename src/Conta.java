import java.util.Scanner;

public class Conta {
    int numero;
    Cliente dono;
    double saldo;
    double limite;


    // Método construtor da classe Conta

        Conta(int numero, Cliente dono, double saldo, double limite) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.limite = limite;
    }

    // Método para sacar o valor x de uma conta.

    void sacar (Scanner input) {

        System.out.print("Digite o valor que deseja sacar da conta de " + this.dono.nome + ": ");
        double valor = input.nextDouble();
    
        if (this.saldo > 0 && valor <= saldo && valor > 0) {
            this.saldo = saldo - valor;
            System.out.println("Saque de " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro ao tentar sacar o valor de " + valor);
        }
        System.out.println("Saldo atual da conta de " + this.dono.nome + ": " + this.saldo); 

    }

    // Método para depositar o valor x de uma conta.

    void depositar (Scanner input) {

        System.out.print("Digite o valor que deseja depositar na conta de " + this.dono.nome + ": ");
        double valor = input.nextDouble();

        if (valor > 0) {
            this.saldo += valor;
            System.out.println(valor + " depositado com sucesso!");
            System.out.println("Saldo atual da conta de " + this.dono.nome + ": " + this.saldo);
        } else {
            System.out.println("Erro ao realizar o depósito!");
        }
    }


    // Método para transferir o valor x de uma conta para outra.

    void transferir (Conta destino, Scanner input) {

        System.out.print("Digite o valor que deseja transferir da conta de " + this.dono.nome + " para " + destino.dono.nome + ": ");
        double valor = input.nextDouble();
        
        if (valor < 0 && valor > this.saldo) {
            System.out.println("Não foi possível realizar a transferência.");
        }

        if (valor <= this.saldo) {
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Valor transferido da conta de " + this.dono.nome + " para a conta de " + destino.dono.nome + ": " + valor);
            System.out.println("Saldo atual da conta de " + this.dono.nome + ": " + this.saldo);
            System.out.println("Saldo atual da conta de " + destino.dono.nome +  ": " + destino.saldo);   
        } else {
            System.out.println("Não foi possível realizar a transação.");
        }

    }

    // Método para mostrar as informações da conta (Exercício 2)

    void imprimeConta () {
        System.out.println("Dados da conta do usuário " + this.dono.nome + ": ");
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("Limite atual: " + this.limite);
    }
}
