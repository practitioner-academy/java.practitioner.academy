package design_patterns.abstract_factory;

public abstract class AbstractCarFactory {

    protected abstract void buildCar();

    private static final AbstractCarFactory FERRARI_CAR_FACTORY = new FerrariCarFactory();

    private static final AbstractCarFactory LAMBORGINI_CAR_FACTORY = new LamborginiCarFactory();

    public static final void buildCar(String carCompany) {
        switch (carCompany) {
            case "Ferrari":
                FERRARI_CAR_FACTORY.buildCar();
                break;
            case "Lamborgini":
                LAMBORGINI_CAR_FACTORY.buildCar();
                break;
            default:
                System.out.println("Not associated with provided car company");
        }
    }

}
