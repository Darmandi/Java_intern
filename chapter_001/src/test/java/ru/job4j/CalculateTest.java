package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author Dmitrii Saraev (guitarpro4@mail.ru)
 * @version 1
 * @since 7.12.2017
 */
public class CalculateTest {
	/**
	 * Test echo.
	 */ @Test
	public void whenTakeNameThenTreeEchoPlusName() {
		String input = "Dmitrii Saraev";
		String expect = "Echo, echo, echo : Dmitrii Saraev";
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}

}