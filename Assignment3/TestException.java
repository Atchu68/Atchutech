package onlineclasses;
import java.util.Scanner;
@SuppressWarnings("serial")
class AgeException extends Exception { 
	public AgeException(String str) {
		System.out.println(str); } 
	} 
public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner(System.in);
		
				System.out.println("Enter your age");
				
			
	int a=scanner.nextInt();
		try {
			if((a<=18)||(a>=55))
				throw  new AgeException("candidate not allowed ");
			else System.out.println("candidate allowed");
		}
		catch(AgeException e) {
			System.out.println(e);
		}

	}

}
