
public class Conta {
    // Info | Atributos
    int numero;
    Cliente dono;
    double saldo;
    double limite;


public void imprimir() {
    System.out.println("Dados Bancarios");

    System.out.println("Nome: " + this.dono.Nome);
    System.out.println("Numero da Conta: " + this.numero);
    System.out.println("Saldo Disponivel: " + this.saldo);
    System.out.println("Limite Disponivel: " + this.limite);

    System.out.println();

    System.out.println("Dados do Dono");
    System.out.println("Nome: " + this.dono.Nome);
    System.out.println("CPF do dono: " + this.dono.CPF);
    System.out.println("Endereco do dono: " + this.dono.Enderenco);
    System.out.println("Idade do dono: " + this.dono.Idade);
    System.out.println("Sexo do: " + this.dono.Sexo);
}

/* Separacao de Metodos
    * public void imprimirDadosBancarios() {
        System.out.println("Numero da Conta: " + this.numero);
        System.out.println("Nome: " + this.dono.Nome);
        System.out.println("Saldo Disponivel: " + this.saldo);
        System.out.println("Limite Disponivel: " + this.limite);
}
    * public void imprimirDadosDono() {
        System.out.println("CPF do dono: " + this.dono.CPF);
        System.out.println("Endereco do dono: " + this.dono.Enderenco);
        System.out.println("Idade do dono: " + this.dono.Idade);
        System.out.println("Sexo do: " + this.dono.Sexo);
}
* }
*/
}
