package Chapter6;

public class MaximumFinder {
    public static double maximum(double x, double y, double z){
        double maximumValue = x;

        if (y > maximumValue){
            maximumValue = y;
        }

        if (z > maximumValue){
            maximumValue = z;
        }
        return maximumValue;
    }
}
