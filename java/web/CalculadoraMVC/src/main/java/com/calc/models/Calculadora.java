package com.calc.models;

import java.util.ArrayList;
import java.util.List;

public class Calculadora implements CalculadoraInterfaz {

	private List<Double> numbers = new ArrayList<>();
    private List<String> operations = new ArrayList<>();
    private double result = 0;

    public Calculadora() {

    }
	
	public void performOperation(double number) {
		numbers.add(number);
	}

	public void performOperation(String operation) {
		if(!operation.equals("=")) {
			operations.add(operation);
		} else {
            double res = 0;
            List<String> operations = copyOf(this.operations);
            List<Double> numbers = copyOf(this.numbers);
            for(int i = 0; i < operations.size(); i++) {
                if(operations.get(i).equals("*")) {
					res = numbers.get(i)*numbers.get(i+1);
					numbers.set(i, res);
					numbers.remove(i+1);
					operations.remove(i);
					i=-1;
                }         
            }

            for(int i = 0; i < operations.size(); i++) {
                if(operations.get(i).equals("*")) {
					res = numbers.get(i)/numbers.get(i+1);
					numbers.set(i, res);
					numbers.remove(i+1);
					operations.remove(i);
					i=-1;
                }       
            }

            for(int i = 0; i < operations.size(); i++) {
                if(operations.get(i).equals("+") || operations.get(i).equals("-")) {
                    switch(operations.get(i)) {
                        case "+":
                            res = numbers.get(i)+numbers.get(i+1);
                            break;
                        case "-":
                            res = numbers.get(i)-numbers.get(i+1);
                            break;
                    }
                    
                    numbers.set(i, res);
                    numbers.remove(i+1);
                    operations.remove(i);
                    i=-1;
                }
            }

            this.result = numbers.get(0);
		}
	}
	
	public double getResult() {
		return this.result;
	}
	
	private <T> List<T> copyOf(List<T> arr) {
		List<T> copyArr = new ArrayList<>();
		for(int i = 0; i < arr.size(); i++) {
			copyArr.add(arr.get(i));
		}
		
		return copyArr;
	}

}
