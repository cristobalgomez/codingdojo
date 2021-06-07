public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator manipulatorrrr = new StringManipulator();
        String str = manipulatorrrr.trimAndConcat("    Hola     ","     Mundo    ");
        System.out.println(str); // HolaMundo 

        StringManipulator manipulator = new StringManipulator();
        char letter = 'n';
        int a = manipulator.getIndexOrNull("Coding", letter);
        int b = manipulator.getIndexOrNull("Hola Mundo", letter);
        int c = manipulator.getIndexOrNull("Saludar", letter);
        System.out.println(a); // 4
        System.out.println(b); // 7
        System.out.println(c); // -1

        StringManipulator manipulatorr = new StringManipulator();
        String word = "Hola";
        String subString = "la";
        String notSubString = "mundo";
        int aa = manipulatorr.getIndexOrNull(word, subString);
        int bb = manipulatorr.getIndexOrNull(word, notSubString);
        System.out.println(aa); // 2
        System.out.println(bb); // -1

        StringManipulator manipulatorrr = new StringManipulator();
        String wordd = manipulatorrr.concatSubstring("Hola", 1, 3, "mundo");
        System.out.println(wordd); // olmundo
    }
}
