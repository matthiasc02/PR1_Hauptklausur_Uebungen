package org.campus02.rekursion;

public class RekursionMathe {
	
	//summe
	public static int sum(int n){
		if(n==0){
			return 0;
		} else {
		return sum(n-1)+n;
		}
	}
	
	//Fibonaci Folge
	public static int fib(int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		else return fib(n-2)+fib(n-1);				
	}
	
	//Factorial
	public static int fac(int n){
		if(n<=1){
			return 1;
		}
		else return n*fac(n-1);
	}
	
	//is Lucky Number 8 in an int value?
	public static boolean isLuckyNumber(int n){
		if(n == 0){
			return false;
		}
		if((n-8)%10 == 0){
			return true;
		}
		return isLuckyNumber(n/10);
	}
	
	
	

}
