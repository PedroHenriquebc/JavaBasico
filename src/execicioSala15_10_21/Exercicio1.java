package execicioSala15_10_21;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
//		1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
//			coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
//			a) média do salário da população;
//			b) média do número de filhos;
//			c) maior salário;
//			d) percentual de pessoas com salário até R$100,00.
		
		Scanner sc = new Scanner(System.in);
		double somaSalarios = 0;
		double maiorSalario = 0;
		double somaFilhos = 0; 
		double cont = 0;
		double salario;
		double filhos;
		
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("Digite o salário do habitante número " + i + ":");
			salario = sc.nextDouble();
			System.out.println("Digite o número de filhos do habitante número " + i + ":");
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
	
		
		System.out.printf("A média do salário da população é de R$%.2f %n", somaSalarios / 4);		
		System.out.printf("A média do número de filhos é de %.1f filho(s) %n", somaFilhos / 4);
		System.out.printf("O maior salário é RS%.2f %n", maiorSalario);
		System.out.printf("O percentual de pessoas com salário até R$100 é %.1f%%", (cont / 4.0) * 100);
		
		sc.close();
	}

}
