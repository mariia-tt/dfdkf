package edu.ucu.ua.tasktwo;

import java.util.function.Consumer;

public class Signature<T> extends Task<T> {
    private Consumer<T> consumer;
    public Signature(Consumer<T> newConsumer) {
        this.consumer = newConsumer;
    }

    public void apply(T arg) {
        this.freeze();
        consumer.accept(arg);
    }
}
