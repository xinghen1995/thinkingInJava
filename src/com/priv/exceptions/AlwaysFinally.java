package com.priv.exceptions;
import static com.priv.util.Print.*;

class FourException extends Exception {
}

public class AlwaysFinally {
    public static void main(String[] args) {
        print("Entering first try block");
        try {
            print("Entering second try block");
            try {
                throw new FourException();
            } finally {
                print("finally in 2nd try block");
            }
        } catch(FourException e){
            System.out.println(
                    "Caught FourException in 1st try block"
            );
        } finally {
            System.out.println("finally in 1st try block");
        }
    }
}
