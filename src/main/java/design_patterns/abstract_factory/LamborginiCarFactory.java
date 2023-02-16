package design_patterns.abstract_factory;

public class LamborginiCarFactory extends AbstractCarFactory {

    @Override
    protected void buildCar() {
        System.out.println("Lamborgini car built");
    }

}
