import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) throws InterruptedException{
        Scanner input = new Scanner(System.in); //read keyboard input
        //Keep calulator up
        
        
        // Introduction
        System.out.println("Welcome to the java calculator! You can: ");
        System.out.println("Add \n Subtract \n Multiply \n Divide \n and sort out which word comes first in the dictionary (sort)");
        // Wait for a few seconds 
        TimeUnit.SECONDS.sleep(2);

        System.out.println("What operation would you like to use?");
        String operation = input.next().toLowerCase();
        // could use if else or select cases here, I'm not sure which is more efficient memory wise
        // addition clauses
        if (operation.equals( "add")){
            System.out.println("Please enter two integers, ");
            System.out.println("Int 1:");
            int int1 = input.nextInt();
            System.out.println("Int 2:");
            int int2= input.nextInt();
            int total = int1+int2;
            System.out.println("The sum is " +int1+"+"+int2+ "="+total);
        }// subtration clauses
        else if (operation.equals("subtract") || operation.equals("sub")){
            System.out.println("Please enter two integers, ");
            System.out.println("Int 1:");
            int int1 = input.nextInt();
            System.out.println("Int 2:");
            int int2= input.nextInt();
            int total = int1-int2;
            System.out.println("The sum is " +int1+"-"+int2+ "="+total);
        }// division clauses
        else if (operation.equals("divide") || operation.equals("div")){
            System.out.println("Please enter two doubles, ");
            System.out.println("Double 1: ");
            Double int1 = input.nextDouble();
            System.out.println("Double 2: ");
            Double int2= input.nextDouble();
            while (int2 == 0){
                System.out.print("Sorry you can't divide by 0, enter something else: ");
                int2=input.nextDouble();
            }
            Double total = int1/int2;
            System.out.println("The sum is " +int1+"/"+int2+ "="+total);
        }// multiplication clauses
        else if (operation.equals("multiply") || operation.equals("times")){
            System.out.println("Please enter two doubles, ");
            System.out.println("Double 1: ");
            Double int1 = input.nextDouble();
            System.out.println("Double 2: ");
            Double int2= input.nextDouble();
            Double total = int1*int2;
            System.out.println("The sum is " +int1+"*"+int2+ "="+total);
        }// string clauses
        else if (operation.equals("sort")){
            System.out.println("Please enter two words, ");
            System.out.println("Word 1:");
            String string1 = input.next().toLowerCase();
            System.out.println("Word 2:");
            String string2= input.next().toLowerCase();
            //returns an int that is postive if string 2 is bigger than string 1
            //negative if string 2 is smaller than string 1 and 0 if they are the same
            int check = string1.compareTo(string2);
            
            if (check > 0){
                System.out.printf("Out of the strings you entered %s comes before %s in the dictionary. \n", string2, string1 );
            }
            else if (check < 0){
                System.out.printf("Out of the strings you entered %s comes before %s in the dictionary. \n", string1, string2 );
            }
            else if (check == 0 ){
                System.out.print("These are the same lexicographically. \n");
            }
            
        }
        else{
            System.out.println("Invalid entry: Please choose from: \n Add \n Subtract \n Divide \n Multiply \n Sort");
            operation = input.next().toLowerCase();
        }
    
 
        // switch(operation){
        // case "add":
        // break;
        // case "subtract":
        // break;
        // case "divide":
        // break;
        // case "multiply":
        // break;
        // case "sort":
        // break;
        // default:
        // System.out.println("Please enter a valid operation: ");
        // operation = input.next();
        // }
    input.close();
        }
}
