package introduction;

import java.util.stream.IntStream;

/**
 * Create on 2021/3/29
 *
 * @author bowenzhang
 */
public class LambdaTest {
    public static void printString(String s, Print<String> print) {
        print.print(s);
    }
    public static void main(String[] args) {
        printString("test", (x) -> System.out.println(x));
        IntStream.range(1, 10);
    }
}

@FunctionalInterface
interface Print<T> {
    public void print(T x);
}
