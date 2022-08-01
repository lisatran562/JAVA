public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 4.5;
        double coffeePrice = 3.5;
        double lattePrice = 5.5;
        double cappuccinoPrice = 6.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	System.out.println(customer1 + pendingMessage);
        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + (2 * lattePrice));
        if(isReadyOrder2 == true) {
            System.out.println(customer2 + readyMessage);
        }else{
            System.out.println(customer2 + pendingMessage);
        }
        System.out.println(customer3 + displayTotalMessage + (lattePrice - coffeePrice));
    }
}
