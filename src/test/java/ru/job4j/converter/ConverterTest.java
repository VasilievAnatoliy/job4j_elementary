package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expectedEuro, outEuro, eps);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        float in = 180;
        float expectedDollar = 3;
        float outDollar = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expectedDollar, outDollar, eps);
    }
}