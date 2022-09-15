public class Conta {

    Cliente dono;
    int numConta;
    double saldo;
    double limite;

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public boolean sacar(double valor){

        if (valor <= this.saldo){
            this.saldo = this.saldo - valor;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean transferir (Conta destino, double valor){
        boolean saqueRealizado = this.sacar(valor);

        if (saqueRealizado){
            destino.depositar(valor);
            return true;

        }else {
            return false;
        }
    }

    public void imprimir(){

        System.out.println("Nome do dono da conta: " + this.dono.nome);
        System.out.println("Número da conta: " + this.numConta);
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("Limite: " + this.limite);
        System.out.println("CPF: " + this.dono.cpf);
        System.out.println("Endereco: " + this.dono.endereco);
        System.out.println("Idade: " + this.dono.idade);
        System.out.println("Sexo: " + this.dono.sexo);
        System.out.println("-------------------------------------------");

    }
}