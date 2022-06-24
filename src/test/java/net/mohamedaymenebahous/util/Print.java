package net.mohamedaymenebahous.util;

import java.io.*;

public class Print {

    //print with a newline
    public void print(Object obj) {
        System.out.println(obj);
    }

    //print a newline
    public void print() {
        System.out.println();
    }

    //print without a newline break
    public void printnb(Object obj) {
        System.out.print(obj);
    }

    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }

}
