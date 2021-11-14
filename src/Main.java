public class Main {
    public static void main (String[] args){

        Cliente vinicius = new Cliente();
        vinicius.nome = "Vinicius";
        vinicius.cpf = "1277233421";
        vinicius.sexo = 'm';
        vinicius.idade = 32;
        vinicius.endereco = "COLTEC-UFMG";

        Cliente maria = new Cliente();

        maria.nome = "Maria";
        maria.cpf = "09901364692";
        maria.sexo = 'f';
        maria.idade = 33;
        maria.endereco = "UFMG - FAE";




        Conta c1 = new Conta();
        Conta c2 = new Conta();

        /**

         * //teste dos valores padrão invocando o construtor
         *         System.out.println("Método construtor - Valores Padrão");
         *         System.out.println(c1.dono);
         *         System.out.println(c1.saldo);
         *         System.out.println(c1.numero);
         *         System.out.println(c1.limite);
         *         System.out.println();
         * */

        //manipulacao da conta
        c1.dono = vinicius;
        c1.saldo = 2003000;
        c1.numero = 157468;
        c1.limite = 5155999.0;

        c2.dono = maria;
        c2.saldo = 20000.0;
        c2.numero = 153719;
        c2.limite = 55999.0;


        //invocacao do metodo depositar para o objeto c1

        // System.out.println("===Realizando os depositos===");
        c1.depositar (500);
        c1.depositar (3400);
        c1.depositar (9500);
        c1.depositar (12500);

        //invocacao do metodo depositar para o objeto c2
        System.out.println();
        c2.depositar(1000);
        c2.depositar(6000);

        /**
         *  //invocacao do metodo sacar para o objeto c1
         *         boolean saqueRealizado = c1.sacar(500);
         *         if(saqueRealizado){
         *             System.out.println("Saque realizado com sucesso :)");
         *         } else {
         *             System.out.println("Erro! Saque Insuficiente :(");
         *         }
         *
         * */


        c1.transferir(c2, 2500);
        c2.transferir(c1, 13000);

        c1.imprimir();
        System.out.println();
        c2.imprimir();
    }
}
