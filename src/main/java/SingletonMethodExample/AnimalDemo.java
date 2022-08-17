package SingletonMethodExample;

public class AnimalDemo {
    public static void main(String[] args){
//        Animal horse = new Animal();
//        horse.name();
        Animal animal = Animal.getName();
        animal.name();
    }
}
