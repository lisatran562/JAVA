import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        // return "Hello, " + name + ", good to see you again.";
        return String.format("Hello, %s, good to see you again!", name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "Today is, " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") >= 0){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        if(conversation.indexOf("Alfred") >= 0){
            return "At your service. As you wish, naturally.";
        }
        return "Right. And with that I shall retire." ;
    }

    public String sing() {
        return "Jingle bells, batman smells, robin laid an egg...";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

