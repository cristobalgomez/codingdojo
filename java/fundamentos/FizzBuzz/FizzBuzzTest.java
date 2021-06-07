public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz tres = new FizzBuzz();
        FizzBuzz cinco = new FizzBuzz();
        FizzBuzz quince = new FizzBuzz();
        System.out.println(tres.fizzBuzz(3));
        System.out.println(cinco.fizzBuzz(5));
        System.out.println(quince.fizzBuzz(15));
        System.out.println(tres.fizzBuzz(5));
        System.out.println(tres.fizzBuzz(15));
    }
}
