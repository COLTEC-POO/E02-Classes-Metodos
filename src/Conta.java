public class Conta {

    //atribuições
    int numero;
    Cliente dono = new Cliente();
    double saldo;
    double limite;

    //acoes
    public Conta(){
        this.numero=-1;
        this.dono.nome= "<INVALIDO>";
        this.dono.cpf="<INVALIDO>";
        this.dono.endereco="<INVALIDO>";
        this.dono.sexo='-';
        this.dono.idade=00;
        this.saldo = 0;
        this.limite =0;
    }
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
    public boolean sacar(double valor){
        if(valor<= this.saldo){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean transferir(Conta contaDestino, double valor){
        boolean retirou = this.sacar(valor);
        if(retirou){
            contaDestino.depositar(valor);
            return true;
        }else{
            return false;
        }
    }

    public void imprimir(){
        System.out.println("INFORMACOES DA CONTA:");
        System.out.println("Numero: "+this.numero);
        System.out.println("Nome: "+this.dono.nome);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Limite: "+this.limite);
        System.out.println("INFORMACOES DO CLIENTE: ");
        System.out.println("CPF: "+this.dono.cpf);
        System.out.println("Endereco: "+this.dono.endereco);
        System.out.println("Sexo: "+this.dono.sexo);
        System.out.println("Idade: "+this.dono.idade);
    }
}

