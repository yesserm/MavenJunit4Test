package org.yesser;

import org.junit.Assert;
import org.junit.Test;

public class AritmeticaTest {
    @Test
    public void probarSuma()
    {
        Aritmetica arit = new Aritmetica();
        Assert.assertEquals(10.0, arit.sumar(5.0, 5.0), 0.0001);
        Assert.assertEquals(11.0, arit.sumar(6.0, 5.0), 0.0001);
        Assert.assertEquals(10.0, arit.sumar(6.0, 4.0), 0.0001);
    }

    @Test
    public void probarResta()
    {
        Aritmetica ar = new Aritmetica();
        Assert.assertEquals(2.0, ar.restar(6.0, 4.0), 0.0001);
    }
}