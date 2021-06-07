import java.util.*;

public class Opdrachten {
    public static void main(String[] args) {
        Concatenation con = new Concatenation();
        con.concatenate();
        EsTellen hoeveel = new EsTellen();
        hoeveel.Tellen("hottentottententententoonstelling");
    }
}

class Concatenation {
    String een = "po";
    String twee = "ging";
    void concatenate() {
        System.out.println(een + twee);
    }
}

class EsTellen {
    int count = 0;
    void Tellen(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'e') {
                count++;
            }
        }
        System.out.println(count + " E's in " + string);
    }
}