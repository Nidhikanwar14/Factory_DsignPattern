package FactoryMethod;

public class tar implements Doc_interface{
    @Override
    public void create_file() {
        System.out.println("Tar file is created...");
    }
}
