package gq.tumit.categorytheoryforprogrammers;

import static gq.tumit.categorytheoryforprogrammers.Chapter1.composite;
import static gq.tumit.categorytheoryforprogrammers.Chapter1.identity;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

public class Chapter1Test {

  @Test
  void identity_str() {
    assertThat(identity("Hello")).isEqualTo("Hello");
  }

  @Test
  void identity_int() {
    assertThat(identity(1)).isEqualTo(1);
  }

  @Test
  void composite_str() {
    assertThat(composite(StringUtils::quote, StringUtils::capitalize).apply("tumit"))
        .isEqualTo("'Tumit'");
  }

  @Test
  void composite_and_identity() {

    var xid = composite(StringUtils::capitalize, Chapter1::identity).apply("hello");
    assertThat(xid).isEqualTo("Hello");

    var idx = composite(Chapter1::identity, StringUtils::capitalize).apply("hello");
    assertThat(idx).isEqualTo("Hello");
  }
}
