import java.util.Random;
import java.util.Scanner;

public class guessno {

    public static void main(String[] args) {

        // object main

        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        int mynumber = rand.nextInt(50);

        int usernum = 0;

        do {
            System.out.println("ENTER MY NUMBER(1 - 50):");
            usernum = sc.nextInt();

            if (usernum == mynumber) {
                System.out.println("WELL DONE, YOU GUSSED IT RIGHT");
                break;
            } else if (usernum > mynumber) {
                System.out.println("YOUR NUMBER IS TOO LARGE ");
            } else {
                System.out.println("YOUR NUMBER IS TOO SMALL ");
            }

        } while (mynumber >= 0);

        System.out.println("MY NUMBER WAS");
        System.out.println(mynumber);

    }
}
