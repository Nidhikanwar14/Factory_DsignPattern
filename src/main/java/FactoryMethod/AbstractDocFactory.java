package FactoryMethod;


public class AbstractDocFactory {
    protected static Doc_interface createdoc(String variant) {
        switch (variant) {
            case "ZIP":
                return new zip();
            case "TAR":
                return new tar();
            case "RAR":
                return new rar();
        }
        return null;
    }

    public static Doc_interface order_doc(String variant) {
        return createdoc(variant);
    }
}
