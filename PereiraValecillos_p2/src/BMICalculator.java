import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		int choice= 0;
	    BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi(choice);
	    app.displayBmi();                                   
}
	//-------------------------------------------------------------------------
	private float weight;
	private float height;
	private float bmi;
	
	public void readUserData() {
		// readUnitType and readMeasurementData methods
		
		Scanner scan = new Scanner(System.in);
		int choice;
		System.out.print("What Units are you using? Metric or Imperial? \n");
		System.out.print("Type in '1' for Metric\n");
		System.out.print("Type in '2' for Imperial\n");
		choice = scan.nextInt();
		scan.close();
		readUnitType(choice);
		readMeasurementData(choice);
	}
	//-----------------------------------------------------------------------------------
	
	private int readUnitType(int choice) {
		if (choice==1) {
			System.out.println("Your choice was: "+ choice);
			return 1;
		}
		else if(choice == 2) {
			System.out.println("Your choice was: "+ choice );
			return 2;
		}
		else {System.out.println("Error 1: Wrong number Choice\n");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		scan.close();
		readUnitType(choice);
		System.out.println("Your choice was: "+ choice);
		return choice;
		
		}
		
	}
	//-------------------------------------------------------------------------------
	
	private void readMeasurementData(int choice) {
		if (choice==1) {
			 readMetricData();
		}
		else {readImperialData();}
		
	} 
	//--------------------------------------------------------------------------------
	
	private void readMetricData(){
		Scanner scan = new Scanner(System.in);
		int choice= 1;
		System.out.println("Your Height in Centimeters: ");
		float Height = scan.nextFloat();
		
		System.out.println("Your Weight in Kilograms: ");
		float Weight = scan.nextFloat();
		setWeight(Weight);
		setHeight(Height);
		scan.close();
		calculateBmi(choice);
		

	}
	//-----------------------------------------------------------------------------
	
	private void readImperialData(){
		Scanner scan = new Scanner(System.in);
		int choice= 2;
		System.out.println("Your Height in Feet.Inches: ");
		float Height= scan.nextFloat();
		
		System.out.println("Your Weight in pounds: ");
		float Weight= scan.nextFloat();
		setWeight(Weight);
		setHeight(Height);
		scan.close();
		calculateBmi(choice);
	}
	//-----------------------------------------------------------------------------
	
	public void calculateBmi(int choice) {
		//calculates the user's BMI 
		
		if (choice == 1) {
			float weightInPounds = weight;
		
			float bottomCalc = (height * height);
		
			float BMI = 703 * weightInPounds/ bottomCalc;
			setBmi(BMI);
		
		}
		else if (choice == 2) {
			
			float weightInKilo = weight;
			
			float bottomCalc = (height * height);
			
			float BMI = weightInKilo/ bottomCalc;
			setBmi(BMI);
			
			}
		
		
	}
	//---------------------------------------------------------------------------
	private int calculateBmiCategory(float bmi){
		//determines the user's BMI category
		if (this.bmi < 18.5) {return 1;}
		else if(this.bmi >= 18.5 || this.bmi <= 24.9) {return 2;}
		else if(this.bmi >= 25 || this.bmi <= 29.9) {return 3;}
		else if(this.bmi >=30 ) {return 4;}
		else {return 0;}
	}
	//	----------------------------------------------------------------------
	
	public void displayBmi() {
		// prints the BMI value and category to standard output
		float value = bmi;
		System.out.print("Your BMI is: " + value);
	}
	//---------------------------------------------------------------------------
	public void getBmiCategory() {
		int value=calculateBmiCategory(bmi);
		if(value==1) {System.out.println("Your Bmi Categories you as 'Underweight' ");}
		else if(value==2) {System.out.println("Your Bmi Categories you as Normal 'weight' ");}
		else if(value==3) {System.out.println("Your Bmi Categories you as 'Overweight' ");}
		else {System.out.println("Your Bmi Categories you as 'Obesity' ");}
	}
	public float getWeight() {
		return this.weight;
	}
	private void setWeight(float weight) {
		this.weight= weight;
	}
	public float getHeight() {
		return this.height;
	}
	private void setHeight(float height) {
		this.height= height;
	}
	public float getBmi() {
		return this.bmi;
	}
	private void setBmi(float bmi) {
		this.bmi= bmi;
	}	
}
