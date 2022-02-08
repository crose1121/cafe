package cafe;
import java.util.ArrayList;
import java.util.Scanner;



public class CafeUtil {
	
	private int drinkCount;
	private double orderTotal;
	
	
	public int getStreakGoal(int numWeeks) {
		for(int i=1;i<=numWeeks;i++) {
			drinkCount += i;
		}
		return drinkCount;
	}
	
	public double getOrderTotal(double[] prices) {
		for(double price:prices) {
			orderTotal += price;
		}
		return orderTotal;
	}
	
	public void displayMenu(ArrayList<String> drinks) {
		for (int i=0;i<drinks.size();i++) {
			String drinkName = drinks.get(i);
			System.out.println(String.format("%s | %S", i, drinkName));
		}
	}
//	overloaded function below
	public boolean displayMenu(ArrayList<String> drinks, ArrayList<Double> prices) {
		String currencySign = "$";
		if (drinks.size()!=prices.size()) {
			return false;
		}
		for (int i=0;i<drinks.size();i++) {
			System.out.printf("%s | %s | %s%s",i,drinks.get(i),currencySign,prices.get(i));
		}
		return true;
	}
	
	public void addCustomer(ArrayList<String> customers) {
		System.out.println("Please enter your name");
		
//		String userName = System.console().readLine();
		Scanner inputText = new Scanner(System.in);
		String userName = inputText.nextLine();
		System.out.printf("Hello, %s! There are currently %s people on line in front of you", userName, customers.size());
		customers.add(userName);
		System.out.println(customers);
	}
	
	public void printPriceChart(String product, double price, int maxQuantity) {
		String currencySign = "$";
		System.out.println(String.format("Product: %s", product));
		for (int i=1;i<=maxQuantity;i++) {
			if (i>1) {
				System.out.println(String.format("%s - %s%s", i, currencySign, price*i-0.5));
			}
			else System.out.println(String.format("%s - %s%s", i, currencySign, price*i));
		}
	}
}
