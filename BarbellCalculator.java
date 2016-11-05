import java.util.Scanner;

public class BarbellCalculator {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		
		System.out.println("Would you like to use lbs or kgs?: ");
		String metricOrImperial = sn.nextLine();
		
		if(metricOrImperial.equals("lbs")){
			System.out.println("Enter the desired weight: ");
			
			float desiredWeight = sn.nextFloat();
			
			float minusBarbell = desiredWeight - 45;
			float eachSide = minusBarbell / 2;
						
			String result = "You need to add ";
			
			int fourtyFives = (int) (eachSide / 45);
			eachSide = eachSide - (45 * fourtyFives);
			if(fourtyFives!=0){
				result =result + fourtyFives + " plates, ";
			}
			
			int thirtyFives = (int) (eachSide / 35);
			eachSide = eachSide - (35 * thirtyFives);
			if(thirtyFives!=0){
				result =result + thirtyFives + " thirty-fives, ";
			}
			
			int twentyFives = (int) (eachSide / 25);
			eachSide = eachSide - (25 * twentyFives);
			if(twentyFives!=0){
				result =result + twentyFives + " twenty-fives, ";
			}
			
			int tens = (int) (eachSide / 10);
			eachSide = eachSide - (10 * tens);
			if(tens!=0){
				result =result + tens + " tens, ";
			}
			
			int fives = (int) (eachSide / 5);
			eachSide = eachSide - (5 * fives);
			if(fives!=0){
				result =result + fives + " fives, ";
			}
			
			int twoPointFives = (int) (eachSide / 2.5);
			eachSide = (float) (eachSide - (2.5 * twoPointFives));
			if(twoPointFives!=0){
				result =result + twoPointFives + " two point fives ";
			}
			
			result = result + "to each side.";
			System.out.println(result);
				
			
			
		}else if(metricOrImperial.equals("kgs")){
			
			System.out.println("Enter the desired weight: ");
			
			float desiredWeight = sn.nextFloat();
			
			float minusBarbell = desiredWeight - 20;
			float eachSide = minusBarbell / 2;
						
			String result = "You need to add ";
			
			int fourtyFives = (int) (eachSide / 20);
			eachSide = eachSide - (20 * fourtyFives);
			if(fourtyFives!=0){
				result =result + fourtyFives + " plates, ";
			}
			
			int thirtyFives = (int) (eachSide / 15);
			eachSide = eachSide - (15 * thirtyFives);
			if(thirtyFives!=0){
				result =result + thirtyFives + " fifteens, ";
			}
			
			int twentyFives = (int) (eachSide / 10);
			eachSide = eachSide - (10 * twentyFives);
			if(twentyFives!=0){
				result =result + twentyFives + " tens, ";
			}
			
			int tens = (int) (eachSide / 5);
			eachSide = eachSide - (5 * tens);
			if(tens!=0){
				result =result + tens + " fives, ";
			}
			
			int fives = (int) (eachSide / 2.5);
			eachSide = (float) (eachSide - (2.5 * fives));
			if(fives!=0){
				result =result + fives + " two point fives, ";
			}
			
			int twoPointFives = (int) (eachSide / 1.25);
			eachSide = (float) (eachSide - (1.25 * twoPointFives));
			if(twoPointFives!=0){
				result =result + twoPointFives + " one point twenty-fives ";
			}
			
			result = result + "to each side.";
			System.out.println(result);

		}else{
			System.out.println("That is not valid input.");
		}
	
	}

}
