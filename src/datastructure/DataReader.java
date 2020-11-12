package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class DataReader {

    public static void main(String[] args) {
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */

        String textFile = System.getProperty( "user.dir" ) + "/src/data/self-driving-car.txt";
        FileReader file = null;
        BufferedReader bfile = null;
        try {
            file = new FileReader( "/Users/user/IdeaProjects/CodingExam/src/data/self-driving-car" );
            bfile = new BufferedReader( file );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            while ((textFile = bfile.readLine()) != null) {
                System.out.println( textFile );
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                file = null;
            }
            if (bfile != null) {
                bfile = null;
            }
        }
        System.out.println("==============================================================================================");
        ////////////////////////////////////

        Stack <String> stack = new Stack<>();

        stack.push("London") ;
        stack.push("Algiers") ;
        stack.push("Washington") ;
        stack.push("Paris") ;
        for (String str : stack){
            System.out.print(str);
        }
        System.out.println("+++++++++++++");
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.search("London"));






    }
}


