package HelloWorld;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.security.rsa.RSAUtil;
import sun.util.resources.cldr.gd.CalendarData_gd_GB;

import java.awt.*;
import java.awt.image.SampleModel;
import java.text.NumberFormat;
import java.util.*;

public class Main {

/*Primitive Types (37)
Reference Types (45)
Strings (55)
Escape Sequences (61)
Arrays (65)
Arithmetic Expressions (83)
Casting (91)













 */

    public static void main(String[] args) {
        //Primitive types (for storing numbers)
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        //System.out.println();

        //Reference types
        Date now = new Date();
        //System.out.println(now);

        //Different sections may refer to the same stored data (Reference types)
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        //System.out.println(point2);

        //Strings (for storing text)
        String message = "Hello World" + "!!";

        //System.out.println(message.trim()); //Removes whitespaces
        //System.out.println(message);

        //Escape Sequences
        String text = "c:\\Windows\\\n\t\"System32\"";
        //System.out.println(text);

        //Arrays (Tedious way of initialising arrays)
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        //System.out.println(Arrays.toString(numbers));

        int[] array = {2,3,5,1,4};
        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));

        //Multi-dimensional arrays
        int[][] multiarray = new int[2][6];
        multiarray[0][0] = 1;
        //System.out.println(Arrays.deepToString(multiarray));

        //Arithmetic expressions
        double division = (double)10 / (double)3; //"double" to use decimals and not output whole numbers
        int x = 1;
        int y = ++x; //++ before x adds 1 first, ++ after x adds 1 later (if on right side of operation)
        x += 5; //The same as x = x + 2 (augmented assign operators: ( -= , *= , /= )
        //System.out.println(x);
        //System.out.println(y);

        //Casting
        //Implicit casting (byte > short > int > long), (float > double)
        double z = 1.1; //"short" is 2 bytes ("int" is 4 bytes)
        int v = (int)z + 2; //"(int)z" converts 1.1 to a 1 without decimal point
        //System.out.println(v);

        //Casting with strings
        String c = "1.1";
        double b = 2 + Double.parseDouble(c); //have to use "Primitivetype.parsePrimitivetype(x)
        //System.out.println(b);

        //Mathclass
        int result = Math.round(1.1F); //Rounds the number
        result = (int)Math.ceil(1.1F); //Can be Math.floor(x) also
        result = Math.max(1,2); //Prints the largest number (can be Math.min(x,y) to print smallest)
        double random = Math.random() * 100; //Random decimal number from 0 to 100
        random = Math.round(Math.random() * 100); //This is to get random whole numbers from 0 to 100
        int random1 = (int) (Math.random() * 100); //Has to have parenthesis around "Math.random() * 100
        //System.out.println(random1);

        //Formatting numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String cresult = currency.format(1234567.891);
        NumberFormat per = NumberFormat.getPercentInstance();
        String percent = per.format(0.1);
        //System.out.println(percent);

        //Reading input
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("How old are you?:");
        byte year = scanner.nextByte();
        System.out.println("You are " + year + " years old!");*/

        /*Scanner scname = new Scanner(System.in);
        System.out.println("Name?");
        String name = scname.nextLine().trim();//Use ".nextLine()" to input two arguments (name and surname)
        System.out.println("Hi " + name);*/

        //Control Flow
        int f = 1;
        int g = 1;
        //System.out.println(f == g); //Produces boolean value
        // == (equality?), != (inequality?), > , < , >= , <=

        //Logical Operators
        int temperature = 12;
        boolean isWarm = temperature > 20 && temperature < 30; //(&& means "and") (|| means "or")
        //System.out.println(isWarm); //(!x means "not x" like an inverter (inverts boolean value)

        //If Statements
        /*int temp = 32;
        if (temp > 30) { //The curly braces means that if "if (x)" = true, everything inside braces executes
            System.out.println("It's a hot day"); //Only prints if "if (x)" = true
            System.out.println("Drink water");
        }
        else if (temp > 20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");*/

        //Simplifying "if Statements"
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        //This was initially an if statement where (if income>100000=true , else false)

        //The Ternary Operator
        int salary = 100_000;
        String className = salary >= 100_000 ? "First" : "Economy";
        //System.out.println(className);//If expression is true(?) print "First", else(:) print "Economy

        //Switch Statements
        /*String role = "admin";

        switch (role) { //Don't forget curly braces :)
            case "admin":
                System.out.println("You're an admin"); //prints if "role=admin"
                break;

            case "moderator":
                System.out.println("You're a moderator"); //prints if "role=moderator"
                break;

            default:
                System.out.println("You're a guest"); //prints if the other cases don't apply
        }

        if (role == "admin")
            System.out.println("You're an admin");
        else if (role == "moderator")
            System.out.println("You're a moderator");
        else
            System.out.println("You're a guest");
        //Both blocks are equivalent */

        //For Loops
        for (int i = 0; i < 5; i++) //"int i" = starting value ; boolean expression ; add/sub from i
            System.out.println("Hello World " + i);

        //While Loops (While loops are better if you don't know how many repetitions. Else = for loops)
        /*int i = 0;
        while ( i > 0) {
            System.out.println("Hello World " + i);
            i--;
        }*/

        /* Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) { //while input does not equal "quit"
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input); //As soon as "input = quits" program stops
        } */

        //Do...While Loops (Always get executed at least once (even if statement is false))
        /*do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit")); */

        //Break and Continue
        /*Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) { //When using "true", always have "break". Otherwise = infinite loop
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;         //This line moves statement to the beginning of the loop (goes back to top)
            if (input.equals("quit"))
                break;            //This line solves the problem where "quit" gets printed (terminates loop)
            System.out.println(input);
        }*/

        //For-Each Loop
        /*String[] fruits = {"Apple", "Mango", "Orange"};

        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        for (String fruit : fruits) //For-Each Loop (the same as the block above)
            System.out.println(fruit); */

        /*Clean Coding

        "Any fool can write code that computers can understand. Good programmers write code that humans can understand."
        - Martin Fowler

         */

    }
}
