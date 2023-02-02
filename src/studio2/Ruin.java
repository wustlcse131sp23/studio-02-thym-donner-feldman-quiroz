package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is your start amount?");
		double startAmount = in.nextDouble();
		System.out.println("What is the win chance?(in decimal form)");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		double winLimit = in.nextDouble();
			
		while(startAmount<winLimit && startAmount!=0) {
			if(Math.random() < winChance)
			{
				startAmount++;
			
			}
		
			else {
				startAmount--;
			}	
		
	}
		if (startAmount == winLimit) {
			System.out.println("you win!!!");
		}
		if (startAmount == 0) {
			System.out.println("you lose!!!");
		}
}
}
