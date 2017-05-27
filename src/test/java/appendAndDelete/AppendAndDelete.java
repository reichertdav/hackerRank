package appendAndDelete;

import static appendAndDelete.Position.*;

public class AppendAndDelete {

    String string1;
    String string2;

    public AppendAndDelete(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    public String append() {
        return string1 + string2;
    }

    public String delete(Position position) {
        switch (position) {
            case FIRST:
                int lengthString1 = string1.length();
                if(lengthString1 < 1){
                    return "";
                }
                string1 = string1.substring(0, string1.length() - 1);
                return string1;
            case SECOND:
                int lengthString2 = string2.length();
                if(lengthString2 < 1) {
                    return "";
                }
                string2 = string2.substring(0, string2.length() - 1);
                return string2;
            default:
                return "";
        }
    }
}
