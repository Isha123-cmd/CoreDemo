import java.util.Scanner;
public class StudentResult {
	
       public static void main(String[] args) {
		int eng,maths,comp,geo,sci;
		
		System.out.println("enter marks of subjects");
		Scanner s =new Scanner(System.in);
		eng=s.nextInt();
		maths=s.nextInt();
		comp=s.nextInt();
		geo=s.nextInt();
		sci=s.nextInt();
		
	int	total=(eng+maths+comp+geo+sci)/5;
	System.out.println("marks obtained  " + total);
	
	      if(total>90)
	      {
	  		System.out.println("Grade A");
	      }
	      
	      else if (total>80 && total<=90)
	      {
	    	   System.out.println("grade B");
	      }
	      
	      else 
	      {
	      System.out.println("Grade C");
	      }
	      s.close();
	      
	  }

}
