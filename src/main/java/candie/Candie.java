package candie;

class Candie {


    int ditrib(int[] studentRank) {
        int studentQuantity = studentRank.length;
        int[] ascending = new int[studentQuantity];
        int[] descending = new int[studentQuantity];
        ascending[0] = 1;
        descending[studentQuantity - 1] = 1;
        int previousAscendingRank = studentRank[0];
        int previousDescendingRank = studentRank[studentQuantity - 1];
        for (int i = 1; i < studentQuantity; i++) {
            if (previousAscendingRank < studentRank[i]) {
                ascending[i] = ascending[i - 1] + 1;

            } else {
                ascending[i] = 1;
            }
            previousAscendingRank = studentRank[i];

            if (previousDescendingRank < studentRank[(studentQuantity - i - 1)]) {
                descending[(studentQuantity - i - 1)] = descending[(studentQuantity - i)] + 1;
            } else {
                descending[(studentQuantity - i - 1)] = 1;

            }
            previousDescendingRank = studentRank[(studentQuantity - i - 1)];

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
