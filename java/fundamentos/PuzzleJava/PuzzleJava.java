import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PuzzleJava {
    public List<Integer> printArray(int[] arr) {
        List<Integer> greaterThanTen = new ArrayList<>();
        for(int a : arr) {
            System.out.println(a);

            if(a > 10) greaterThanTen.add(a);
        }
        return greaterThanTen;
    }

    public List<String> printNames(String[] arr) {
        List<String> nameList = new ArrayList<>();
        for(String a : arr) {
            System.out.println(a);
            if(a.length() > 5) nameList.add(a);
        }
        return nameList;
    }

    public void shuffleLetters() {
        List<Character> alphabetList = new ArrayList<>();

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(char abc : alphabet) {
            alphabetList.add(abc);
        }

        Collections.shuffle(alphabetList);
        System.out.println(alphabetList.get(alphabetList.size() - 1));
        char firstLetter = alphabetList.get(0);

        if(firstLetter == 'a' || firstLetter == 'e' 
        || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u') 
        System.out.println("first letter is a vowel: " + firstLetter);
    }

    public int[] randomArray() {
        int[] arr = new int[10];
        Random r = new Random();

        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(45) + 55;
        }

        return arr;
    }

    public int[] sortedRandomArray() {
        int[] arr = new int[10];
        Random r = new Random();

        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(45) + 55;
        }
        Arrays.sort(arr);

        for(int a : arr) System.out.println(a);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);


        return arr;
    }

    public String randomString() {
        List<Character> alphabetList = new ArrayList<>();
        String randomString = "";
        Random r = new Random();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(char abc : alphabet) {
            alphabetList.add(abc);
        }
        Collections.shuffle(alphabetList);

        for(int i = 0; i < 5; i++) {
            randomString += alphabetList.get(r.nextInt(26));
        }

        return randomString;       
    }

    public String[] randomStringArray() {
        List<Character> alphabetList = new ArrayList<>();
        
        String[] randomStringArray = new String[10];
        Random r = new Random();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(char abc : alphabet) {
            alphabetList.add(abc);
        }
        Collections.shuffle(alphabetList);

        for(int i = 0; i < 10; i++) {
            String randomString = "";
            for(int j = 0; j < 5; j++) {
                randomString += alphabetList.get(r.nextInt(26));
            }
            randomStringArray[i] = randomString;
        }
        return randomStringArray;       
    }
}


