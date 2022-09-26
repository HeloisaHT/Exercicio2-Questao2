package Q2;

import java.util.Scanner;

public class Calculadora {
	Scanner leia = new Scanner(System.in);
	double n1=0,n2=0, r = 0;
	
	int Multiplicacao() {
		System.out.println("Primeiro numero: ");
		n1=leia.nextDouble();
		System.out.println("Segundo Numero: ");
		n2=leia.nextDouble();
		r = n1*n2;
		System.out.println(n1+" * "+n2+" = "+r);
		return 0;
	}
	int Divisao() {
		System.out.println("Primeiro numero: ");
		n1=leia.nextDouble();
		System.out.println("Segundo Numero: ");
		n2=leia.nextDouble();
		r = n1/n2;
		System.out.println(n1+" / "+n2+" = "+r);
		return 0;
	}
	int Soma() {
		System.out.println("Primeiro numero: ");
		n1=leia.nextDouble();
		System.out.println("Segundo Numero: ");
		n2=leia.nextDouble();
		r = n1+n2;
		System.out.println(n1+" + "+n2+" = "+r);
		return 0;
	}
	int Subtracao() {
		System.out.println("Primeiro numero: ");
		n1=leia.nextDouble();
		System.out.println("Segundo Numero: ");
		n2=leia.nextDouble();
		r = n1-n2;
		System.out.println(n1+" - "+n2+" = "+r);
		return 0;
	}

}
