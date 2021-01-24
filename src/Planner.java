import java.util.Arrays;

public class Planner {
    public static void main (String[] args) {
        WorkoutList list = new WorkoutList();
        ThreeDaySplit tester = new ThreeDaySplit();

        list.init();
        // Testing classes Workout && SetRepCalc

        //
        System.out.println("BACK:");
        System.out.println(" " + replaceComma(list.getBackWorkouts()));

        System.out.println(Arrays.toString(tester.dayOne()));
    }

    private static String replaceComma(String[] tester) {
        return Arrays.toString(tester).replace("[", "").replace("]","").replace(",","\n");
    }
}
