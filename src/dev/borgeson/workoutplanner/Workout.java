package dev.borgeson.workoutplanner;

import java.util.Arrays;

public class Workout {
    private boolean compound;
    // Movement relates to Push or Pull
    // True means Push
    // False means Pull
    private boolean movement;
    private boolean alwaysUsed;
    private String name;
    private int type;
    private int repMin;
    private int repMax;
    /*
     * Type: Relates to which body part
     *      0 Chest         true
     *      1 Triceps       true
     *      2 Shoulders     false
     *      3 Back          false
     *      4 Bicep         false
     *      5 Legs          true
     *      6 Core          true/false
     */

    public void Workout(boolean compound, boolean movement, String name, int type, int repMin, int repMax) {
        this.compound = compound;
        this.movement = movement;
        this.name = name;
        this.type = type;
        this.repMin = repMin;
        this.repMax = repMax;
    }

    public void Workout(boolean compound, boolean movement, String name, int type, int repMin, int repMax
            , boolean alwaysUsed) {
        this.compound = compound;
        this.movement = movement;
        this.name = name;
        this.type = type;
        this.repMin = repMin;
        this.repMax = repMax;
        this.alwaysUsed = alwaysUsed;
    }

    public boolean isCompound() {
        return compound;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public int getRepMin() {
        return repMin;
    }

    public int getRepMax() {
        return repMax;
    }

    public boolean getMovement() {return movement;}

    public boolean getAlwaysUsed() {return alwaysUsed;}

    public String getReps() {
        SetRepCalc getter = new SetRepCalc(this.repMin, this.repMax, this.compound);

        String result = Arrays.toString(getter.setsOfReps()).replace("[", "").replace("]", "").replace(" ","");

        return result;
    }


}
