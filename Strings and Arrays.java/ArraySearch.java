public class ArraySearch {
    public static void main(String[] args){
        String[] concepts = {"abstraction",
                            "polymorphism",
                            "inheritance",
                            "encapsulation"
        };
        boolean result = searchArray("abstraction", concepts);

        System.out.println(result);


        
    }
    public static boolean searchArray(String target, String[] array) {
    boolean result = false;
    for (String element : array) {
        if ((element != null) && (element.equals(target))) {
            result = true;
            break;
        }
    }
    return result;
    }

public static boolean searchArray(int target, int[] array) {
    boolean result = false;
    for (int element : array) {
        if (element == target) {
            result = true;
            break;
        }
    }
    return result;
}
}
