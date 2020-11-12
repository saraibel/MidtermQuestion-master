package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
        ArrayList <String> arraylist = new ArrayList <>();
        arraylist.add( "Aksel" );
        arraylist.add( "Liha" );
        arraylist.add( "Felecia" );
        arraylist.add( "Titou" );
        arraylist.add( "Winsen" );
        System.out.println( arraylist );
        arraylist.remove( "Liha" );
        arraylist.remove( 2 );
        System.out.println( "my names after removing are : " );
        for (int a = 0; a < arraylist.size(); a++) {
            System.out.println( arraylist.get( a ) );

        }
        System.out.println( "====================================================================" );

        Iterator <String> obj = arraylist.iterator();

        System.out.println( obj.next() );

        System.out.println( obj.hasNext() );
        System.out.println( "-----------" );
        while (obj.hasNext())
            System.out.println( obj.next() );
        System.out.println( "this is from for loop : " );

        for (Object A : arraylist) {
            System.out.println( A );

        }

    }
}