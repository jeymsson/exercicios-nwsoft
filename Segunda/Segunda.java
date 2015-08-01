package Segunda;


//Ache o N tal que Somatorio1  até N é o maior numero menor que 100 e
//mostre N e Somatorio até N.

public class Segunda {

	int Maximo_ateValor = 0;
	
	public Segunda (){
		
	}
	
	public void Achar_N (int Valor){
		
		int Somatorio = 0,
			N = 1,
			teste = 1;
		while (teste < Valor) {
			this.Maximo_ateValor = Somatorio;
			System.out.print("\n\tValor de N= " + N
					+ "  \tValor do Somatorio= " + Somatorio);
			N++;
			Somatorio += teste;
			teste = Somatorio;	
		}
		System.out.print("\n\n\tO valor maximo ate o " + Valor 
						+" é: " + this.Maximo_ateValor
						+ "\n");
	}
	
	
	public static void main(String[] args) {
		Segunda s = new Segunda();
		s.Achar_N(100);
		
	}

}
