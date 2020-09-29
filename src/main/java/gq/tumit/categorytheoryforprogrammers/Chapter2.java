package gq.tumit.categorytheoryforprogrammers;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class Chapter2 {

  private static Map<Function, Integer> cache = new ConcurrentHashMap<>();

  public static Integer memoize(Function<Function, Integer> fn) {
    return cache.computeIfAbsent(fn, fn);
  }
}
