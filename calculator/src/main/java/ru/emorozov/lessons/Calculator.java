package ru.emorozov.lessons;

public class Calculator{
	private double result;
	
	public void calc(String oper, double ... params){
		if (oper.equals("+")){
			this.add(Double.valueOf(params[0]), Double.valueOf(params[1]));
		} else if (oper.equals("-")) {
			this.sub(Double.valueOf(params[0]), Double.valueOf(params[1]));
		} else if (oper.equals("*")) {
			this.mul(Double.valueOf(params[0]), Double.valueOf(params[1]));
		} else if (oper.equals("/")) {
			this.div(Double.valueOf(params[0]), Double.valueOf(params[1]));
		} else if (oper.equals("^")) {
			this.expand(Double.valueOf(params[0]), Double.valueOf(params[1]));
		}
	}
	
	public void add(double ... params){
		for (Double param : params){
			this.result += param;
		}
	}
	
	public void sub(double ... params){
		if (params.length > 1){
			this.result = params[0] - params[1];
		} else {
			this.result -= params[0];
		}
	}
	
	public void mul(double ... params){
		if (params.length > 1){
			this.result = params[0] * params[1];
		} else {	
			for (Double param : params){
				this.result *= param;
			}
		}
	}
	
	public void div(double ... params){
		if (params.length > 1){
			if (params[1] != 0){
				this.result = params[0] / params[1];
			} else {
				throw new ArithmeticException("Cannot div by zero!");
			}
		} else {
			if (params[0] != 0){	
				double temp = this.result; 
				this.result = temp / params[0];
			} else {
				throw new ArithmeticException("Cannot div by zero!");
			}
		}
	}
	
	public void expand(double ... params){ 
		double temp = 0;
		if (params.length > 1) {
			temp = params[0];
			for (int index = 0; index < params[1]-1; index++){ 
				temp *= params[0]; 
			}
		} else {
			temp = this.result;
			for (int index = 0; index < params[0]-1; index++){ 
				temp *= this.result; 
			} 
		}	
		this.result = temp;
	}
	
	public double getResult(){
		return this.result;
	}
	
	public void clearResult(){
		this.result = 0;
	}
}