import java.util.Scanner;
public class Practice_problem_1_contd_3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        for(int i = 0;; i++) {
            System.out.printf("Enter the number : ");
            int number = scanner.nextInt();
            if (number >= 0 && number < 40) {
                System.out.printf("F");
            } else if (number < 60) {
                System.out.printf("C+");
            } else if (number < 70) {
                System.out.printf("B");
            } else if (number < 80) {
                System.out.printf("A-");
            } else if (number < 90) {
                System.out.printf("A");
            } else if (number < 101) {
                System.out.printf("A+");
            } System.out.printf("\n");
        }
    }
}