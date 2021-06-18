public class CalculadoraDosTest {
    public static void main(String[] args) {
        CalculadoraDos calc = new CalculadoraDos();
        calc.performOperation(2.3);
        calc.performOperation('*');
        calc.performOperation(4.4);
        calc.performOperation('+');
        calc.performOperation(33);
        calc.performOperation('*');
        calc.performOperation(33);
        calc.performOperation('+');
        calc.performOperation(0.5);
        calc.performOperation('+');
        calc.performOperation(0.5);
        calc.performOperation('+');
        calc.performOperation(0.5);
        calc.performOperation('=');
        calc.getResult();

    }
}
