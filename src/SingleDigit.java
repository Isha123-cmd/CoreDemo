import java.util.Scanner;
public class SingleDigit {

	public static void main(String[] args) {
	int a;
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number");
	a=s.nextInt();
	if (a>-9 && a<9)
	
       System.out.println("single no");
	
       else
       
    	   System.out.println("not a single digit");
       
    	  s.close();
}
}
