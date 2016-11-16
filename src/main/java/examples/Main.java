package examples;

import closableUtils.Using;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by atrposki on 11/16/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Using.Closable(()->new PrintStream("C:\\Users\\atrposki\\fileName"),
        x->{
            x.println("Print smthing to file");
        });
        //the print stream is closed in a finally block
    }

}
