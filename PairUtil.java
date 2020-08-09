package com.vl.homework7;

public final class PairUtil {

    static Pair swap(Pair pair) {
        Object key = pair.getKeys();
        Object value = pair.getValues();
        Pair swappedPair = new Pair(value, key);
        return swappedPair;
    }
}
