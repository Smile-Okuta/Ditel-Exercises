package Chapter5;

import java.net.InetAddress;
import java.net.Socket;
import java.nio.channels.SocketChannel;

public class TrianglePrintingProgram {
    public static void main(String[] args) {

        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println();

        for (int k = 8; k >= 0; k--) {
            for (int l = 0; l < k; l++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println();

        for (int s = 8; s >= 0; s--) {
            for (int r = 0; r < s; r++) {

                System.out.print("*");
            }
            for (int u = 0; u <=8; u++) {
                System.out.print(" ");
            }

            System.out.println();
        }


    }
}
