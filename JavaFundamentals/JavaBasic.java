// 1. file name = class name
// 2. filename/class: PascalCase
// 3. methods/var:: camelCase

public class JavaBasic {
    // attributes
    // methods
    public static void main(String[] args) {
        // public: access modifier
        System.out.println("Hello Java");

        // 1. compile java (javac & java)

        // ----------------First Java Program ----------------//

        // 2. variables (int, double, boolean, char, String)
        // Primitive VS Wrapper Class

        String firstName = "Alex";
        String lastName = "Miller";
        int age = 28;
        boolean isStudent = true;
        double weight = 152.7;
        char grade = 'A'; // single and double quote marks matter in Java

        System.out.println(firstName + " " + lastName + " : " + age);
        System.out.println(age);
        System.out.println(isStudent);
        System.out.println(weight);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(grade);

        // 3. conditionals & ternary

        // ---------- Cafe Java ------------//

        if(weight < 100) { // condition has to be a boolean
            System.out.println("You need to gain weight");
        }else {
            System.out.println("You are perfect");
        }
        
        System.out.println(weight < 100? "Please gain some weight": "You are perfect!");
        // (condition)? (if-true statement) : (else-statement)

        // 4. String (indexOf, format, trim(), .equals)

        String name = "Alex Miller";
        String name2 = firstName.concat(lastName);
        String name3 = firstName + lastName;
        System.out.println(name.length());
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);

        // String.format
        String greeting = String.format("Hi %s, you are %d years old", firstName, age);
        System.out.println(greeting);
        System.out.printf("Hi %s, you are %d years old \n", firstName, age);

        // creating a string
        String firstName1 = "Martha";
        String firstName2 = new String("Martha"); // memory location
        String firstName3 = "Martha";

        System.out.println(firstName1 == firstName3);
        System.out.println(firstName1 == firstName2); // returns false
        System.out.println(firstName1.equals(firstName2)); // returns true

    }
}



