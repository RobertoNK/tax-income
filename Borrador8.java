import java.util.Scanner;

public class Borrador8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter income: ");
		int income = input.nextInt();
		
		if(income >0 && income <=750) {
			System.out.println("1% of income");
		}else if(income >750 && income <=2250){
			System.out.println("$7.50 plus 2% of amount over $750");
		}else if(income >2250 && income <=3750){
			System.out.println("$37.50 plus 3% of amount over $2,250");
		}else if(income >3750 && income <=5250){
			System.out.println("$82.50 plus 4% of amount over $3,750");
		}else if(income >5250 && income <=7000){
			System.out.println("$142.50 plus 5% of amount over $5250");
		}else if (income >7000) {
			System.out.println("$230.00 plus 6% of amount over $7,000");
		}else {
			System.out.println("Invalid income");
		}
		
	}

}
