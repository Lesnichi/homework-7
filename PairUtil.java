public final class PairUtil {

    private PairUtil() {
    }

    static <K, V> Pair<V, K> swapped(Pair<K, V> pair) {
        return new Pair<>(pair.getValue(), pair.getKey());
    }
}
