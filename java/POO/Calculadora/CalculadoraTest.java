public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.setOperandOne(55.5);
        calculadora.setOperandTwo(33.3);
        calculadora.setOperation('+');
        calculadora.perfomOperation();
        calculadora.getResult();
    }
}
