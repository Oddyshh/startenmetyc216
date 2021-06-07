import java.util.*;

public class Opdrachten {
    public static void main(String[] args) {
        //Concatenation con = new Concatenation();
        //con.concatenate();
        //EsTellen hoeveel = new EsTellen();
        //hoeveel.Tellen("hottentottententententoonstelling");
        ArrayTellen artel = new ArrayTellen();
        System.out.println(artel.Tellen());
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

class ArrayTellen {
    int count = 0;
    int[] array = {1, 2, 3, 4, 5};
    int Tellen() {
        for (int i = 0; i < array.length; i++) {
            count += array[i];
        }
        return count;
    }
}