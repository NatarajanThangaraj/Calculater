public class Main{
public static void main(String[] args){
Operations op = new Operations();
	Scanner input = new Scanner(System.in);
        Operation op = new Operation();
        System.out.println("===============================");
        System.out.println("    Basic calculator");
        System.out.println("===============================");
        System.out.println("1)Add");
        
        System.out.println("2)sub");
        System.out.println("3)mul"); 
        System.out.println("4)div");

        System.out.println("Enter your choice : ");

        int choice = input.nextInt();


        switch (choice) {
            case 1->{
                System.out.println(op.add(2,3));
                
            }
            case 2->{
                System.out.println(op.sub(2,3));
            }
                
            case 3->{
                System.out.println(op.mul(2,3));
            }
                
            case 4->{
                System.out.println(op.div(2,3));
            }
    
        }
}

}
