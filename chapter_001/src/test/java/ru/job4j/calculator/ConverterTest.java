package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    private final int Rubineu = 70;
    private final int Rubinusd = 60;
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(Rubinusd);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(Rubineu);
        assertThat(result, is(1));
    }

    @Test
    public void when1DollarTo60Ruble() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(1);
        assertThat(result, is(Rubinusd));
    }

    @Test
    public void when1EuroTo70Ruble() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1);
        assertThat(result, is(Rubineu));
    }
}