package gq.tumit.categorytheoryforprogrammers.ch01;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;

public class IdentityFunction_id {

    @Test
    void idString() {

        String myStr = "text";

        Function<String, String> id = (x) -> x;

        assertThat(id.apply(myStr)).isEqualTo(myStr);
    }

    @Test
    void idInt() {
        Integer myInt = 10;
        Function<Integer, Integer> id = (x) -> x;

        assertThat(id.apply(myInt)).isEqualTo(myInt);
    }
}
