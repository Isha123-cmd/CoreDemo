import java.util.Scanner;
public class GreatestThree {

	  public static void main(String[] args) {
	    int a,b,c;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the three numbers");
		a= s.nextInt();
		b= s.nextInt();
		c= s.nextInt();
		
		if(a>b && a>c)
			System.out.println("a is greatest");
		
		else if(b>c)
			System.out.println("b is the greatest");
		
		else
			System.out.println("c is the greatest");
			
		 s.close();
	}

}
