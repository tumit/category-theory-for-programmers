package gq.tumit.categorytheoryforprogrammers;

import java.util.function.Function;

public class Chapter1 {

    public static <T> T identity(T x) {
        return x;
    }

    public static <T> Function<T, T> composite(Function<T, T> fn1, Function<T, T> fn2) {
        return fn1.compose(fn2);
    }

}
