import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		int a,b,res;
	    String op;
	   Scanner   s=new Scanner(System.in);
	     System.out.println("Enter 2 numbers :");
	     a=s.nextInt();
	     b=s.nextInt();
	     System.out.println("enter operator");
	     op=s.next();
	     
	     switch (op)
	     {
	     case "+" : res=a+b;
	                System.out.println("the addition is :" +res);
	                break;
	                
	     case "-" : res=a-b;
                    System.out.println("the substraction is :" +res);
                    break;
                    
          default : System.out.println("invalid operator");
                    break;
                    

	     }
	     s.close();

	}

}
