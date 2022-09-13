import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10;
        int a = 1;


        for (int j = 1; j < n; j++) {
            for (int i = 1; i < n; i++) {
                System.out.print(i * j + "\t");

            }
            System.out.println();
        }

    }

}



