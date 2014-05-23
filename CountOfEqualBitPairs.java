import java.util.Scanner;


public class CountOfEqualBitPairs {

	public static void main(String[] args) {
		
		try(Scanner input=new Scanner(System.in)){
			
			int num=input.nextInt();
			String bin=Integer.toBinaryString(num);
			char [] charArray=new char[bin.length()];
			charArray=bin.toCharArray();
			char check=charArray[0];
			int counter=0;
			for(int i=1;i<=charArray.length-1;i++){
				if(charArray[i]==check){
					counter++;
				}
				else{
					check=charArray[i];
				}
			}
			System.out.printf("%s",counter);
		}
		
	}

}
