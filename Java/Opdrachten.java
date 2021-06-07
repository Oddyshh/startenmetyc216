import java.util.*;

public class Opdrachten {
    public static void main(String[] args) {
        Concatenation con = new Concatenation();
        con.concatenate();
    }
}

class Concatenation {
    String een = "po";
    String twee = "ging";
    void concatenate() {
        System.out.println(een + twee);
    }
}

