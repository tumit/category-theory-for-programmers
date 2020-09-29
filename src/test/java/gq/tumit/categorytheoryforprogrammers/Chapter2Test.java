package gq.tumit.categorytheoryforprogrammers;

import java.util.Random;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import org.springframework.util.StopWatch;

public class Chapter2Test {
  @Test
  void memoize() {
    for (int i = 0; i < 5; i++) {
      StopWatch sw = new StopWatch();
      sw.start();
      Integer output = Chapter2.memoize(x -> IntStream.range(0, 100).sum());
      sw.stop();
      System.out.println(i + ": output=" + output + ", time=" + sw.getTotalTimeNanos());
    }
  }

  @Test
  void memoize_Random() {
    Random random = new Random();
    for (int i = 0; i < 5; i++) {
      StopWatch sw = new StopWatch();
      sw.start();
      Integer output = Chapter2.memoize(x -> random.nextInt(50));
      sw.stop();
      System.out.println(i + ": output=" + output + ", time=" + sw.getTotalTimeNanos());
    }
  }

  @Test
  void memoize_MathDotRandom() {
    for (int i = 0; i < 5; i++) {
      StopWatch sw = new StopWatch();
      sw.start();
      Integer output = Chapter2.memoize(x -> (int) (Math.random() * 100));
      sw.stop();
      System.out.println(i + ": output=" + output + ", time=" + sw.getTotalTimeNanos());
    }
  }
}
