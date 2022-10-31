
public class HW01{
    public static void main(String[] args){
        //Declare an int variable
        int int1 = 4;
        //Declare a float variable
        float float1 = 6.7F;
        
        System.out.println(int1);
        System.out.println(float1);
        
        float multiply =int1*float1;
        System.out.println(multiply);
        
        //Casting an int to a new variable
        float casted = (float)int1;
        System.out.println(casted);
        
        //Casting the float1 variable to an int, expecting truncation down to 6
        int trunky = (int)float1;
        System.out.println(trunky);
        
        //Declare a char and print its value
        char firstChar= 'A';
        System.out.println(firstChar);
        
        //ascii value for lowercase a using casting
        firstChar=(int)97;
        System.out.println(firstChar);
        
        //Part 2 - String variables
        String myName =  "Dylan";
        System.out.println(myName);
        
        myName=myName.replace('D','A');
        myName=myName.replace('n','Z');
        System.out.println(myName);
        
        String webAdd = "www.gatech.edu";
        System.out.println(webAdd);
        
        System.out.println(webAdd.substring(4,10) + "1331");
        





}