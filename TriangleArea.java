
import java.util.Scanner;


public class TriangleArea {
	public static double Area(double X1,double Y1,double X2,double Y2,double X3,double Y3){
		double area=Math.abs((X1*(Y2-Y3)+X2*(Y3-Y1)+X3*(Y1-Y2))/2);
		return area;
		
	}
	public static void main(String[] args) {
		System.out.println("Please enter the coodinates of the first points.");
		try(Scanner input=new Scanner(System.in)){
			
			double pointOneX=input.nextFloat();
			double pointOneY=input.nextFloat();
			double pointTwoX=input.nextFloat();
			double pointTwoY=input.nextFloat();
			double pointThreeX=input.nextFloat();
			double pointThreeY=input.nextFloat();
			double area=Area(pointOneX,pointOneY,pointTwoX,pointTwoY,pointThreeX,pointThreeY);
			if(area==0){
				System.out.println(0);
			}
			else{
				System.out.printf("The area of the triangle is: %s",area);
			}
			
		}

	}

}
