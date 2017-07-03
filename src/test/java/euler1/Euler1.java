package euler1;

public class Euler1 {


    public Euler1() {
    }

    public long foundSumOfMultipleOf3and5(int n) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 | i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int foundSumOfMultipleOf3and5Version2(int n) {
        int sum = 0;
        for (int i = 0; i < n; i= i+3) {
            if (i < n) {
                sum += i;
            }
        }
        for (int i = 0; i < n; i = i + 5) {
            if (i < n && i/3 !=0) {
                sum += i;
            }
        }
        return sum;
    }

    public int foundSumOfMultipleOf3and5Version3(int n) {
        int sum = 0;
        int multiple3 =0 ;
        for (int i = 0;  multiple3 < n; i++) {
            multiple3 = i * 3;
            sum += multiple3;
            int multiple5 = i * 5;
            if(multiple5 < n && multiple5%3 !=0){
                sum += multiple5;
            }

        }

        return sum;
    }

}
