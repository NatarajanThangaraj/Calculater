<<<<<<< HEAD
package Calculator;
import java.util.Scanner;
class Operations{
 public void showMenu(){
    System.out.println("========= MENU ============");
    System.out.println("1.Addtion");
     System.out.println("2.Subraction");
      System.out.println("3.Multiply");
       System.out.println("4.Divide");
        System.out.println("5.square");

             while(true){
        int option = getInputInt("option");
                switch (option) {
                    case 1->{
                        addtion();
                    }
                    case 2->{
                        subraction();
                    }
                    case 3->{
                        multiply()
                    }
                    case 4->{
                        divide();
                    }
                case 5 ->{
                    square();
                }
                    
                }
             }
}
Scanner sc = new Scanner(System.in);

<<<<<<< HEAD
public int getInputInt(String message){
   
    System.out.println(message);
   return sc.nextInt();

=======
    public int getInputInt(String message) {
        System.out.println(message);
        return sc.nextInt();
    }

    public long square(){

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        long sqr = num * num;
        return sqr;
    }
>>>>>>> 8d300f3f319c88fb2e11b870b7a3cfed605516fd
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
