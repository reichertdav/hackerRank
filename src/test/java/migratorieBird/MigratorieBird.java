package migratorieBird;

public class MigratorieBird {
    public int countMaxBird(String birds) {
        int [] birdTypes = {0,0,0,0,0};
        for (String bird : birds.split(" ")) {
            int birdType = Integer.parseInt(bird);
            birdTypes[birdType - 1]++;
        }

        int max = -1;
        int maxPosition = 0;
        for (int i = 0; i < birdTypes.length; i++) {

            if(max < birdTypes[i]){
                max = birdTypes[i];
                maxPosition = i;
            }
        }
        return maxPosition + 1;
    }
}
