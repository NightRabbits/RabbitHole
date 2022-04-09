import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int TestData = scanner.nextInt();

        for(int i = 0; i < TestData; i++) {

            int H = scanner.nextInt();
            int N = scanner.nextInt();

            if(N % H == 0) {
                System.out.println((H * 100) + (N / H));
            } else {
                System.out.println((N % H) * 100 +((N / H)+1));
            }

        }

    }

}