import java.util.Scanner;


public class PointsInsideFigure {

	public static void main(String[] args) {
		
		try(Scanner input=new Scanner(System.in)){
			
			float pointX=input.nextFloat();
			float pointY=input.nextFloat();
			boolean check=false;
			
			if(pointX>=12.5&pointX<=17.5){
				if(pointY>=6&pointY<=13.5){
					check=true;
				}
			}
			else if(pointX>=20&pointX<=22.5){
				if(pointY>=6&pointY<=13.5){
					check=true;
				}
			}
			else if(pointX>=12.5&pointX<=22.5){
				if(pointY>=6&pointY<=8.5){
					check=true;
				}
			
			}
		if(check==true){
			System.out.printf("%s,%s - Inside",pointX,pointY);
		}
		else{
			System.out.printf("%s,%s - Outside",pointX,pointY);
		}
		}
		
		

	}

}
