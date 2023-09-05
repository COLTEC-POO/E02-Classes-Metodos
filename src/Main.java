public class Main {
    public static void main(String[] args){
        System.out.println("++++Sistema Bancário++++");

        //objetos
        Conta contaJoao = new Conta(
                10254,
                "joao123",
                100.0,
                "João"
        );
        Conta contaMaria = new Conta(
                10255,
                "maria123",
                200.0,
                "Maria"
        );

        //imprimir dados das contas
        contaJoao.imprimir();
        System.out.println();
        contaMaria.imprimir();
    }
}
