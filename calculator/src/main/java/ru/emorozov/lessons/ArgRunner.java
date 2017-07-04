package ru.emorozov.lessons;

public class ArgRunner {
	public static void main(String[] arg){
		Calculator calc = new Calculator();
		calc.calc(arg[1], Double.valueOf(arg[0]), Double.valueOf(arg[2]));
		System.out.println(String.format("%s %s %s = %s", arg[0], arg[1], arg[2], calc.getResult()));
	}
}