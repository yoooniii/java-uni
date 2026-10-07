package calculator;
import java.util.Scanner;
//Create a BMI calculator that only shows the BMI and not the BMI categories.
public class Main {
	public static double BMI(double weight, double height) {
		return weight/(height*height);
	}
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		
	System.out.println("Input weight in kilograms: ");
	double weight=inp.nextDouble();
	System.out.println("Input height in meters: ");
	double height=inp.nextDouble();
	System.out.printf("Your BMI is "+BMI(weight,height));
	}

}
