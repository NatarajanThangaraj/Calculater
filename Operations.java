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
