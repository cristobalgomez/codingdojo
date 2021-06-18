import java.util.ArrayList;
import java.util.List;

public class CalculadoraDos implements CalculadoraInterfaz {

	private List<Double> numbers = new ArrayList<>();
    private List<Character> operations = new ArrayList<>();
    private List<Double> copyNumbers = new ArrayList<>();
    private List<Character> copyOperations = new ArrayList<>();
    private double result = 0;

    public CalculadoraDos() {

    }
	
	public void performOperation(double number) {
		numbers.add(number);
        copyNumbers.add(number);
	}

	public void performOperation(char operation) {
		if(operation != '=') {
			operations.add(operation);
            copyOperations.add(operation);
		} else {
            double res = 0;
            for(int i = 0; i < copyOperations.size(); i++) {
                if(copyOperations.get(i) == '*') {
                        res = copyNumbers.get(i)*copyNumbers.get(i+1);
                        copyNumbers.set(i, res);
                        copyNumbers.remove(i+1);
                        copyOperations.remove(i);
                        i=-1;
                }         
            }

            for(int i = 0; i < copyOperations.size(); i++) {
                if(copyOperations.get(i) == '/') {
                    res = copyNumbers.get(i)/copyNumbers.get(i+1);
                    copyNumbers.set(i, res);
                    copyNumbers.remove(i+1);
                    copyOperations.remove(i);
                    i=-1;
                }       
            }

            for(int i = 0; i < copyOperations.size(); i++) {
                if(copyOperations.get(i) == '+' || copyOperations.get(i) == '-') {
                    switch(copyOperations.get(i)) {
                        case '+':
                            res = copyNumbers.get(i)+copyNumbers.get(i+1);
                            break;
                        case '-':
                            res = copyNumbers.get(i)-copyNumbers.get(i+1);
                            break;
                    }
                    
                    copyNumbers.set(i, res);
                    copyNumbers.remove(i+1);
                    copyOperations.remove(i);
                    i=-1;
                }
            }

            this.result = copyNumbers.get(0);
		}
	}
	
	public void getResult() {
        String resultToString = "";
        for(int i = 0; i < numbers.size(); i++) {
            resultToString+= numbers.get(i);
            if(i < numbers.size() - 1) resultToString+= operations.get(i);
        }
        resultToString+= "="+this.result;
        System.out.println(resultToString);
	}
	
}
