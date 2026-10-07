
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
    public int multiply(){
         int num1 = getInputInt("Enter Num 1 : ");
         int num2 = getInputInt("Enter num 2 : ");
         return num1 * num2;
}

   public int add(){
int num1 = getInputInt("Enter Num 1 : ");
         int num2 = getInputInt("Enter num 2 : ");
         return num1 + num2;
    

}

}


   
