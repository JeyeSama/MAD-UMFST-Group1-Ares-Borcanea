public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog("Buddy", 3, "Labrador");

        System.out.println("Initial Information:");
        myDog.displayInfo();
        System.out.println();


        myDog.setAge(4);

        System.out.println("Updated Information:");
        myDog.displayInfo();
    }
}