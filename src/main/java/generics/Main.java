package generics;

public class Main {

    public static void main(String[] args) {

        GenericClass<Integer> intObj = new GenericClass<>(5);
        System.out.println(intObj.getData());

        GenericClass<String> strObj = new GenericClass<>("Java zaawansowana");
        System.out.println(strObj.getData());

        GenericMethod genericMethod = new GenericMethod();
        genericMethod.<Integer>genericsMethod(5);

        genericMethod.<String>genericsMethod("Java zaawansowana");

        genericMethod.<Accout>genericsMethod(new Accout());

        GenericClass2<Integer> genericClass2 = new GenericClass2<>();
        genericClass2.display();

        AreaCalculator<Triangle> triangleAreaCalculator = new AreaCalculator<>(new Triangle());
        System.out.println(triangleAreaCalculator.calculateArea());

        Demo demo1 = new Demo(1);
        Demo demo2 = new Demo(2);

        if (demo1.compareTo(demo2) < 0) {
            // to coś robimy
        }

//        NonGenericClass intNonObj = new NonGenericClass(5);
//        NonGenericClass strNonObj = new NonGenericClass("Java zaawansowana");
//
//        intNonObj = strNonObj;
//
//        System.out.println(intNonObj.getData());
    }
}
