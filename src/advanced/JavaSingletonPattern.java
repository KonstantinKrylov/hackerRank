package advanced;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

public class JavaSingletonPattern {
    /**
     * https://www.hackerrank.com/challenges/java-singleton/problem
     */
}

class Singleton{
    private Singleton(){}
    public String str;
    private static Singleton exemplar = new Singleton();
    public static Singleton getSingleInstance(){
        return exemplar;
    }
}
