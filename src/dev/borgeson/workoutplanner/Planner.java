package dev.borgeson.workoutplanner;

public class Planner {
    public static void main (String[] args) {
        ThreeDaySplit tester = new ThreeDaySplit();
        System.out.println(ret());
    }

    public static String ret() {
        ThreeDaySplit tester = new ThreeDaySplit();
        return tester.asString();
    }
}
