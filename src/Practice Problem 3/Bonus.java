import java.util.Scanner;
public class Bonus {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int targetSales = 10000;
        System.out.print("Target sales : "+ targetSales+"\n" +"Sales : ");
        int sales = scanner.nextInt();
        System.out.print("Attendance(out of 100 days) : ");
        int attendance = scanner.nextInt();
        int salesInPercentage = (sales*100)/targetSales;
        if(salesInPercentage >= 95 && attendance == 100){
            System.out.println("60% bonus for you");
        }else if (salesInPercentage >= 95 && attendance >= 90){
            System.out.println("40% bonus for you");
        }else if(salesInPercentage >= 80 && attendance == 100){
            System.out.println("40% bonus for you");
        }else if(salesInPercentage >= 80 && attendance >= 90){
            System.out.println("20% bonus for you");
        }else{
            System.out.println("5% bonus for you");
        }

    }
}