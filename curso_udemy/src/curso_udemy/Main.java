package curso_udemy;

public class Main {

	public static void main(String[] args) {
	
		int idade;
		double salario;
		String nome;
		char sexo;
		
		idade = 21;
		salario = 3500;
		nome = "Maria";
		sexo = 'F';
		
		System.out.println("A funcionaria " + nome + ", sexo " + sexo + ", ganha " + String.format("%.2f", salario)+ " e tem " + idade + ", anos");
		
	}

}
