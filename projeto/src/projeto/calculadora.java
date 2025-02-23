package projeto;

import java.util.Scanner;

public class calculadora {
		
		static public void main(String[] args) {
		Scanner enter = new Scanner (System.in);
		
		numero n1= new numero();
		numero n2= new numero();
		numero res= new numero();
		
		System.out.printf("Digite o valor 1: ");
		n1.setValor(enter.nextInt());
		System.out.printf("Digite o valor 2: ");
		n2.setValor(enter.nextInt());
		res.setValor(n1.getValor() + n2.getValor());
		System.out.printf("%nA soma de %d com %d e igual a %d", n1.getValor(), n2.getValor(), res.getValor());
		
		enter.close();
		
		}
		
}
 