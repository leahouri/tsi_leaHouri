package Ex6;

public class Animals {
    public static void main(String... args){
        var cat = new Cat();
        var dog = new Dog();
        var fox = new Fox();

        cat.sound();
        dog.sound();
        fox.sound();
    }
}
