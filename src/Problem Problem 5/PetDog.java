public class PetDog{
    private String name;
    private int age;
    private String breed;
    PetDog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
        void bark(){
            System.out.println("Hala Madrid");
        }
        void spin(){
            System.out.println("Dog is spinning");
        }
        void run(){
            System.out.println("Dog is running");
        }
    public static void main(String[] args){
        PetDog p1 = new PetDog("Tiger", 12, "Sarail");
        System.out.println("My dogs name is "+ p1.name+ ", his age is "+ p1.age+", his breed is "+ p1.breed);
        p1.bark();
        p1.spin();
        p1.run();
    }
}