package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private final int dimensions;
    private final int numOfCopies;
    private final int costPerCopy;

    public Poster(int fee, int dimensions, int numOfCopies, int costPerCopy) {
        super(fee);
        this.dimensions = dimensions;
        this.numOfCopies = numOfCopies;
        this.costPerCopy = costPerCopy;
    }

    @Override
    public int cost() {
        return super.cost() + dimensions * numOfCopies * costPerCopy;
    }

    @Override
    public String toString() {
        return super.toString() + " Poster: fee= " + fee +
                ", dimensions=" + dimensions +
                ", numOfCopies=" + numOfCopies +
                ", costPerCopy=" + costPerCopy;
    }
}
