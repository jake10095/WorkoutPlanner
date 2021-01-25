package dev.borgeson.workoutplanner;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ThreeDaySplit {
    private WorkoutList list = new WorkoutList();
    // NEWLENGTH == length of array being copied
    private String[] chest = Arrays.copyOf(list.getChestWorkouts(), 10);
    private String[] tricep = Arrays.copyOf(list.getTricepWorkouts(), 7);
    private String[] shoulder = Arrays.copyOf(list.getShoulderWorkouts(), 7);
    private String[] back = Arrays.copyOf(list.getBackWorkouts(), 9);
    private String[] bicep = Arrays.copyOf(list.getBicepWorkouts(), list.getBicepWorkouts().length);
    private String[] leg = Arrays.copyOf(list.getLegWorkouts(), list.getLegWorkouts().length);
    private String[] core = Arrays.copyOf(list.getCoreWorkouts(), list.getCoreWorkouts().length);

    // TODO Complete method: Return string that reads each day in order in a neat way
    public String getPlan() {
        return null;
    }

    // TODO fill each stub -- grab 3 exercises, randomize, sort with compound first
    // 3 day split -- need 6 days

    // Back, Bicep
    private String[] dayOne() {
        return assign(back, bicep);
    }

    // Chest, Triceps, Shoulders
    private String[] dayTwo() {
        return assign(chest, tricep, shoulder);
    }

    // Legs and Core
    private String[] dayThree() {
        return assign(leg, core);
    }

    private String[] dayFour() {
        return assign(back, bicep);
    }

    private String[] dayFive() {
        return assign(chest, tricep, shoulder);
    }

    private String[] daySix() {
        return assign(leg, core);
    }

    /**
     * Chooses random workout and adds to list.
     * @param partOne Exercise group one
     * @param partTwo Exercise group two
     * @return String[] of 3 exercises per body part
     */
    private String[] assign(String[] partOne, String[] partTwo) {
        String[] result = new String[6];

        /**
         * Description of following two for loops:
         *      Adds a random workout of each part to the result[]
         *      Verifies that the exercise isn't already used
         *      The same loops are used for the other assign method
         */
        for (int i = 0; i < 3; i++) {
            boolean test = false;
            String temp = partOne[ThreadLocalRandom.current().nextInt(0, partOne.length)];
            while(!test) {
                if (!(Arrays.asList(result).contains(temp))) {
                    result[i] = temp;
                    test = true;
                } else {
                    temp = partOne[ThreadLocalRandom.current().nextInt(0, partOne.length)];
                    test = false;
                }
            }
        }
        for (int i = 3; i < 6; i++) {
            boolean test = false;
            String temp = partTwo[ThreadLocalRandom.current().nextInt(0, partTwo.length)];
            while(!test) {
                if (!(Arrays.asList(result).contains(temp))) {
                    result[i] = temp;
                    test = true;
                } else {
                    temp = partTwo[ThreadLocalRandom.current().nextInt(0, partTwo.length)];
                    test = false;
                }
            }
        }
        return result;
    }

    /**
     * Chooses random workout and adds to list.
     * @param partOne Exercise group one
     * @param partTwo Exercise group two
     * @param partThree Exercise group three
     * @return String[] of 3 exercises per body part
     */
    private String[] assign(String[] partOne, String[] partTwo, String[] partThree) {
        String[] result = new String[9];

        for (int i = 0; i < 3; i++) {
            boolean test = false;
            String temp = partOne[ThreadLocalRandom.current().nextInt(0, partOne.length)];
            while(!test) {
                if (!(Arrays.asList(result).contains(temp))) {
                    result[i] = temp;
                    test = true;
                } else {
                    temp = partOne[ThreadLocalRandom.current().nextInt(0, partOne.length)];
                    test = false;
                }
            }
        }
        for (int i = 3; i < 6; i++) {
            boolean test = false;
            String temp = partTwo[ThreadLocalRandom.current().nextInt(0, partTwo.length)];
            while(!test) {
                if (!(Arrays.asList(result).contains(temp))) {
                    result[i] = temp;
                    test = true;
                } else {
                    temp = partTwo[ThreadLocalRandom.current().nextInt(0, partTwo.length)];
                    test = false;
                }
            }
        }
        for (int i = 6; i < 9; i++) {
            boolean test = false;
            String temp = partThree[ThreadLocalRandom.current().nextInt(0, partThree.length)];
            while(!test) {
                if (!(Arrays.asList(result).contains(temp))) {
                    result[i] = temp;
                    test = true;
                } else {
                    temp = partThree[ThreadLocalRandom.current().nextInt(0, partThree.length)];
                    test = false;
                }
            }
        }
        return result;
    }
    private void arrayToString(String[] input) {
        for(int i = 0; i < input.length; i++) {
            System.out.println("\t" +input[i]);
        }
    }

    /**
     * Neatly prints a weeks worth of workouts.
     */
    public void getWorkoutPlan() {
        System.out.println("Your Plan\n Day One:");
        arrayToString(dayOne());

        System.out.println(" Day Two:");
        arrayToString(dayTwo());

        System.out.println(" Day Three:");
        arrayToString(dayThree());

        System.out.println(" Day Four:");
        arrayToString(dayFour());

        System.out.println(" Day Five:");
        arrayToString(dayFive());

        System.out.println(" Day Six:");
        arrayToString(daySix());
    }
}
