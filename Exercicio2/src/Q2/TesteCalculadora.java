package Q2;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Calculadora calc = new Calculadora();

		int escolha=0;

		System.out.println("Calculadora");
		System.out.println("1 Multiplicacao");
		System.out.println("2 Divisao");
		System.out.println("3 Adicao");
		System.out.println("4 Subtracao");
		System.out.println("Escolha sua operacao:");
		escolha = leia.nextInt();

		if(escolha==1) {
			calc.Multiplicacao();
		}
		else if(escolha==2) {
			calc.Divisao();
		}
		else if(escolha==3) {
			calc.Soma();
		}
		else if(escolha==4) {
			calc.Subtracao();
		}else{
			System.out.println("Nao foi possivel fazer essa operacao.");
		}

	}

}
