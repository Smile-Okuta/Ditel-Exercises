//package Chapter6;
//
//import java.security.SecureRandom;
//import java.util.Scanner;
//
//public class ComputerAssistedInstruction {
//     static SecureRandom randomNumbers = new SecureRandom();
//     private static int incorrectResponses;
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//
//        int number1 = 1 + randomNumbers.nextInt(9);
//        int number2 = 1 + randomNumbers.nextInt(9);
//
//        System.out.printf("How much is %d times %d? \n", number1, number2);
//
//        int sum = number1 * number2;
//
//
////      if (sum != total){
////            System.out.println("No. Please try again");
////        }else {
////          System.out.println("Very good");
////      }
//        int count = 0;
//        int answer = 0;
//
//        while (answer != -1){
//            answer = input.nextInt();
//            if(sum != answer && answer != -1){
//                System.out.println(incorrectResponses());
//                System.out.printf("How much is %d times %d? \n", number1, number2);
//                incorrectResponses()++;
//
//
//            }
//        }
//
//    }
//
//    private static String incorrectResponses(){
//        int response = 1 + randomNumbers.nextInt(3);
//        return switch(response){
//            case 1 -> "Please try again!";
//            case 2 -> "NO, keep trying";
//            default -> "Wrong, try once more";
//
//        }
//    }
//
//}
