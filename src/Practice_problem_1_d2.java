import java.util.Scanner;
public class Practice_problem_1_d2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        int num = scanner.nextInt();
        if(num > 0){
            System.out.println("Positive integer");
        }else{
            System.out.println("Not a positive integer");
        }
    }
}
