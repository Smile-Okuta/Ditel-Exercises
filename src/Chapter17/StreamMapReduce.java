package Chapter17;

import java.util.stream.IntStream;

public class StreamMapReduce {
    public static void main(String[] args) {

        System.out.printf("Sum of the even ints from 2 to 20 is: %d%n", stream());

    }

    public static int stream(){
       return IntStream.rangeClosed(1,10)
                .map((int x) -> {return x * 2;})
                .sum();

    }
}
