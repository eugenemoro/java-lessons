package ru.emorozov.lessons;

import java.util.Scanner;

public class InteractRunner {
	private final Calculator calculator;
	private final IO io;
	
	public InteractRunner(final Calculator calculator, final IO io){
		this.calculator = calculator;
		this.io = io;
	}
	
	public void start(){
		boolean reuse = false;
		try (final Validator validator = new Validator(io)){
			do{
				final double first;
				if (reuse){
					first = calculator.getResult();
				} else {
					first = validator.getDouble("Enter first arg : ");
				}
				String operation = validator.getString(
					"Enter operation : "
				);
				double second = validator.getDouble(
					"Enter second arg : "
				);
				calculator.calc(operation, first, second);
				io.println(
					String.format("%s %s %s = %s",
						first, operation, second, calculator.getResult()
					)
				);
				reuse = validator.compare(
					"Do you want to reuse result? (y)", "y"
				);
			} while (validator.compare("Do you want to continue? (y)", "y"));
		}
	}
	
	public static void main(String[] arg){
		new InteractRunner(
			new Calculator(),
			new ConsoleIO(new Scanner(System.in), System.out)
		).start();
	}
}