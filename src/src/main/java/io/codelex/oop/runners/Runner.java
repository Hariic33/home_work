package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(251, 300),
    INTERMEDIATE(201, 250),
    ADVANCED(0, 200);

    private int minTime;
    private int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int marathonTime) {
        for (Runner runner : Runner.values()) {
            if (marathonTime >= runner.minTime && marathonTime <= runner.maxTime) {
                return runner;
            }
        }
        return ADVANCED;
    }
}