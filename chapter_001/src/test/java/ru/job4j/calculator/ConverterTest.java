package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    private int rubineu = 70;
    private int rubinusd = 60;
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(rubinusd);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(rubineu);
        assertThat(result, is(1));
    }

    @Test
    public void when1DollarTo60Ruble() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(1);
        assertThat(result, is(rubinusd));
    }

    @Test
    public void when1EuroTo70Ruble() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1);
        assertThat(result, is(rubineu));
    }
}