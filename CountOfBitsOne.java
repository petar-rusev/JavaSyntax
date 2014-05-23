import java.util.Scanner;


public class CountOfBitsOne {

	public static void main(String[] args) {
		
		try(Scanner input=new Scanner(System.in)){
			System.out.println("Please enter an Integer number.\n");
			int number=input.nextInt();
			
			String binNumber=Integer.toBinaryString(number);
			char [] Bits=new char[binNumber.length()];
			Bits=binNumber.toCharArray();
			int counter=0;
			for(int i=0;i<Bits.length;i++){
				
				if(Bits[i]=='\u0031'){
					counter++;
				}
			}
			System.out.printf("%s",counter);
		}
	}

}
