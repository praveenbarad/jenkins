import java.io.IOException;
import java.util.Scanner;
public class ScannerExample {
   public void sampleMethod(Scanner sc){
      StringBuffer sb = new StringBuffer();
      System.out.println("Enter your name: ");
      String name = sc.next();
      System.out.println("Enter your age: ");
      String age = sc.next();
      System.out.println("Hello "+name+" You are "+age+" years old");
   }
   public static void main(String args[]) throws IOException {
      //Instantiating the Scanner class
      Scanner sc = new Scanner(System.in);
      ScannerExample obj = new ScannerExample();
      //Calling the method
      obj.sampleMethod(sc);
   }
}
