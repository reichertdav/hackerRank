package searchIndex;

class SearchIndex {

    private int[] sortArray;

    SearchIndex(int[] sortArray) {
        this.sortArray = sortArray;
    }

    int search(int v) {
        for (int i = 0; i < sortArray.length; i++) {
            if (sortArray[i] == v) {
                return i;
            }
        }
        return -1;
    }

}
