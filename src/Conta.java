public class Conta {

    //Conteudo class conta

    Cliente memoryCliente;
    int memoryId;
    double memorySaldo;
    double memoryLimite;

//-----------------------------------------------------------------------------------------------------//
//Função para imprimir todos os dados cadastrados do cliente.

    public void imprimirClientes (Conta conta){
        System.out.println("Informações da conta");
        System.out.println("------------------------------------------------");
        System.out.println("ID:"+this.memoryId);
        System.out.println("Nome:"+this.memoryCliente.nome);
        System.out.println("CPF:"+this.memoryCliente.cpf);
        System.out.println("Idade:"+this.memoryCliente.idade);
        System.out.println("Sexo:"+this.memoryCliente.sexo);
        System.out.println("Endereço:"+this.memoryCliente.endereco);
        System.out.println("Saldo:"+this.memorySaldo);
        System.out.println("Limite:"+this.memoryLimite);
        System.out.println("------------------------------------------------");
        System.out.println("Aviso: Evite fraudes, não compartilhe seus dados");
    }
//-----------------------------------------------------------------------------------------------------//
//Funções para movimentação do dinheiro na conta dos clientes.

    public void depositar(double memoryValor){
        this.memorySaldo=this.memorySaldo+memoryValor;
    }
    //-----------------------------------------------------------------------------------------------------//
    public boolean sacar(double memoryValor){
        if(memoryValor<=this.memorySaldo){
            this.memorySaldo-=memoryValor;
            return true;
        } else{
            return false;
        }
    }
    //-----------------------------------------------------------------------------------------------------//
    boolean transferir(Conta destino, double memoryValor){
        boolean saqueRealizado=this.sacar(memoryValor);
        if (saqueRealizado){
            destino.depositar(memoryValor);
            return true;
        }
        else{
            return false;
        }

    }
//-----------------------------------------------------------------------------------------------------//
}
