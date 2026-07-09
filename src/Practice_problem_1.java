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
        float ballRadius = scanner.nextFloat();
        double volume = (4.0/3.0)*3.14*Math.pow(ballRadius, 3);
        System.out.printf("Volume: %.2f\n", volume);
        //AREA OF A CIRCLE
        System.out.print("Radius : ");
        float circleRadius = scanner.nextFloat();
        double circleArea = 3.14 * Math.pow(circleRadius, 2);
        System.out.printf("Circle Area: %.2f\n", circleArea);
        //CONVERTION OF CELCIUS TO FAHRANHEIT
        System.out.print("Celsius : ");
        float celsius = scanner.nextFloat();
        float fahrenheit = (celsius * 9.0f/5.0f)+32.0f;
        System.out.printf("Fahrenheit: %.2f\n", fahrenheit);
    }
}


