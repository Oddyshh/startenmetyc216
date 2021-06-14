import java.util.*;

public class Lingo {
    public static void main(String[] args) {
        SpeelWoord woord = new SpeelWoord();
        woord.spelen();

    }
    
}


class SpeelWoord {
    Scanner scan = new Scanner(System.in);
    String woord = "fiets";
    String aantalLettersString = "";
    int aantalLetters;

    void aantalLetters() {
        for (int x = 1; x < woord.length() + 1; x++) {
            aantalLetters += 1;
            aantalLettersString += "_";
        }
        System.out.println("Het woord bevat " + aantalLetters + " letters: ");
        System.out.println(aantalLettersString);
    }


    void spelen() {
        char[] resultWoord = new char[woord.length()];
        char[] resultArray = new char[woord.length()];
        String spelerKeuze = new String();
        char[] spelerArray = spelerKeuze.toCharArray();
        
        for (int i = 0; i < woord.length(); i++) {
            resultArray[i] = '2';
        }
        
        this.aantalLetters();

        while (!Arrays.equals(resultArray, spelerArray)) {
            System.out.println("Kies een woord van " + aantalLetters + " letters: ");
            spelerKeuze = scan.nextLine();
            
            
            if (spelerKeuze.length() != aantalLettersString.length()) {
                this.spelen();
            } else {
                for (int i = 0; i < spelerKeuze.length(); i++) {
                    String letter = Character.toString(spelerKeuze.charAt(i));
                    if (spelerKeuze.charAt(i) == woord.charAt(i)) {
                        resultArray[i] = '2';
                        resultWoord[i] = spelerKeuze.charAt(i);
                    } else if (spelerKeuze.charAt(i) != woord.charAt(i) &&  woord.contains(letter)) {
                        resultArray[i] = '1';
                        resultWoord[i] = '_';
                    } else {
                        resultArray[i] = '0';
                        resultWoord[i] = '_';
                    }
                }
                System.out.println(Arrays.toString(resultArray));
                System.out.println(Arrays.toString(resultWoord));
            }
        }
    }
}