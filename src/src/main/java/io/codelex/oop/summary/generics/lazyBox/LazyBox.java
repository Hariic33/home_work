package io.codelex.oop.summary.generics.lazyBox;

import java.util.function.Supplier;

public class LazyBox<T> {
    private final Supplier<T> supplier;
    private T contents;

    public LazyBox(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T get() {
        if (contents == null) {
            contents = supplier.get();
        }
        return contents;
    }
}

