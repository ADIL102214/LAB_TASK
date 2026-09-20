public class CarProblem {
    private String Name;
    private String Brand;
    private String Number;
    private double fuel;
    private boolean running;
    CarProblem(String name, String brand, String number){
        this.Name = name;
        this.Brand = brand;
        this.Number = number;
        this.running = false;
        System.out.println("A new car has been added.");
    }
    void start(){
        this.fuel = 100;
        if(fuel > 0){
            running = true;
            System.out.println("Car has started");
        }
    }
    void checkfuel(){
        System.out.println("Fuel : "+ this.fuel );
    }
    void stop(){
        running = false;
        this.fuel = 0;
        System.out.println("Car has stopped running");
    }
    public static void main(String[] args){
        CarProblem car1 = new CarProblem("Redo", "Minga", "NG4598");
        car1.start();
        car1.checkfuel();
        car1.stop();
        car1.checkfuel();
    }
}