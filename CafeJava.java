public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.1;
        double dripCoffeePrice = 2.0;
        double lattePrice = 3.2;
        double cappucinoPrice = 3.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isNotReadyOrder2= false;
    
        if(isReadyOrder1) {
        // what to do if condition is true
        System.out.println(readyMessage);
        }
        else if(isNotReadyOrder2) {        
        // what to do if 2nd condition is true
        System.out.println(pendingMessage);
    
        }
        // ... can have 0 to many else-if statements ...
        else {                           
        // what to do if none of the previous conditions are met
        System.out.println(customer1 + readyMessage + pendingMessage + displayTotalMessage + dripCoffeePrice);
        } // can have 1 or no else statement
        


    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        // System.out.println(customer1 + generalGreeting + pendingMessage); // Displays "Welcome to Cafe Java, Cindhuri"
    	// // ** Your customer interaction print statements will go here ** //
        // System.out.println(customer4 + readyMessage + displayTotalMessage + cappucinoPrice);

        // System.out.println(customer2 +  readyMessage + displayTotalMessage + lattePrice * 2);

        // System.out.println(customer3 + readyMessage + displayTotalMessage + (lattePrice - dripCoffeePrice));

        

    }
}
