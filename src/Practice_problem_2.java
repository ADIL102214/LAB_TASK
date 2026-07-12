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
        for (int i = 2; i<=20; i+=2){
            System.out.print(i + (i < 20 ? ", " : " \n"));
        }
        for (int i = 1; i<20; i+=2){
            System.out.print(i + (i < 19 ? ", " : " \n"));
        }
        int i = 2;
        while (i <= 20){
            System.out.print(i + (i < 20 ? ", " : " \n"));
            i+=2;
        }
        i = 1;
        while (i < 20){
            System.out.print(i + (i < 19 ? ", " : " \n"));
            i+=2;
        }
        i = 2;
        do {
            System.out.print(i + (i < 20 ? ", " : " \n"));
            i += 2;
        } while (i <= 20);
        i = 1;
        do {
            System.out.print(i + (i < 19 ? ", " : " \n"));
            i += 2;
        } while (i < 20);
    }
}