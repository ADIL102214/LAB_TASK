import java.util.Scanner;
public class Medal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your result : ");
        double result = scanner.nextDouble();
        System.out.print("You complete the semester?(TRUE or FALSE) : ");
        boolean isCompleted = scanner.nextBoolean();
        if(isCompleted){
            if(result >= 3.5){
                System.out.println("Here is your medal \uD83C\uDFC5");
            }
            else {
                System.out.println("You aint worthy");
                return;
            }
        }else System.out.println("You aint worthy");
    }
}