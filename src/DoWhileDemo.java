import java.util.Scanner;
//SUm of all postive number if negative no the sum comes
public class DoWhileDemo {

	public static void main(String[] args) {
		int sum = 0;
		int num=0;
		Scanner input =new Scanner(System.in);
		
		do
		{
			sum+=num;
			System.out.println("ENter the number");
			num=input.nextInt();
		}
		while(num>0);
		
		System.out.println("sum =" + sum);
			input.close();
			
	}

	

}
