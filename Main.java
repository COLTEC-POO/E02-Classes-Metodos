public class Main
{
	public static void main(String[] args) {
    	    Conta contaA = new Conta();
            Conta contaB = new Conta();
                    	    
            contaA.dono = "Cadu";
            contaA.numero = 15543;
            contaA.saldo = 1000.0;
            contaA.senha = "123cadu";
            contaA.limite = 1500.0;
                                                                    	    
            contaB.dono = "Julia";
            contaB.numero = 15544;
            contaB.saldo = 1500.0;
            contaB.senha = "123Julia";
            contaB.limite = 2300.0;
                                                                                                                    	    	
            contaA.imprimir();
            contaB.imprimir();
    }
}
                                                                                                                                                    
