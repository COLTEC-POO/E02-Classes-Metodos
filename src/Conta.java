public class Conta {

    int numero;
    String senha;
    double saldo;
    Cliente dono;
    double limite;

    public Conta(int numero, String senha, double saldo,Cliente dono,double limite){

        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
        this.dono = dono;
        this.limite = limite;

    }

    //public TIPO_RETORNO NOME_DO_MÉTODO(TIPO VARI1, TIPO VARI2,...){
    //}

    public boolean depositar(double valor) {
        if (valor >= 0) {
            this.saldo += valor;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean sacar(double valor){
        if(valor >= 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean transferir(double valor, Conta destino){
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        else{
            return false;
        }
    }

    public void imprimir(){

        System.out.println("Nome: "+ dono.nome);
        System.out.println("Numero da conta: "+ numero);
        System.out.println("CPF: "+ dono.cpf);
        System.out.println("Endereco: "+ dono.endereco);
        System.out.println("Idade: "+ dono.idade);
        System.out.println("Sexo: "+ dono.sexo);

        System.out.println("Saldo atual: "+ saldo);
        System.out.println("Limite: "+ limite);

    }


}