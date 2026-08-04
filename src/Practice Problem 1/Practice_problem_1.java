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
        //AREA OF A EQUILATERAL TRAINGLE
        System.out.print("Arm : ");
        float arm = scanner.nextFloat();
        double eqArea = (Math.sqrt(3)/4.0) * Math.pow(arm,2);
        System.out.printf("Equilateral Triangle Area: %.2f\n", eqArea);
        //AREA OF A TRIANGLE(2)
        System.out.print("a : ");
        float a = scanner.nextFloat();
        System.out.print("b : ");
        float b = scanner.nextFloat();
        System.out.print("c : ");
        float c = scanner.nextFloat();
        float s = (a+b+c)/2.0f;
        double area_2 = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.printf("Heron Triangle Area: %.2f\n", area_2);
    }
}


