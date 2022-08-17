package SingletonMethodExample;

public class Animal {
    private static Animal dog = new Animal();


    private Animal(){}

    public static Animal getName(){
        return dog;
    }

    public void name(){
        System.out.println("Dog name is whiskeyy..");
    }
}
