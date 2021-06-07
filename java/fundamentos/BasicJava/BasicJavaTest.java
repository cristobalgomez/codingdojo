import java.util.Arrays;
import java.util.List;

public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava basicJava = new BasicJava();
        basicJava.printTo255();
        basicJava.oddNumbers();
        basicJava.printSum();
        basicJava.printElements(new int[]{1,2,3,4});
        basicJava.maxNumber(new int[]{1,2,3,-5,100,99});
        basicJava.avg(new int[]{2,10,3});

        List<Integer> oddArray = basicJava.oddNumbersArray();
        System.out.println(Arrays.toString(oddArray.toArray()));

        int greaterThan = basicJava.greaterThan(new int[]{1,3,5,7}, 3);
        System.out.println(greaterThan);

        int[] square = basicJava.square(new int[]{1,5,10,-2});
        System.out.println(Arrays.toString(square));

        int[] noNegatives = basicJava.noNegatives(new int[]{1,5,10,-2});
        System.out.println(Arrays.toString(noNegatives));

        double[] avgMaxMin = basicJava.avgMaxMin(new double[]{1,5,10,-2});
        System.out.println(Arrays.toString(avgMaxMin));

        int[] moveElements = basicJava.moveElements(new int[]{1,5,10,7,-2});
        System.out.println(Arrays.toString(moveElements));


    }
}
