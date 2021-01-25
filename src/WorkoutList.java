public class WorkoutList {
    // Chest
    private static final Workout BENCHPRESS_BB = new Workout();
    private static final Workout INCLINE_BB = new Workout();
    private static final Workout DECLINE_BB = new Workout();
    private static final Workout FLY_HTL = new Workout();
    private static final Workout FLY_CABLE = new Workout();
    private static final Workout FLY_LTH = new Workout();
    private static final Workout BENCHPRESS_DB = new Workout();
    private static final Workout INCLINE_DB = new Workout();
    private static final Workout PLATE_PRESS = new Workout();
    private static final Workout FLY_DB = new Workout();

    // Triceps
    private static final Workout DIPS = new Workout();
    private static final Workout SKULL_BB = new Workout();
    private static final Workout OH_EXTENSIONS_DB = new Workout();
    private static final Workout ARM_EXTENSION_CABLE = new Workout();
    private static final Workout OH_EXTENSIONS_CABLE = new Workout();
    private static final Workout SKULL_DB = new Workout();
    private static final Workout CABLE_EXTENSIONS_HTL = new Workout();

    // Shoulders
    private static final Workout OHP = new Workout();
    private static final Workout VERT_FLY = new Workout();
    private static final Workout SHOULDER_MACHINE = new Workout();
    private static final Workout ARNOLD = new Workout();
    private static final Workout SHOULDER_PRESS_DB = new Workout();
    private static final Workout VERT_FRONT_RAISES = new Workout();
    private static final Workout LANDMINE_PRESS = new Workout();

    // Back
    private static final Workout DL = new Workout();
    private static final Workout SLDL = new Workout();
    private static final Workout LAT_PULL_CLOSE = new Workout();
    private static final Workout LAT_PULL_WIDE = new Workout();
    private static final Workout ROW_CABLE = new Workout();
    private static final Workout ROW_BB = new Workout();
    private static final Workout SHRUG = new Workout();
    private static final Workout INV_FLY = new Workout();
    private static final Workout PULL_UP = new Workout();

    // Biceps
    private static final Workout TWENTY_ONES = new Workout();
    private static final Workout PREACHER_DB = new Workout();
    private static final Workout HAMMER_CURL = new Workout();
    private static final Workout CABLE_CURL = new Workout();
    private static final Workout CURL_DB = new Workout();
    private static final Workout CURL_BB = new Workout();
    private static final Workout CURL_WIDE_GRIP = new Workout();
    private static final Workout CURL_CLOSE_GRIP = new Workout();

    // Legs
    private static final Workout SQUAT = new Workout();
    private static final Workout LEG_EXTENSIONS = new Workout();
    private static final Workout LEG_PRESS = new Workout();
    private static final Workout CALVE_RAISES_BB = new Workout();
    private static final Workout CALVE_MACHINE = new Workout();
    private static final Workout HAMSTRING_MACHINE = new Workout(); // Guarantee
    private static final Workout PAUSE_SQUAT = new Workout();

    // Core
    private static final Workout SIT_UP = new Workout();
    private static final Workout PLANK = new Workout();
    private static final Workout SIDE_TO_SIDE = new Workout();
    private static final Workout REVERSE_CRUNCH = new Workout();
    private static final Workout REVERSE_DIP = new Workout();
    private static final Workout LEG_RAISES = new Workout();


    // + addWorkout
    // + removeWorkout
    // + listWorkouts


//    private String workouts{
//        String result = "error";
//        BENCHPRESS.Workout(true, true, "Bench Press", 0, 3, 5);
//
//        // TODO use user input to output specified workout
//        if () {}
//
//        return result;
//    }
//
//    public void addWorkout (boolean c, boolean m, String n, int t, int min, int max) {
//
//    }
//
//    public void removeWorkout{}
//
//    public void listWorkouts{}\

    public WorkoutList() {
        init();
    }

    // TODO IDEA -- if user input is 3 day split, to form workouts, random select from each string array

    // Returns list of back workouts in order of if compound or not
    public String[] getBackWorkouts() {
        String[] workouts = {DL.getName(), SLDL.getName(), ROW_BB.getName(), PULL_UP.getName(), LAT_PULL_CLOSE.getName()
                , LAT_PULL_WIDE.getName(), ROW_CABLE.getName(), SHRUG.getName(), INV_FLY.getName()};
        return workouts;
    }

    public String[] getBicepWorkouts() {
        String[] workouts = {TWENTY_ONES.getName(), PREACHER_DB.getName(), HAMMER_CURL.getName(), CABLE_CURL.getName()
                , CURL_DB.getName(), CURL_BB.getName(), CURL_WIDE_GRIP.getName(), CURL_CLOSE_GRIP.getName()};
        return workouts;
    }

    public String[] getChestWorkouts() {
        String[] workouts = {BENCHPRESS_BB.getName(), INCLINE_BB.getName(), DECLINE_BB.getName(), FLY_LTH.getName()
                , FLY_HTL.getName(), FLY_CABLE.getName(), BENCHPRESS_DB.getName(), INCLINE_DB.getName()
                , PLATE_PRESS.getName(), FLY_DB.getName()};
        return workouts;
    }

    public String[] getTricepWorkouts() {
        String[] workouts = {DIPS.getName(), SKULL_BB.getName(), OH_EXTENSIONS_DB.getName()
                , ARM_EXTENSION_CABLE.getName(), OH_EXTENSIONS_CABLE.getName(), SKULL_DB.getName()
                , CABLE_EXTENSIONS_HTL.getName()};
        return workouts;
    }

    public String[] getShoulderWorkouts() {
        String[] workouts = {OHP.getName(), VERT_FLY.getName(), SHOULDER_MACHINE.getName(), ARNOLD.getName()
                , SHOULDER_PRESS_DB.getName(), VERT_FRONT_RAISES.getName(), LANDMINE_PRESS.getName()};
        return workouts;
    }

    public String[] getLegWorkouts() {
        String[] workouts = {SQUAT.getName(), LEG_EXTENSIONS.getName(), LEG_PRESS.getName(), CALVE_RAISES_BB.getName()
                , CALVE_MACHINE.getName(), HAMSTRING_MACHINE.getName(), PAUSE_SQUAT.getName()};
        return workouts;
    }

    public String[] getCoreWorkouts() {
        String[] workouts = {SIT_UP.getName(), PLANK.getName(), SIDE_TO_SIDE.getName(), REVERSE_DIP.getName()
                , REVERSE_CRUNCH.getName(), LEG_RAISES.getName()};
        return workouts;
    }
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

    // Initialize attributes
    public static void init() {
        // Chest 0
        BENCHPRESS_BB.Workout(true, true, "Barbell Bench Press", 0, 3, 10);
        INCLINE_BB.Workout(true, true,"Barbell Incline Press", 0, 5, 10);
        DECLINE_BB.Workout(true,true,"Barbell Decline Benchpress", 0, 8, 12);
        FLY_HTL.Workout(false, true, "High-to-Low Cable Fly", 0, 8, 12);
        FLY_CABLE.Workout(false,true,"Cable Fly", 0, 8, 12);
        FLY_LTH.Workout(false,true,"Low-to-High Cable Fly", 0, 8, 12);
        FLY_DB.Workout(false,true,"Dumbbell Fly", 0, 8,12);
        BENCHPRESS_DB.Workout(false,true,"Dumbbell Benchpress", 0, 8,12);
        INCLINE_DB.Workout(false,true,"Dumbbell Incline Press", 0, 8,12);
        PLATE_PRESS.Workout(false,true, "Plate Press", 0, 8,12);

        // Triceps 1
        DIPS.Workout(true,true,"Dips", 1,8,12);
        SKULL_BB.Workout(false,true,"Barbell Skullcrushers", 1,8,12);
        OH_EXTENSIONS_DB.Workout(false,true, "Dumbbell Overhead Tricep Extension", 1,8,12);
        ARM_EXTENSION_CABLE.Workout(false,true,"Cable Bent tricep extensions", 1,8,12);
        OH_EXTENSIONS_CABLE.Workout(false, true, "Cable Overhead Tricep Extensions", 1,8,12);
        SKULL_DB.Workout(false,true,"Dumbbell Skullcrushers", 1,8,12);
        CABLE_EXTENSIONS_HTL.Workout(false,true,"Cable Tricep Pulldown",1,8,12);

        // Shoulders 2
        OHP.Workout(true,true,"Barbell Overhead Press", 2,5,10);
        VERT_FLY.Workout(false,true,"Vertical Shoulder Fly", 2,8,12);
        SHOULDER_MACHINE.Workout(false,true,"Shoulder Machine", 2,8,15);
        ARNOLD.Workout(false,true,"Arnold Press", 2,8,10);
        SHOULDER_PRESS_DB.Workout(false,true, "Dumbbell Shoulder Press", 2,8,12);
        VERT_FRONT_RAISES.Workout(false,true,"Barbell Front Raises", 2,8,10);
        LANDMINE_PRESS.Workout(false,true,"Landmine Shoudler Press", 2,8,12);

        // Back 3
        DL.Workout(true, false, "Deadlift", 3, 3, 5);
        SLDL.Workout(true, false, "Straight Leg Deadlift", 3, 10, 15);
        LAT_PULL_CLOSE.Workout(false, false, "Close Grip Lat Pulldown", 3, 8, 14);
        LAT_PULL_WIDE.Workout(false,false, "Wide Grip Lat Pulldown", 3, 8, 14);
        ROW_BB.Workout(true, false, "Barbell Row", 3, 5, 8);
        ROW_CABLE.Workout(false, false, "Cable Row", 3, 8, 14);
        SHRUG.Workout(false, false, "Barbell Shrugs", 3, 8, 10);
        INV_FLY.Workout(false, false, "Inverse Fly's", 3, 8, 12);
        PULL_UP.Workout(true, false, "Pull-up", 3, 6, 10);

        // Bicep 4
        TWENTY_ONES.Workout(false, false, "Twenty-Ones", 4, 3,3);
        PREACHER_DB.Workout(false, false, "Dumbbell Preacher Curl", 4, 8,12);
        HAMMER_CURL.Workout(false,false,"Hammer Curl", 4,8,12);
        CABLE_CURL.Workout(false, false, "Cable Curls", 4, 8,12);
        CURL_DB.Workout(false,false,"Dumbbell Curl",4, 8,12);
        CURL_BB.Workout(false,false,"Barbell Curl",4, 8,12);
        CURL_CLOSE_GRIP.Workout(false,false,"Barbell Close Grip Curl", 4, 8,12);
        CURL_WIDE_GRIP.Workout(false,false,"Barbell Wide Grip Curl", 4, 8,12);

        // Legs 5
        SQUAT.Workout(true,true,"Squat",5,3,8);
        LEG_EXTENSIONS.Workout(false,true,"Leg Extension Machine", 5, 8,12);
        LEG_PRESS.Workout(false,true,"Leg Press", 5,8,10);
        CALVE_RAISES_BB.Workout(false,true,"Barbell Calve Raises", 5, 15,20);
        CALVE_MACHINE.Workout(false,true,"Calve Machine", 5, 15,20);
        HAMSTRING_MACHINE.Workout(false,false,"Hamstring Machine", 5,10,15,true);

        // Core 6
        SIT_UP.Workout(false,false,"Sit-ups",6,15,20);
        PLANK.Workout(false,false,"Plank",6,60,60);
        SIDE_TO_SIDE.Workout(false,false,"Side to Side",6,15,20);
        REVERSE_CRUNCH.Workout(false,false,"Reverse Crunch",6,10,15);
        REVERSE_DIP.Workout(false,false,"Reverse Dip",6,8,10);
        LEG_RAISES.Workout(false,false,"Leg Raises",6,10,15);
    }
}
