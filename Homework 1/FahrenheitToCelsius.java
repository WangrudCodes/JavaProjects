import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in); //read keyboard input
    System.out.print("Enter an Farenheit Value: ");
    int Farenheit = input.nextInt();
    System.out.print("Enter the date: ");
    String day = input.next();
    System.out.print("Enter your preferred Centigrade label (Celsius, C or Centigrade): ");
    String cText = input.next();
    double saturdayCelsius = (5.0/9)*(Farenheit-32);
    String newC=cText.concat(":");
    System.out.printf("%s Fahrenheit: %d\n", day,  Farenheit);
    System.out.printf( "%s %-10s %.1f\n", day, newC, saturdayCelsius);

    if(Farenheit >70 ){
        System.out.println("Yay go to the park!");
    }
    // System.out.println("Saturday: "+ saturdayCelsius);
    // System.out.println("Sunday: " + sundayCelsius);
    input.close();
    }
}
