package iceCreamParlor;

public class IceCreamParlor {;
    int money;
    int numberOfPossibility;
    int[] posibilities ;

    public IceCreamParlor(int money, int numberOfPossibility, String posibilities) {
        this.money = money;
        this.numberOfPossibility = numberOfPossibility;
        this.posibilities = new int[numberOfPossibility];
        String[] posibilitiesCut = posibilities.split(" ");

        for (int i = 0; i < numberOfPossibility; i++) {
            this.posibilities[i] = Integer.parseInt(posibilitiesCut[i]);
        }

    }


    public String foundBestCombinaison() {
        for (int i = 0; i < numberOfPossibility; i++) {
            for (int j = i+1; j < numberOfPossibility; j++) {
                if (posibilities[i] + posibilities[j] == money) {
                    return (i+1) + " " + (j+1);
                }
            }
        }
        return "";
    }



}

