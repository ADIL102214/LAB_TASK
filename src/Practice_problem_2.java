import java.util.Scanner;
public class Practice_problem_2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.printf("%d is a leap year\n", year);
        }else{
            System.out.printf("%d is not a leap year\n", year);
        }
    }
}