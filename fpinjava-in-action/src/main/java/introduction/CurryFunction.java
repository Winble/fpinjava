package introduction;

import java.util.function.Function;

/**
 * Create on 2021/3/31
 *
 * @author bowenzhang
 */
public class CurryFunction {

    public static final Function<Integer, Function<Integer, Integer>> add = x -> y -> x + y;

    public static void main(String[] args) {
        System.out.println(add.apply(1).apply(2));
    }
}
