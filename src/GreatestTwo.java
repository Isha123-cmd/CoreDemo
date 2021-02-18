import java.util.Scanner;
public class GreatestTwo 
   {
    public static void main(String[] args) {
	int a,b;
	Scanner s = new Scanner(System.in);
		
		System.out.println("enter the 2 nos");
		a=s.nextInt();
		b=s.nextInt();
	
		if(a>b)
			System.out.println("greatest no. is " + a);
		else
			System.out.println("greatest no.is " + b);
		s.close();
		
	}

}
