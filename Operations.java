<<<<<<< HEAD
package Calculator;
import java.util.Scanner;

class Operations{

   Scanner sc = new Scanner(System.in);

public int getInputInt(String message){
   
    System.out.println(message);
   return sc.nextInt();

}



}
=======
 package Calculater;                                                                                               
 
   import java.util.Scanner;
   
   public class Operations{
   
       public long square(){
   
           Scanner scan = new Scanner(System.in);
  
          int num = scan.nextInt();
  
          long sqr = num * num;
  
          return sqr;
  
      }
  
  
  }
>>>>>>> cf03b0764bea54f409e8892c37558b406966038a
