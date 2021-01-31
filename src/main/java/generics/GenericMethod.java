package generics;

public class GenericMethod {

    public <Val> void genericsMethod(Val data) {
        System.out.println("Generic method:");
        System.out.println("Data: " + data);
    }
}
