package Primeira;

import java.util.Scanner;

//Escreva algoritmos que resolvam as operaçoes abaixo, porem use APENAS as operações
//de Soma e SUBTRAÇÃO
//a) 23*12
//b) 10/2
//c) 288


public class Primeira {

	
	public int Mult_porSoma, Dividido_porSub, Resultado;
	
	public Primeira (){
		
	}
	
	public int Item_A (int primario, int multiplicado){
		int A1 = primario,
			S  = A1,
			A2 = 1;
		
		while (A2 != multiplicado) {
			S += A1;
			this.Mult_porSoma = S;
			A2 ++;
		}
		return this.Mult_porSoma;
	}
	public int Item_B (int dividido, int divisor){
		int A1 = 0;
		
		while (Item_A(divisor, A1) != dividido) {
			A1 ++;
			this.Dividido_porSub = A1;
			
		}
		return this.Dividido_porSub;
	}
	public void Item_C (){
		//c) 288
		
	}
	
	public static void main (String[] args){
		Primeira p = new Primeira();
		
		System.out.print("\nO resultado de 23 * 12 é igual a: " + p.Item_A(23, 12));
		System.out.print("\nO resultado de 10 / 02 é igual a: " + p.Item_B(10, 02));
		System.out.print("\nO item C nao possui operações matemáticas a serem resolvidas. ");
	}
}
