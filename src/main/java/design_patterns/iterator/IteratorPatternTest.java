package design_patterns.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorPatternTest {

    public static void main(String[] args) {

        List<String> listOfNames = List.of("John", "Jane", "Tom", "Richard");

        Set<String> setOfNames = Set.of("John", "Jane", "Tom", "Richard");

        Iterator<String> listOfNamesIterator = listOfNames.iterator();
        // below iterator always returns the items in same order as insertion
        while (listOfNamesIterator.hasNext()) {
            System.out.println(listOfNamesIterator.next());
        }

        System.out.println();

        // below iterator does not return the items in same order as insertion
        Iterator<String> setOfNamesIterator = setOfNames.iterator();
        while (setOfNamesIterator.hasNext()) {
            System.out.println(setOfNamesIterator.next());
        }

    }

}
