public class FizzBuzz {
    public String fizzBuzz(int number) {
        String text;
        if(number%5 == 0 && number%3 == 0) text = "FizzBuzz";
        else if(number%3 == 0) text = "Fizz";
        else if(number%5 == 0) text = "Buzz";
        else text = String.format("%i", number);
        return text;

    }
}
