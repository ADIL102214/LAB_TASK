import java.util.Scanner;
public class StringProblem{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String Shoja = scanner.nextLine();
        String ulta = new StringBuilder(Shoja).reverse().toString();
        System.out.println("Inverse of "+ Shoja+ " is "+ ulta);
        if(Shoja.equals(ulta)) System.out.println("Shoja is a palindrome");
        else System.out.println("Shoja isnt a palindrome");
        char ch = scanner.next().charAt(0);
        int count = 0;
        for(int i = 0; i<Shoja.length(); i++){
            if(Shoja.charAt(i) == ch) count++;
        }
        System.out.println("Occurrence of " + ch + " is "+ count + " times");
    }
}