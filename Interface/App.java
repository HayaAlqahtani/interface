package Interface;

public class App {
    public static void main(String[] args) {
        Animal myCat = new cat();
        Animal myDog = new dog();
        myCat.eat();
        myCat.sleep();
        myCat.makeSound();
        myDog.eat();
        myDog.sleep();
        myDog.makeSound();

}
}