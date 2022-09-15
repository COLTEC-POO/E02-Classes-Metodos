//classe conta 
public class conta{
  int numero;
  String titular;
  double saldo;
  double limite;
}



//classe main
public class main {
  public static void main(string[]args){
    conta minhaconta= new conta();
      
    minhaconta.titular='Maria';
    minhaconta.numero='0001-1';
    minhaconta.saldo='10.000,00';
    minhaconta.limite='5.0000,00';
    
    System.out.println(minhaconta.titular);
    System.out.println(minhaconta.numero);
    System.out.println(minhaconta.saldo);
    System.out.println(minhaconta.limite);

   }
}