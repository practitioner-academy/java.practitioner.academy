package design_patterns.abstract_factory;

public class AbstractFactoryPatternTest {

    public static void main(String[] args) {

        AbstractCarFactory.buildCar("Ferrari");
        AbstractCarFactory.buildCar("Lamborgini");
        AbstractCarFactory.buildCar("Jaguar");

    }

}
