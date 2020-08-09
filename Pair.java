package com.vl.homework7;

public class Pair<K, V> {
    private K keys;
    private V values;

    public Pair(K keys, V values) {
        this.keys = keys;
        this.values = values;
    }

    public K getKeys() {
        return keys;
    }

    public V getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "keys=" + keys +
                ", values=" + values +
                '}';
    }
}
