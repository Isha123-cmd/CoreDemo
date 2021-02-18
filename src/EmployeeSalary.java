import java.util.Scanner;
public class EmployeeSalary {

	public static void main(String[] args) {
             String empname;
             int empid;
             
             int basic,HRA,DA,PF,netSal;
             Scanner s =new Scanner (System.in);
             
             System.out.println("ENter the employee name ");
             empname=s.next();
             System.out.println("Enter the employee id ");
             empid=s.nextInt();
             System.out.println("Enter the basic salary ");
            basic=s.nextInt();
            System.out.println("Enter the HRA ");
            HRA=s.nextInt();
            System.out.println("Enter the DA ");
            DA=s.nextInt();
            System.out.println("Enter the PF ");
            PF=s.nextInt();
            
            netSal= (basic+HRA+DA)-PF;
            
           System.out.println("The net Salary of the emp is " + netSal);
            s.close();
	}

}
