package aulas.exerc5;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Joao","1234");
		Conta conta1 = new Conta("111", cliente1);
		conta1.setSaldo(100);
		
		Cliente cliente2 = new Cliente("Maria","4321");
		Conta conta2 = new Conta("222", cliente2);
		
		System.out.println(conta1+" "+cliente1);
		System.out.println("Debitando R$40,00 da Conta N°111...");
		conta1.debitar(40);
		System.out.println(conta1 +" "+cliente1);
		
		System.out.println("_______________________________________________________________");
		
		System.out.println(conta2 +" "+cliente2);
		System.out.println("Creditando R$150,00 na Conta N°222....");
		conta2.creditar(150);
		System.out.println(conta2 +" "+cliente2);
		
		System.out.println("_______________________________________________________________");
		
		System.out.println(conta1);
		System.out.println(conta2);
		System.out.println("Transferindo R$50,00 da Conta N°111 para Conta N°222...");
		conta1.transferir(conta2, 50);
		System.out.println(conta1+" "+cliente1);
		System.out.println(conta2 +" "+cliente2);
		
		System.out.println("_______________________________________________________________");
		
		System.out.println(conta1);
		System.out.println("Debitando R$70,00 da Conta N°111 para Conta N°222...");
		conta1.debitar(70);
		System.out.println(conta1);
		
		System.out.println("_______________________________________________________________");
		
		System.out.println(conta1);
		System.out.println(conta2);
		System.out.println("Trabsferindo R$70,00 da Conta N°111 para Conta N°222...");
		conta1.transferir(conta2, 70);
		System.out.println(conta1);
		System.out.println(conta2);
	}
}
