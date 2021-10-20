public class Conta {
    int numeroDaConta;
    Cliente dono ;
    double saldo;
    double limite;

    void imprimir (Conta conta){
        System.out.println ("Dono da conta: " + conta.dono.nome);
        System.out.println ("CPF: " + conta.dono.CPF);
        System.out.println ("Idade: " + conta.dono.idade);
        System.out.println ("Sexo: " + conta.dono.sexo);
        System.out.println ("Enedereço: " + conta.dono.endereco);
        System.out.println ("Numero da conta: " + conta.numeroDaConta);
        System.out.println ("Saldo atual da conta: R$ " + conta.saldo);
        System.out.println ("Limite: R$ " + conta.limite);
    }

    boolean sacar (double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    void depositar (double valor){
        this.saldo += valor;
    }

    boolean transferir (Conta destino, double valor){
        boolean saqueRealizado;
        saqueRealizado = this.sacar(valor);
        if (saqueRealizado){
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

}
