package Chapter6;

public class Multiples {
    public static  boolean isMultiples(int a, int b ){
        boolean value = false;
        if (a % b == 0){
           value = true;
        }
        return value;
    }
}
