package Chapter4;

public class TabularOutput {
    public static void main(String[] args) {

        int count = 1;
        int count2 = 1;
        int count3 = 1;
        int count4 = 1;

        System.out.printf("%-10s%-10s%-10s%-10s%n", "N", "N", "N", "N" );
        while (count <= 5){
            System.out.printf("%n%-10d",count);
            if (count2 <= 25){
                System.out.printf("%-10d",count * count);

                count2++;
            }

            if (count3 <= 125){
                System.out.printf("%-10d",count * count * count);
                count3++;
            }

            if (count4 <= 625){
                System.out.printf("%-10d",count * count * count * count);
                count4++;
            }
            count++;


        }



    }
}
