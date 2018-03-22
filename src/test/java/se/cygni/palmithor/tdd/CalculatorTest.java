package se.cygni.palmithor.tdd;


import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void test() {

        assertThat(calculator.sumAll(null).isPresent()).isFalse();
        assertThat(calculator.sumAll(new Integer[0]).get()).isEqualTo(0);
        assertThat(calculator.sumAll(1,2).get()).isEqualTo(3);
        assertThat(calculator.sumAll(1,2,3,4).get()).isEqualTo(10);
    }
}