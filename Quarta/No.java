package Quarta;

public class No {

	private int 	Nota;
	private int 	Faltas;
	private String 	Nome;
	private No		ProximoAluno;
	

	public int getNota() {
		return Nota;
	}
	public void setNota(int nota) {
		Nota = nota;
	}
	public int getFaltas() {
		return Faltas;
	}
	public void setFaltas(int faltas) {
		Faltas = faltas;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}

	
	public No getProximoAluno() {
		return ProximoAluno;
	}
	public void setProximoAluno(No proximoAluno) {
		ProximoAluno = proximoAluno;
	}
	
	
	
	public No(String text) {
		setNome(text);
		setProximoAluno(null);
	}

}
