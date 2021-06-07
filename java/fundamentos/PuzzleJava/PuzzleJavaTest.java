import java.util.Arrays;
import java.util.List;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava puzzleJava = new PuzzleJava();

        List<Integer> printArray = puzzleJava.printArray(new int[]{3,5,1,2,7,9,8,13,25,32});
        System.out.println(Arrays.toString(printArray.toArray()));

        List<String> printNames = puzzleJava.printNames(new String[]{"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"});
        System.out.println(Arrays.toString(printNames.toArray()));

        puzzleJava.shuffleLetters();

        int[] randomArray = puzzleJava.randomArray();
        System.out.println(Arrays.toString(randomArray));

        int[] sortedRandomArray = puzzleJava.sortedRandomArray();
        System.out.println(Arrays.toString(sortedRandomArray));

        System.out.println(puzzleJava.randomString());
        System.out.println(Arrays.toString(puzzleJava.randomStringArray()));
    }
}