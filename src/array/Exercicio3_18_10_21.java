package array;

public class Exercicio3_18_10_21 {

	public static void main(String[] args) {
//		Crie de uma classe Aluno com os seguintes atributos e m�todos: -String nome,
//		double[] notas, aprovado(), maiorNota() e media() (al�m dos getters e setters
//		necess�rios).
//		dadas as notas: double[] notas = {10, 5.0, 7.0, 9.0, 10.0};, retorne as seguintes
//		observa��es sobre o aluno: a maior nota, m�dia e caso m�dia maior que 7 =
//		aprovado.
		
		double[] notas = {10, 5.0, 7.0, 9.0, 10.0};
		Aluno a1 = new Aluno();
		a1.setNome("Pedro");
		a1.setNotas(notas);
		
		System.out.println("A maior nota do aluno " + a1.getNome() + " foi: " + a1.maiorNota());
		System.out.println("A m�dia do aluno " + a1.getNome() + " foi: " + a1.media());
		
		if(a1.aprovado()) {
			System.out.println("O aluno " + a1.getNome() + " est� aprovado!");
		} else {
			System.out.println("O aluno " + a1.getNome() + " est� reprovado!");
		}
		
		
		

	}

}
