package design_patterns.singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {
        //instantiation logic not invocable by other classes
    }

    public static Singleton getInstance() {
        if(singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}