public class ArraySearch {
    public static void main(String[] args){
        String[] concepts = {"abstraction",
                            "polymorphism",
                            "inheritance",
                            "encapsulation"
        };
        String result = searchStringArray("abstraction", concepts);

        System.out.println(result);


        
    }
    public static String searchStringArray(String target, String[] array){
        String result ="not found";
        for (String targets : array){
            if(targets.equals(target)){
                result="found";
                break;
            }
        }
        return result;
    }
}
