package kangaroo;


public class Kangaroo {

    private int position;
    private int moves;


    public Kangaroo(int position, int moves) {
        this.position = position;
        this.moves = moves;
    }


    public boolean isCatch(Kangaroo secondkangaroo) {
        if (position > secondkangaroo.position && moves > secondkangaroo.moves) {
            return false;
        }
        if (position < secondkangaroo.position && moves < secondkangaroo.moves) {
            return false;
        }

        if (moves == secondkangaroo.moves) {
            return false;
        }

        return intersection(secondkangaroo);

    }

    public boolean intersection(Kangaroo secondKangaroo) {
        int pos = position - secondKangaroo.position;
        int mov = secondKangaroo.moves - moves;
        if (pos % mov == 0) {
            return true;
        }
        return false;

    }
}
