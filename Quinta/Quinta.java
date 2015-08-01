package Quinta;

public class Quinta {

	long Maximo_ateValor = 0;
	
	public Quinta() {
		// TODO Auto-generated constructor stub
	}

	
	public void Achar_N (int Valor){
		
		long 	Somatorio = 0,
				N = 0;
		
		while (N < Valor) {
			this.Maximo_ateValor = Somatorio;
			N++;
			
			if (N % 2 == 0) {
				Somatorio += N;
				if (Somatorio % 2 == 0) {
					System.out.print("\n\tNo N= " + N
							+ "  \tO valor do Somatorio é = " + Somatorio);
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quinta quinta = new Quinta();
		
		quinta.Achar_N(500);
		
	}

}
