//Coded by Aidan Kelly on November, 5, 2016
//This program is meant to calculate the amount of weight
//to add to each side of a barbell to reach a desired weight.
import java.util.Scanner;

public class BarbellCalculator {

	public static void main(String[] args) {

		//Sets up the scanner
		Scanner sn = new Scanner(System.in);
		
		//Asks user if they would like to use metric or imperial
		System.out.println("Would you like to use lbs or kgs?: ");
	
		//sets metricOrImperial to their answer
		String metricOrImperial = sn.nextLine();
		
		//if they chose lbs, we do the calculation in lbs
		if(metricOrImperial.equals("lbs")){
			
			//prompts user for desired weight
			System.out.println("Enter the desired weight(multiple of 5): ");
			
			//sets the desired weight to the input
			float desiredWeight = sn.nextFloat();
			
			//calculates how much weight is required for each side
			float minusBarbell = desiredWeight - 45;
			float eachSide = minusBarbell / 2;
						
			//creates our result string
			String result = "You need to add ";
			
			//checks how many 45s fit into eachSide
			int fourtyFives = (int) (eachSide / 45);
			//subtracts this number from eachSide
			eachSide = eachSide - (45 * fourtyFives);
			//adds the amount to our result string
			if(fourtyFives!=0){
				result =result + fourtyFives + " plates, ";
			}
			
			//checks how many 35s
			int thirtyFives = (int) (eachSide / 35);
			//subtracts this from eachSide
			eachSide = eachSide - (35 * thirtyFives);
			//adds the amount to result string
			if(thirtyFives!=0){
				result =result + thirtyFives + " thirty-fives, ";
			}
			
			//checks how many 25s
			int twentyFives = (int) (eachSide / 25);
			//subtracts this from eachSide
			eachSide = eachSide - (25 * twentyFives);
			//adds the amount to the result string
			if(twentyFives!=0){
				result =result + twentyFives + " twenty-fives, ";
			}
			
			//checks how many 10s
			int tens = (int) (eachSide / 10);
			//subtracts this from eachSide
			eachSide = eachSide - (10 * tens);
			//adds this amount to the result string
			if(tens!=0){
				result =result + tens + " tens, ";
			}
			
			//check how many 5s
			int fives = (int) (eachSide / 5);
			//subtracts this from eachSide
			eachSide = eachSide - (5 * fives);
			//adds this amount to the result string
			if(fives!=0){
				result =result + fives + " fives, ";
			}
			
			//checks how many 2.5s
			int twoPointFives = (int) (eachSide / 2.5);
			//subtracts this amount from eachSide
			eachSide = (float) (eachSide - (2.5 * twoPointFives));
			//adds this amount to the result string
			if(twoPointFives!=0){
				result =result + twoPointFives + " two point fives ";
			}
			
			//finishes the result string
			result = result + "to each side.";
			//prints out the result string
			System.out.println(result);
				
			
		//if the user chose kgs, we do the calculation using kgs	
		}else if(metricOrImperial.equals("kgs")){
			
			//prompts user for input
			System.out.println("Enter the desired weight(multiple of 2.5): ");
			
			//sets the desired weight
			float desiredWeight = sn.nextFloat();
			
			//calculates how much weight for each side
			float minusBarbell = desiredWeight - 20;
			float eachSide = minusBarbell / 2;
				
			//creates our result string
			String result = "You need to add ";
			
			//checks amount of 20s
			int fourtyFives = (int) (eachSide / 20);
			//subtracts this from eachSide
			eachSide = eachSide - (20 * fourtyFives);
			//adds this amount to the result string
			if(fourtyFives!=0){
				result =result + fourtyFives + " plates, ";
			}
			
			//checks amount of 15s
			int thirtyFives = (int) (eachSide / 15);
			//subtracts this from eachSide
			eachSide = eachSide - (15 * thirtyFives);
			//adds this amount to the result string
			if(thirtyFives!=0){
				result =result + thirtyFives + " fifteens, ";
			}
			
			//checks amount of 10s
			int twentyFives = (int) (eachSide / 10);
			//subtracts this from eachSide
			eachSide = eachSide - (10 * twentyFives);
			//adds this amount to the result string
			if(twentyFives!=0){
				result =result + twentyFives + " tens, ";
			}
			
			//checks amount of 5s
			int tens = (int) (eachSide / 5);
			//subtracts this from eachSide
			eachSide = eachSide - (5 * tens);
			//adds this amount to the result string
			if(tens!=0){
				result =result + tens + " fives, ";
			}
			
			//checks amount of 2.5s
			int fives = (int) (eachSide / 2.5);
			//subtracts this from eachSide
			eachSide = (float) (eachSide - (2.5 * fives));
			//adds this amount to the result string
			if(fives!=0){
				result =result + fives + " two point fives, ";
			}
			
			//checks amount of 1.25s
			int twoPointFives = (int) (eachSide / 1.25);
			//subtracts this from eachSide
			eachSide = (float) (eachSide - (1.25 * twoPointFives));
			//adds this amount to the result string
			if(twoPointFives!=0){
				result =result + twoPointFives + " one point twenty-fives ";
			}
			
			//finishes the result string
			result = result + "to each side.";
			
			//prints out the result string
			System.out.println(result);

			
		//checks for valid input
		}else{
			
			//lets user know that they entered non valid input
			System.out.println("That is not valid input.");
		}
	
	}

}
