package dataTypeExperiment;

import java.util.LinkedList;
import java.util.Random;

/**
 * Class
 */
public class MyLinkedList extends MyArrayList implements LinkedListed{

    /**
     * Generating String array
     *
     * @return ArrayList
     */
    @Override
    public LinkedList<String> setLinkedList() {

        LinkedList<String> foo = new LinkedList<String>();
        Random random = new Random();
        for (int i = 0; i <= 10; i++) {
            foo.add(Integer.toString(random.nextInt(1000)));
        }
        return foo;
    }

}
