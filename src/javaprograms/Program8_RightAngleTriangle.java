package javaprograms;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */
import java.util.Scanner;
public class Program8_RightAngleTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rownum;
        System.out.println("Enter number of row:");
        rownum = scanner.nextInt(); //NUMBER OF ROWS YOU WANT LOOP TO RUN
        for (int rowcount = 0; rowcount < rownum; rowcount++) {
            for (int columncount = 0; columncount <= rowcount ; columncount++) { //INSIDE ROW LOOP, HOW MANY TIMES COLUMN LOOP TO RUN
                System.out.print("@");

            }
            System.out.println();
        }
        scanner.close();
    }
}













