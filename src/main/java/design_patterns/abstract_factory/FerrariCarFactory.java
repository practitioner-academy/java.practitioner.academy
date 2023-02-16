package design_patterns.abstract_factory;

public class FerrariCarFactory extends AbstractCarFactory {

    @Override
    protected void buildCar() {
        System.out.println("Ferrari car built");
    }

}
