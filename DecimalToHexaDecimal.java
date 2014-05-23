import java.util.Scanner;


public class DecimalToHexaDecimal {

	public static void main(String[] args) {
		try(Scanner input=new Scanner(System.in)){
			
			int numDecimal=input.nextInt();
			String numHex=Integer.toHexString(numDecimal);
			System.out.printf("Decimal - %s\nHexadecimal - %s",numDecimal,numHex);
		}

	}

}
