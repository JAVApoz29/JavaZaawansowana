package exceptions;

public class CheckAgeAndWeightException extends RuntimeException {

    private String customeMessage;

    public CheckAgeAndWeightException(String customeMessage) {
        super(customeMessage);
        this.customeMessage = customeMessage;
    }

    @Override
    public String toString() {
        return "CheckAgeAndWeightException{" +
                "customeMessage='" + customeMessage + '\'' +
                '}';
    }
}
