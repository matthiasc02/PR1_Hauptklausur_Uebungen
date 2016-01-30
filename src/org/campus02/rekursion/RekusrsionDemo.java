package org.campus02.rekursion;

public class RekusrsionDemo {

	public static void main(String[] args) {
		
		System.out.println("Sum Numbers");
		System.out.println(RekursionMathe.sum(10));
		
		System.out.println("Fibonacci Numbers");
		System.out.println(RekursionMathe.fib(2));
		
		System.out.println("Factorial");
		System.out.println(RekursionMathe.fac(5));
		
		System.out.println("Is hier eine 8 drinnen?");
		System.out.println(RekursionMathe.isLuckyNumber(98234234));
		
		System.out.println("Palindrom Check");
		System.out.println(Palindrom.checkpalindrom("Nagan"));
		System.out.println(Palindrom.checkpalindrom("O Genie, der Herr ehre Dein Ego!"));
		
	}

}
