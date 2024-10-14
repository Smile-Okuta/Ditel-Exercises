package Chapter17;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class RandomIntegers {

    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        System.out.println("Random numbers on separate lines: ");
        randomNumbers.ints(10, 1,7)
                .forEach(System.out::println);

        System.out.print("Random numbers on one line: ");
//        String numbers =
                randomNumbers.ints(10,1,7)
//                .mapToObj(String::valueOf)
//                .collect(Collectors.joining(" "));
        .forEach(System.out::print);



    }
}
