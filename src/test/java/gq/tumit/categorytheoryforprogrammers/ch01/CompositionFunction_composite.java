package gq.tumit.categorytheoryforprogrammers.ch01;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;

public class CompositionFunction_composite {
    @Test
    void composite() {
        // arrange
        Function<Integer, Integer> plusOne = (i) -> i + 1;
        Function<Integer, Integer> plusTwo = (i) -> i + 2;
        Function<Integer, Integer> plusThree = plusOne.compose(plusTwo);

        // act
        Integer result = plusThree.apply(10);

        // assert
        assertThat(result).isEqualTo(13);
    }
}
