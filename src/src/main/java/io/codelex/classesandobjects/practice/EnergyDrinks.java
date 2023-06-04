package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
    final int NUMBERED_SURVEYED = 12467;
    final double PURCHASED_ENERGY_DRINKS = 0.14;
    final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        EnergyDrinks stats = new EnergyDrinks();

        double energyDrinkers = stats.calculateEnergyDrinkers();
        double preferCitrus = stats.calculatePreferCitrus();

        System.out.println("Total number of people surveyed " + stats.NUMBERED_SURVEYED);
        System.out.println("Approximately " + String.format("%.0f", energyDrinkers) + "% bought at least one energy drink");
        System.out.println(String.format("%.0f", preferCitrus) + "% of those " + "prefer citrus flavored energy drinks.");

        System.out.println("The approximate number of customers in the survey who purchased one or more energy drinks per week: "
                + (int) (stats.NUMBERED_SURVEYED * (energyDrinkers / 100)));
        System.out.println("The approximate number of customers in the survey who prefer citrus flavored energy drinks: "
                + (int) (stats.NUMBERED_SURVEYED * (preferCitrus / 100)));
    }

    public double calculateEnergyDrinkers() {
        return PURCHASED_ENERGY_DRINKS * 100;
    }

    public double calculatePreferCitrus() {
        return PREFER_CITRUS_DRINKS * 100;
    }
}
