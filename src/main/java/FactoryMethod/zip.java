package FactoryMethod;

public class zip implements Doc_interface{
    @Override
    public void create_file() {
        System.out.println("Zip file is created...");
    }
}
