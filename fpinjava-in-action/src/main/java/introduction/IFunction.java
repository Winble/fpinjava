package introduction;

/**
 * Create on 2021/3/31
 *
 * @author bowenzhang
 */
@FunctionalInterface
public interface IFunction<T, R> {

    R apply(T arg);

    default <V> IFunction<V, R> compose(IFunction<V, T> f) {
        return x -> apply(f.apply(x));
    }
    
    static <T, R, V> IFunction<V, R> compose(IFunction<T, R> f, IFunction<V, T> g) {
        return x -> f.apply(g.apply(x));
    }
}
