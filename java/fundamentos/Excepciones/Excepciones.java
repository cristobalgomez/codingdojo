import java.util.ArrayList;
import java.util.List;

public class Excepciones {
    public static void main(String[] args) {
        List<Object> myList = new ArrayList<>();
        myList.add("13");
        myList.add("Hola Mundo");
        myList.add(48);
        myList.add("Adios Mundo");

        try {
            for(int i = 0; i < myList.size(); i++) {
                int castedValue = (int) myList.get(i);
            }
        } catch(Exception cause) {
            StackTraceElement elements[] = cause.getStackTrace();
            for (int i = 0, n = elements.length; i < n; i++) {       
                System.err.println("Something happened: " 
                    + elements[i].getFileName()
                    + ":" + elements[i].getLineNumber() 
                    + ">> "
                    + elements[i].getMethodName() + "()");
            } 
        } finally {
            System.out.println("doing something else...");
        }
            
    }
}
    
