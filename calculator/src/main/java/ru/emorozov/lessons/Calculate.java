package ru.emorozov.lessons;

public class Calculate{
	public static void main(String[] arg){
		System.out.println("Calculate...");
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[1]);
		System.out.println(String.format("%s + %s = %s", first, second, add(first, second)));
		System.out.println(String.format("%s - %s = %s", first, second, sub(first, second)));
		System.out.println(String.format("%s * %s = %s", first, second, mul(first, second)));
		System.out.println(String.format("%s / %s = %s", first, second, div(first, second)));
		System.out.println(String.format("%s ^ %s = %s", first, second, exp(first, (int) second)));
	}
	
	public static double add(double a, double b){
		return a+b;
	}
	
	public static double sub(double a, double b){
		return a-b;
	}
	
	public static double mul(double a, double b){
		return a*b;
	}
	
	public static double div(double a, double b){
		return a/b;
	}
	public static double exp(double a, int b){
		double result = 1;
		for (int i = 0; i < b; i++){
			result = result * a;
		}
		return result;
	}
}