package io.codelex.enums.practice.CardinalPoints;

public class PrintingEnum {
    public static void main(String[] args) {
        for (CardinalPoints direction : CardinalPoints.values()) {
            switch (direction) {
                case NORTH, WEST, SOUTH, EAST ->
                        System.out.println(direction.getDirection() + ':' + direction.getText() + ':' + direction.ordinal());
            }
        }
    }
}