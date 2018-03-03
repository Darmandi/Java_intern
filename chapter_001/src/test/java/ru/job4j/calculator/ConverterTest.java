package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    private final int RUBINEU = 70;
    private final int RUBINUSD = 60;
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(RUBINUSD);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(RUBINEU);
        assertThat(result, is(1));
    }

    @Test
    public void when1DollarTo60Ruble() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(1);
        assertThat(result, is(RUBINUSD));
    }

    @Test
    public void when1EuroTo70Ruble() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1);
        assertThat(result, is(RUBINEU));
    }
}