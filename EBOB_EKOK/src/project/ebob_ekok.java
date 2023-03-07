package project;
import java.util.Scanner;
public class ebob_ekok {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1,num2,i=1,ebob=1;
	
		System.out.println("Enter a number");
		num1 = input.nextInt();
		
		System.out.println("Enter a number");
		num2 = input.nextInt();
		
		while((num1%i == 0) && (num2%i == 0) && (num1<num2)) {
			ebob = num1/ i;	
			i++;
		}
		System.out.println("Verilen sayıların ebobu " + ebob);
		
		int ekok = (num1 * num2) / ebob;
		System.out.println("Verilen sayıların ekoku "  + ekok);
		}
	}
	
