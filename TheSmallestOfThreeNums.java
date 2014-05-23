import java.util.Arrays;
import java.util.Scanner;


public class TheSmallestOfThreeNums {

	public static void main(String[] args) {
		try(Scanner input=new Scanner(System.in)){
			double numbers []=new double[3];
			
			for(int i=0;i<3;i++){
				numbers[i]=input.nextDouble();
				
			}
			Arrays.sort(numbers);
			System.out.printf("Minimum = "+numbers[0]);
		}

	}

}
