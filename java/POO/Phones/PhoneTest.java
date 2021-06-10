public class PhoneTest {
   public static void main(String[] args) {
       Galaxy s9 = new Galaxy("S9", 55, "Entel", "Ring Ring");
       IPhone iphone10 = new IPhone("X", 33, "Movistar", "Buzz Buzz");

       s9.displayInfo();
       System.out.println(s9.ring());
       System.out.println(s9.unlock());

       iphone10.displayInfo();
       System.out.println(iphone10.ring());
       System.out.println(iphone10.unlock());

   } 
}
