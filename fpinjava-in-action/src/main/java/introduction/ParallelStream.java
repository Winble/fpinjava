package introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Create on 2021/3/30
 *
 * @author bowenzhang
 */
public class ParallelStream {

    public static void main(String[] args) {

        // ArrayIndexOutOfBoundsException
        parallelTest1();

    }

    private static void parallelTest1() {
        List<Integer> values = new ArrayList<>();
        IntStream.range(1, 10000).parallel().forEach(values::add);
        System.out.println(values.size());
    }
}
