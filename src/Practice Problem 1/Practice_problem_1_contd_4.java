import java.util.Scanner;
public class Practice_problem_1_contd_4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;;i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            char ch = scanner.next().charAt(0);
            if (ch == '+') {
                System.out.printf("%d %c %d = %d", a, ch, b, a + b);
            } else if (ch == '-') {
                System.out.printf("%d %c %d = %d", a, ch, b, a - b);
            } else if (ch == '*') {
                System.out.printf("%d %c %d = %d", a, ch, b, a * b);
            } else if (ch == '/') {
                if (b != 0) {
                    System.out.printf("%d %c %d = %f", a, ch, b, (float) a / b);
                } else {
                    System.out.printf("CANNOT BE DIVIDED BY ZERO");
                }
            }
            System.out.printf("\n");
        }
    }
}