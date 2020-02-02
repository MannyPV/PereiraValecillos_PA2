
public class Encrypter {

	public int encrtpy(int encrtpy) {
		int digits= encrtpy;
		//add 7 then divide by 10
		digits= digits + 7;
		digits= digits /10;
		 
		 //convert int to int array
		int[] Dig = new int[String.valueOf(digits).length()+1];
		
		int temp=Dig[0];
		Dig[0]=Dig[2];
		Dig[2]= temp; 
		
		temp= Dig[1];
		Dig[1]=Dig[3];
		Dig[3]= temp;
	
		// need to convert int array back into int
		//should i convert to string then int?
		
		return digits;
		
	}

}




