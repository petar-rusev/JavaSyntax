import java.util.Scanner;


public class PointsInsideTheHouse {
	public static double Area(double X1,double Y1,double X2,double Y2,double X3,double Y3){
		double area=Math.abs((X1*(Y2-Y3)+X2*(Y3-Y1)+X3*(Y1-Y2))/2);
		return area;
	}
	public static boolean PointSide(float PointX,float PointY){
		boolean checkPoint = false;
		double x1 = 12.5, y1 = 8.5;
        double x2 = 17.5, y2 = 3.5;
        double x3 = 22.5, y3 = 8.5;
        
        double areaOne=Area(x1,y1,x2,y2,x3,y3);
        double areaTwo=Area(PointX,PointY,x2,y2,x3,y3);
        double areaThree=Area(x1,y1,PointX,PointY,x3,y3);
        double areaFour=Area(x1,y1,x2,y2,PointX,PointY);
        
        if(areaOne==areaTwo+areaThree+areaFour){
        	checkPoint=true;
        }
        else{
        	checkPoint=false;
        }

		return checkPoint;
		
	}
	public static boolean PointCheck(float PointX,float PointY){
		boolean check=false;
		
		if(PointX>=12.5&PointX<=17.5){
			if(PointY>=6&PointY<=13.5){
				check=true;
			}
			else{
				check=false;
			}
		}
		else if(PointX>=20&PointX<=22.5){
			if(PointY>=6&PointY<=13.5){
				check=true;
			}
			else{
				check=false;
			}
				
		}
		else if(PointX>=12.5&PointX<=22.5){
			if(PointY>=6&PointY<=8.5){
				check=true;
			}
			else{
				check=false;
			}
		
		}
		return check;
		
	}
	public static void main(String[] args) {
	try(Scanner input=new Scanner(System.in)){
		for(int i=0;i<14;i++){
		float pointX=input.nextFloat();
		float pointY=input.nextFloat();		
			boolean checkSide=PointSide(pointX,pointY);
			boolean checkFigure=PointCheck(pointX,pointY);
			
			
			if(checkSide==true|checkFigure==true){
				System.out.printf("%s,%s - Inside\n",pointX,pointY);
			}
			else{
				System.out.printf("%s,%s - Outside\n",pointX,pointY);
			}
		}
		}

	}

}
