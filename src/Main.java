public class Main {

    public static void main(String[] args){
        System.out.println("===Sistema Bancario===");

        Cliente clientePedro = new Cliente(
                "Pedro",
                341643421,
                "Rua Joao e Maria 223 BH, Minas Gerais",
                22,
                'M'
        );

        Conta contaPedro = new Conta(
                12344,
                "57457pedro",
                1000,
                clientePedro,
                2000
        );


        Cliente clienteJoao = new Cliente(
                "Joao",
                245938491,
                "Rua Sao Bernardo 18 RJ, Rio de Janeiro",
                25,
                'M'
        );
        Conta contaJoao = new Conta(
                43334,
                "3455joao",
                200,
                clienteJoao,
                4000
        );


        System.out.println("Dados da conta");
        contaPedro.imprimir();



        //if(contaPedro.transferir(100.0, contaJoao)){
        //contaJoao.transferir( 200.0, contaPedro);
        //System.out.println("Valor transferido com sucesso!");
        //}
        //else{
        //System.out.println("Erro");

        //}

        //boolean result = contaPedro.depositar(valor 1000);

        //if (result){
        //System.out.println("Deposito foi realizado com sucesso!");
        //} else{
        //System.out.println("Erro na realizacao do deposito!");
        //}





        //System.out.println("Dados de ContaPedro:");
        //System.out.println("Saldo: "+ contaPedro.saldo);

        //System.out.println("Dados de ContaJoao:");
        //System.out.println("Saldo: "+ contaJoao.saldo);

    }

}