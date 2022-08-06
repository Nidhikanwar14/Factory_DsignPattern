package FactoryMethod;

public class Client {

    public static void main(String[] args) {
        Doc_interface document = AbstractDocFactory.order_doc("ZIP");
        document.create_file();
    }
}
