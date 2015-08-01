package Terceira;

import java.util.Scanner;


//  Escreva a logica para resolver o seguinte problema: considerando 3 notas de 
//	um aluno, o numero de faltas e o nome, diga se ele passou ou nao, sendo que 
//	para isso tem-se que ter faltas < 9 e nota >= que 7.

public class Terceira {

	private No 		PrimeiroAluno;
	public 	Scanner 	entrada;
	
	public No getPrimeiroAluno() {
		return PrimeiroAluno;
	}
	public void setPrimeiroAluno(No primeiroAluno) {
		PrimeiroAluno = primeiroAluno;
	}

	public Terceira (){
		setPrimeiroAluno(null);
	}
	
 	public boolean V_Vazio (){
		if (PrimeiroAluno == null) {
			return true;
		} else {
			return false;
		}
	}
	public void Teste (No algum){
		if (algum == null) {
			System.out.print("\n\nNulo");
		} else {
			System.out.print("\n\nCheio");
		}
	}
	public void Inserir_Novo_Aluno (){
		entrada = new Scanner(System.in);
		
		//Cria-se uma fila
		if (V_Vazio() == true) {
			String 	text;
			int		Nota, Faltas;
			
			System.out.print("\n Estrutura vazia, inserindo Primeiro aluno..");
			
			System.out.print("\n Digite o nome do aluno: ");
			text   = entrada.nextLine();
			System.out.print("\n Digite o numaro de Faltas do aluno: ");
			Faltas = entrada.nextInt();
			System.out.print("\n Digite a nota do aluno: ");
			Nota   = entrada.nextInt();
			System.out.print("\n\n\t Aluno registrado..");
			
			No temp = new No(text);
			temp.setFaltas(Faltas);
			temp.setNota(Nota);
			setPrimeiroAluno(temp);
			
		} else {
			
			String 	text;
			int		Nota, Faltas;
			No temp = getPrimeiroAluno();
			
			while (temp.getProximoAluno() != null) {
				temp = temp.getProximoAluno();
			}
			System.out.print("\n Digite o nome do aluno: ");
			text   = entrada.nextLine();
			System.out.print("\n Digite o numaro de Faltas do aluno: ");
			Faltas = entrada.nextInt();
			System.out.print("\n Digite a nota do aluno: ");
			Nota   = entrada.nextInt();
			System.out.print("\n\n\t Aluno registrado..");
			
			No Temp = new No(text);
			temp.setProximoAluno(Temp);
			Temp.setFaltas(Faltas);
			Temp.setNota(Nota);
			
		}
	}
	public void Teste_Aprovacao (int numAlunos){
		if (V_Vazio() == true) {
			System.out.print("\n Estrutura vazia.. ");
		} else {
			
			No temp = getPrimeiroAluno();
			int i = 0;
			
			while (i  < numAlunos) {
				String 	Nome  = temp.getNome();
				int		Nota  = temp.getNota();
				int		Falta = temp.getFaltas();
				
				System.out.print("\n\n O aluno: " +   Nome );
				System.out.print("\n cuja Nota é = " +Nota );
				System.out.print("\n e numero de faltas = " +Falta );
				
				if (Falta < 9 && Nota >= 7) {
					System.out.print("\n\t Foi aprovado ");
				} else {
					System.out.print("\n\t Nao foi aprovado ");
				}
				
				temp = temp.getProximoAluno();
				i ++;
			}
			
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Terceira t = new Terceira();
		int NumAlunos = 3;
		int i;
		for (i = 0; i < NumAlunos; i++) {
			t.Inserir_Novo_Aluno();
		}
		
		t.Teste_Aprovacao(NumAlunos);
		
	}

}
