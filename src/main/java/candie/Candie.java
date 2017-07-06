package candie;

class Candie {


    int ditrib(int[] studentRank) {
        int studentQuantity = studentRank.length;
        int[] ascending = new int[studentQuantity];
        int[] descending = new int[studentQuantity];
        ascending[0] = 1;
        descending[studentQuantity - 1] = 1;
        int previousAscendingRank = 1;
        int previousDescendingRank = 1;
        for (int i = 1; i < studentQuantity; i++) {
            if (previousAscendingRank < studentRank[i]) {
                previousAscendingRank++;
            } else {
                previousAscendingRank = 1;
            }
            ascending[i] = previousAscendingRank;

            if (previousDescendingRank > studentRank[(studentQuantity - i-1)]) {
                previousDescendingRank++;
            } else {
                previousDescendingRank = 1;
            }
            descending[studentQuantity - i-1] = previousDescendingRank;

        }
        int candieToditrub = 0;
        for (int i = 0; i < studentQuantity; i++) {
            if (ascending[i] > descending[i]) {
                candieToditrub += ascending[i];
            } else {
                candieToditrub += descending[i];
            }
        }
        return candieToditrub;
    }
}
