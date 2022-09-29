//classe cliente;

public class cliente{
  String nome;
  String CPF;
  String Endereco;
  int idade;
  char sexo;
}

//clase main com impressões
public main{
public static void main(String[]args){

  cliente meucliente = new cliente();
  
  meucliente.nome='Jose';
  meucliente.CPF='01010101011';
  meucliente.endereco='rua A, numero C, bairro D, Cidade E';
  meucliente.idade='25';
  meucliente.sexo='F';

System.out.println(meucliente.nome);
System.out.println(meucliente.CPF);
System.out.println(meucliente.endereco);
Sytem.out.println(meucliente.idade);
System.out.println(meucliente.sexo);

}
}	
  
