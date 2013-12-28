package dataTypeExperiment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class
 */
public class MyArrayList implements ArrayListed{

    /**
     * Generating String array
     *
     * @return ArrayList
     */
    @Override
    public ArrayList<String> setList() {

        ArrayList<String> foo = new ArrayList<String>();
        Random random = new Random();
        for (int i = 0; i <= 10; i++) {
            foo.add(Integer.toString(random.nextInt(1000)));
        }
        return foo;
    }

    /**
     * Printing list to console
     *
     * @param list - List<String>
     */
    @Override
    public void printList(List<String> list) {

        System.out.printf("\n%s, ", "array contain this elements: \n");
        for (String str : list) {
            System.out.printf("%s, ", str);
        }
    }
}
