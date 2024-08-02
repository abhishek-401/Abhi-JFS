import java.util.Scanner;
class Run
{
 public static void main(String[] args)
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("enter the integer value:" );
	int n= sc.nextInt();

      if(n<0)
	 n=n*-1;
  System.out.println("user entered integer is :"+n);
 }
}