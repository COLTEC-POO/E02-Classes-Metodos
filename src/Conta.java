//Biblio para increment e Random
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

//Essa classe representa os atributos e ações disponíveis para as contas dos clientes.
public class Conta {

    //Função destinada a incrementação automática do ID
    private static final AtomicInteger idCount = new AtomicInteger(0);

    //Atribuir valores randômicos os números de contas
    Random  randAccount = new Random();
    int max_rand = 999999999; // Número máximo levado em consideração pelo random

    //Atributos
    int idAccount;
    Cliente User = new Cliente();
    int numberAccount;
    double saldo;
    double limit;

    //Ações

    //Construtores - definir informações que serão executadas no momento da criação (valores padrão)
    public Conta(){
        idAccount = idCount.incrementAndGet() ;
        numberAccount = randAccount.nextInt(max_rand); //Faltaria fazer um método de verificação de número de conta
        saldo = 5000;
        limit = 60000;
    }

    //Impressão dos dados da conta do cliente
    public void imprimir(){
        System.out.println("Sr(a)." + this.User.NameUser + " o número da sua conta é: " + this.numberAccount);
        System.out.println("Seu saldo atual é de R$" + this.saldo);
        System.out.println("Com o limite disponível de R$" + this.limit);
    }

    //Impressão do Menu de ações
    public void imprimirAcoes(){
        System.out.println();
        System.out.println("Qual operação deseja realizar? ");
        System.out.println("[1] para depósito");
        System.out.println("[2] para saque");
        System.out.println("[3] para imprimir todas as informações da Conta");
        System.out.println("[4] para imprimir todas as informações do Cliente");
        System.out.println("[0] para sair");
    }

    // -------------------------------------- Funções que movimentam o conteúdo da conta -------------------------------------- \\

    //Depositos
   public void deposit(double setValue){
       this.saldo += setValue;
    }

    //Saque de valores
   public boolean withdrawMoney(double setvalue){
      if (setvalue <= this.saldo){
            this.saldo -= setvalue;
            return true;
        } else {
            return false;
        }
    }

    //Transferência de valores - Não apricável
    public boolean transfer(Conta destinyAccount, double value){
        //Verifica se o valor da transferência é menor ou igual ao valor do saldo da conta
        //Se for, o "saque" é realizado
        boolean withdraw = this.withdrawMoney(value);

        //Verifica se foi possível realizar o saque
        if(withdraw) {
            destinyAccount.deposit(value); //Se foi possível realizar o saque, o valor sacado é agora depositado na conta destino
            return true;
        }else {
            return false;
        }
    }


}
