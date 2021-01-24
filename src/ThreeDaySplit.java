import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ThreeDaySplit {
    private WorkoutList list = new WorkoutList();
    // NEWLENGTH == length of array being copied
    private String[] chest = Arrays.copyOf(list.getChestWorkouts(), 10);
    private String[] tricep = Arrays.copyOf(list.getTricepWorkouts(), 7);
    private String[] shoulder = Arrays.copyOf(list.getShoulderWorkouts(), 7);
    private String[] back = Arrays.copyOf(list.getBackWorkouts(), 9);
    private String[] bicep = list.getBicepWorkouts();
    private String[] leg = list.getLegWorkouts();
    private String[] core = list.getCoreWorkouts();

    // TODO Complete method: Return string that reads each day in order in a neat way
    public String getPlan() {
        return null;
    }

    // TODO fill each stub -- grab 3 exercises, randomize, sort with compound first
    // 3 day split -- need 6 days

    // Back, Bicep
    public String[] dayOne() {
        String[] result = new String[6];

        for (int i = 0; i < 4; i++) {
            result [i] = chest[ThreadLocalRandom.current().nextInt(0, chest.length)];
        }

        for (int i = 3; i < 6; i++) {
            result [i] = bicep[ThreadLocalRandom.current().nextInt(0, bicep.length)];
        }

        return result;
    }

    // Chest, Triceps, Shoulders
//    public String[] dayTwo() {}
//
//    // Legs and Core
//    public String[] dayThree() {}
//
//    public String[] dayFour() {}
//
//    public String[] dayFive() {}
//
//    public String[] daySix() {}

}
