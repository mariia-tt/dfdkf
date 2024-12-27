package edu.ucu.ua.traskone;

public class ATM {

    private Section firstSection;

    public ATM() {
        firstSection = new SectionFiveHun();
        firstSection.setNext(new SectionTwoHun())
                    .setNext(new SectionOne());
    }

    public Section getFirstSection() {
        return firstSection;
    }

    public void setFirstSection(Section newSection) {
        this.firstSection = newSection;
    }

    public void process(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Amount must be greater than zero.");
        }
        firstSection.process(amount);
    }
}
