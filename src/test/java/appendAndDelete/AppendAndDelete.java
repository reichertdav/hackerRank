package appendAndDelete;

public class AppendAndDelete {

    String string1;
    String string2;
    int operationQuantity;


    public AppendAndDelete(String string1, String string2, int operationNumber) {
        this.string1 = string1;
        this.string2 = string2;
        this.operationQuantity = operationNumber;

    }

    public String append() {
        return string1 + string2;
    }


    public int diff() {
        return string1.compareTo(string2);
    }

    public boolean isPossible() {
        return diff() <= operationQuantity;
    }

    public void possibleString() {
        if(isPossible()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
