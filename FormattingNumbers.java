import java.util.Scanner;
import java.text.DecimalFormat;

public class FormattingNumbers {

	public static void main(String[] args) {
		
		try(Scanner input=new Scanner(System.in)){
			
			int firstNum=input.nextInt();
			float secNum=input.nextFloat();
			float thirdNum=input.nextFloat();
			
			String firstHex=Integer.toHexString(firstNum);
			String firstBin=Integer.toBinaryString(firstNum);
			String pad = String.format("%0" + 10 + 'd', 0);
			firstBin= pad.substring(firstBin.length()) + firstBin;
			
			System.out.printf("|%-10s|",firstHex);
			System.out.printf(firstBin+'|');
			
			DecimalFormat notfloat=new DecimalFormat("0");
			if(secNum!=(int)secNum){
			DecimalFormat twoAfterDecPoint=new DecimalFormat("0.00");
			System.out.printf("%10s|",twoAfterDecPoint.format(secNum));
			}
			else{
				
				System.out.printf("%10s|",notfloat.format(secNum));
			}
				
			
			if(thirdNum!=(int)thirdNum){
			DecimalFormat threeAfterDecPoint=new DecimalFormat("0.000");
			System.out.printf("%-10s|",threeAfterDecPoint.format(thirdNum));
			}
			else{
				System.out.printf("%-10s|",notfloat.format(thirdNum));
			}
	
		}

	}

}
