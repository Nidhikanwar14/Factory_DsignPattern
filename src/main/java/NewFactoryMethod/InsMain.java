package NewFactoryMethod;

public class InsMain {
    public static void main(String[] args){
        Insurance obj = InsFactory.getInsType(InsuranceTYPE.HEALTH);
        Health_Interface obj1 = obj.getHealthInsurance(InsuranceTerm.LONG_TERM);
        obj1.getHealthInsurance();

    }
}
