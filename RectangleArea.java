import java.util.Scanner;


public class RectangleArea {

	public static void main(String[] args) {
		System.out.println("Enter the sides of the rectangle");
		try(Scanner input=new Scanner(System.in)){
			int sideOne=input.nextInt();
			int sideTwo=input.nextInt();
			long area=sideOne*sideTwo;
			System.out.printf("The area of the rectangle is:%s*%s=%s",sideOne,sideTwo,area);
		}
		
		

	}

}
