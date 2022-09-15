public class Conta {
    // Atributos
    Cliente dono = new Cliente();
    public int numeroConta;
    public double saldo;
    public double limite;

    //Construtor

    public Conta(){
        dono.nome = "-------";
        dono.cpf = "00000000000";
        dono.idade = 0;
        dono.endereco = "---------";
        dono.sexo = '-';
        numeroConta = 0;
        saldo = 0;
        limite = 0;
    }

    // Metodos

    public void imprimeDadosUsuario() {
        System.out.println("===Conta bancaria " + this.numeroConta + " ===");
        System.out.println("Nome: " + this.dono.nome);
        System.out.println("CPF: " + this.dono.cpf);
        System.out.println("Endereco: " + this.dono.endereco);
        System.out.println("Idade: " + this.dono.idade);
        System.out.println("Sexo: " + this.dono.sexo);
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("Limite: " + this.limite);

    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean sacar(double valor) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

}
