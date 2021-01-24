import java.util.concurrent.ThreadLocalRandom;

public class SetRepCalc {
    private int repMin;
    private int repMax;
    private int sets;
    private boolean compound;

    public SetRepCalc(int repMin, int repMax, boolean compound) {
        this.repMax = repMax;
        this.repMin = repMin;
        this.compound = compound;

        // Determines amount of reps. if compound, more set
        if (compound) {
            sets = 6;
        } else {
            sets = 4;
        }
    }

    // Assigns random number of reps within a set array.
    // Uses min and max reps.
    public int[] setsOfReps() {
        int[] result = new int[this.sets];
        for (int i = 0; i < result.length; i++) {

            result[i] = getRandomNumberInRange();
        }
        return result;
    }

    // Generates random number within repMin and repMax range.
    private int getRandomNumberInRange() {
        int r = ThreadLocalRandom.current().nextInt(repMin, repMax + 1);
        return r;
    }
}
