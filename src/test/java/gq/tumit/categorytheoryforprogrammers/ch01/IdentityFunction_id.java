package gq.tumit.categorytheoryforprogrammers.ch01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IdentityFunction_id {

    @Test
    void idString() {
        String x = "x";
        String actual = IdentityFunction.id(x);
        assertThat(actual).isEqualTo(x);
    }

    @Test
    void idInt() {
        Integer x = 10;
        Integer actual = IdentityFunction.id(x);
        assertThat(actual).isEqualTo(x);
    }
}
