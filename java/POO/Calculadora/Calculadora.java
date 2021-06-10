public class Calculadora implements java.io.Serializable {
    //java beans
    private double operandOne;
    private double operandTwo;
    private char operation;
    private double result;

    public Calculadora() {}

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public double getOperandOne() {
        return operandOne;
    }

    public double getOperandTwo() {
        return operandTwo;
    }

    public char getOperation() {
        return operation;
    }

    public void getResult() {
        if(this.operation == '+') {
            System.out.println(this.operandOne+"+"+this.operandTwo+" = "+this.result);
        } else if(this.operation == '-') {
            System.out.println(this.operandOne+"-"+this.operandTwo+" = "+this.result);
        } else if(this.operation == '*') {
            System.out.println(this.operandOne+"*"+this.operandTwo+" = "+this.result);
        } else if(this.operation == '/') {
            System.out.println(this.operandOne+"/"+this.operandTwo+" = "+this.result);
        }
    }

    public void perfomOperation() {
        if(this.operation == '+') {
            this.result = this.operandOne + this.operandTwo;
        } else if(this.operation == '-') {
            this.result = this.operandOne - this.operandTwo;
        } else if(this.operation == '*') {
            this.result = this.operandOne * this.operandTwo;
        } else if(this.operation == '/' && operandTwo != 0.0) {
            this.result = this.operandOne / this.operandTwo;
        }
    }
    
}
