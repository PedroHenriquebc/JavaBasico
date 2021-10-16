package execicioSala15_10_21;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
//		1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
//			coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:  
//			a) m�dia do sal�rio da popula��o;
//			b) m�dia do n�mero de filhos;
//			c) maior sal�rio;
//			d) percentual de pessoas com sal�rio at� R$100,00.
		
		Scanner sc = new Scanner(System.in);
		double somaSalarios = 0;
		double maiorSalario = 0;
		double somaFilhos = 0; 
		double cont = 0;
		double salario;
		double filhos;
		
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("Digite o sal�rio do habitante n�mero " + i + ":");
			salario = sc.nextDouble();
			System.out.println("Digite o n�mero de filhos do habitante n�mero " + i + ":");
			filhos = sc.nextDouble();
			somaSalarios += salario;
			somaFilhos += filhos;
			if (salario > maiorSalario) {
				maiorSalario = salario;
			}
			if( salario >= 100) {
				cont += 1;
			}
		}
	
		
		System.out.printf("A m�dia do sal�rio da popula��o � de R$%.2f %n", somaSalarios / 4);		
		System.out.printf("A m�dia do n�mero de filhos � de %.1f filho(s) %n", somaFilhos / 4);
		System.out.printf("O maior sal�rio � RS%.2f %n", maiorSalario);
		System.out.printf("O percentual de pessoas com sal�rio at� R$100 � %.1f%%", (cont / 4.0) * 100);
		
		sc.close();
	}

}
