package design_patterns.singleton;

public class SingletonPatternTest {

    public static void main(String[] args) {

        // below statement won't work as the constructor is private
        // Singleton singleton = new Singleton();

        // below statement would work
        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton);

    }

}