import java.util.List;
import java.util.ArrayList;
public class BasicJava {
    public void printTo255() {
        for(int i = 1; i <= 255; i++) System.out.println(i);
    }

    public void oddNumbers() {
        for(int i = 1; i <= 255; i++) {
            if(i%2 != 0) System.out.println(i);
        }
    }

    public void printSum() {
        int sum = 0;
        for(int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println("number:" + i + "sum:" + sum);
        }
    }

    public void printElements(int[] arr) {
        for(int a : arr) System.out.println(a);
    }

    public void maxNumber(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }

        System.out.println(max);
    }

    public void avg(int[] arr) {
        int total = 0;
        int len = arr.length;
        for(int a : arr) total += a;

        System.out.println("avg: " + total/len );

    }

    public List<Integer> oddNumbersArray() {
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i++) {
            if(i%2 != 0) numbers.add(i);
        }
        return numbers;
    }

    public int greaterThan(int[] arr, int y) {
        int num = 0;
        for(int a : arr) {
            if(a > y) num = a;
        }
        return num;
    }

    public int[] square(int[] arr) {
        for(int i = 0; i < arr.length; i++) arr[i] *= arr[i];
        return arr;
    }
    
    public int[] noNegatives(int[] arr) {
        for(int i = 0; i < arr.length; i++) 
            if(arr[i] < 0) arr[i] = 0;

        return arr;
    }

    public double[] avgMaxMin(double[] arr) {
        double max = arr[0];
        double min = arr[0];
        double sum = 0;
        int len = arr.length;

        for(double a : arr) {
            sum += a;
            if(a > max) max = a;
            else if(a < min) min = a;
        }

        return new double[] {sum/len,max,min};
    }

    public int[] moveElements(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(i + 1 < arr.length) arr[i] = arr[i + 1];
            else if(i == arr.length - 1) arr[i] = 0;
        }

        return arr;
    }

}
