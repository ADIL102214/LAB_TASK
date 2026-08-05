import java.util.Scanner;
public class Primecheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 2; i< num; i++){
            if(num % i == 0){
                System.out.println(num + " is not in his prime");
                return;
            }
        }
        System.out.println(num + " is at his prime");
    }
}