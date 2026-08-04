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
        int sumforeven = 0, sumforodd = 0;
        for (int i = 2; i<=20; i+=2){
            sumforeven += i;
            System.out.print(i + (i < 20 ? ", " : " Sum : " + sumforeven + "\n"));
        }
        for (int i = 1; i<20; i+=2){
            sumforodd += i;
            System.out.print(i + (i < 19 ? ", " : " Sum : " + sumforodd + "\n"));
        }
        int i = 2;
        int sumwhileeven = 0, sumwhileodd = 0;
        while (i <= 20){
            sumwhileeven += i;
            System.out.print(i + (i < 20 ? ", " : " Sum : " + sumwhileeven + "\n"));
            i+=2;
        }
        i = 1;
        while (i < 20){
            sumwhileodd += i;
            System.out.print(i + (i < 19 ?", " : " Sum : " + sumwhileodd + "\n"));
            i+=2;
        }
        i = 2;
        int sumdoeven = 0, sumdoodd = 0;
        do {
            sumdoeven += i;
            System.out.print(i + (i < 20 ? ", " : " Sum : " + sumdoeven + "\n"));
            i += 2;
        } while (i <= 20);
        i = 1;
        do {
            sumdoodd += i;
            System.out.print(i + (i < 19 ? ", " : " Sum : " + sumdoodd + "\n"));
            i += 2;
        } while (i < 20);
    }
}