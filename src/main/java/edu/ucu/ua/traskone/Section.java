package edu.ucu.ua.traskone;

import java.util.IllformedLocaleException;

public class Section {

    private int domination;
    private Section next;

    public Section(int domination) {
        this.domination = domination;
    }

    public Section setNext(Section next) {
        this.next = next;
        return next;
    }

    private boolean hasNext() {
        return next != null;
    }

    public void process(int amount) {
        int left = amount % domination;
        int quantity = amount / domination;

        System.out.println("Denomination: " + domination
                + "\nQuantity: " + quantity + "\n");

        if (left != 0) {
            if (hasNext()) {
                next.process(left);
            } else {
                throw new IllformedLocaleException("Remaining amount cannot be processed: " + left);
            }
        }
    }
}
