import java.util.Scanner;
public class Practice_problem_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //AREA OF A TRAINGLE
        System.out.print("Base : ");
        float base = scanner.nextFloat();
        System.out.print("Height : ");
        float height = scanner.nextFloat();
        float area = 0.5f*base*height;
        System.out.printf("The area of the triangle is: %.2f\n", area);
        //VOLUME OF A BALL
        System.out.print("Radius : ");
        float radius = scanner.nextFloat();
        double volume = (4.0/3.0)*3.14*Math.pow(radius, 3);
        System.out.printf("Volume: %.2f\n", volume);
    }
}


