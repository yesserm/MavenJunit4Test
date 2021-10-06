package org.yesser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Aritmetica arit = new Aritmetica();
        System.out.println("suma: " + arit.sumar(10.0,50.0));
        System.out.println("resta: " + arit.restar(50.0,10.0));
    }
}
