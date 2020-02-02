
public class Decrypter {



	public int decrypt(int encDigits) {
		int digits= encDigits;
		
		//convert int to int array.
		int[] Dig = new int[String.valueOf(digits).length()+1];
		
		//swapping 1st and third back
		int temp=Dig[2];
		Dig[2]=Dig[0];
		Dig[0]= temp; 
		
		//swapping 2ns and fourth back
		temp= Dig[3];
		Dig[3]=Dig[1];
		Dig[1]= temp;
		
		//need to convert int array back into a int
		
		 digits= digits * 10;
		 digits= digits - 6;
		
		
		return digits;
	}


}
