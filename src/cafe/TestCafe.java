package cafe;
import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {

        CafeUtil appTest = new CafeUtil();

        /* ============ App Test Cases ============= */

        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal(10));

        System.out.println("----- Order Total Test-----");
        double[] lineItems = { 3.5, 1.5, 4.0, 4.5 };
        ArrayList<Double> lineItems1 = new ArrayList<Double>();
        lineItems1.add(3.50);
        lineItems1.add(1.50);
        lineItems1.add(4.00);
        lineItems1.add(4.50);
        System.out.printf("Order total: %s \n\n", appTest.getOrderTotal(lineItems));

        System.out.println("----- Display Menu Test-----");

        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);
        
        System.out.println("----- Display Overloaded Menu Test-----");
        appTest.displayMenu(menu,lineItems1);

        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }
        
        System.out.println("Here are the people currently in line:\n");
        for (int i=0;i<customers.size();i++) {
        	System.out.println(customers.get(i));
        }
        
        System.out.println("-------------Testing price chart-------------");
        for (int i=0;i<menu.size();i++) {
        	appTest.printPriceChart(menu.get(i), lineItems[i], 10);
        }
    }
}