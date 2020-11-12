package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        Queue <String> Professors= new LinkedList <>();
        Professors.add("Kol");
        Professors.add("Mayas");
        Professors.add("Gina");
        Professors.add("Bosch");
        System.out.println("peek : "+Professors.peek());
        System.out.println("remove : "+Professors.remove());
        System.out.println("poll : "+Professors.poll());
        for(String x : Professors){
            System.out.println("for loop : "+x);
        }
        System.out.println("=====================");
        Iterator it = Professors.iterator();
        while(it.hasNext()) {
            System.out.println( "Iterator : " + it.next() );

        }


        }

}
