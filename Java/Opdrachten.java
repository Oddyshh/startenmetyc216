import java.util.*;

public class Opdrachten {
    public static void main(String[] args) {
        // Concatenation con = new Concatenation();
        // con.concatenate();
        // EsTellen hoeveel = new EsTellen();
        // hoeveel.Tellen("hottentottententententoonstelling");
        // ArrayTellen artel = new ArrayTellen();
        // System.out.println(artel.Tellen());
        // int[] array = new int[10];
        // BubbleSort sort = new BubbleSort();
        // array = sort.RandomNumbers(array);
        // System.out.println(Arrays.toString(array));
        // sort.Sorteren(array);
        // Auto auto = new Auto();
        // Monteur monteur = new Monteur();
        // monteur.repair(auto.fix, auto.onderdelen);
        // SortString sortstring = new SortString();
        // sortstring.Sort();
        // Lingo lingo = new Lingo();
        // lingo.spelen();
        // Kapitein kapitein = new Kapitein();
        // Boot boot = new Boot();
        // Speedboot speedboot = new Speedboot();
        // kapitein.varen(speedboot);
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
    int[] array = { 1, 2, 3, 4, 5 };

    int Tellen() {
        for (int i = 0; i < array.length; i++) {
            count += array[i];
        }
        return count;
    }
}

class BubbleSort {
    Random rand = new Random();

    int[] RandomNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }

    int[] Swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return arr;
    }

    void Sorteren(int[] arr) {
        System.out.println("Pre-sorted array: " + Arrays.toString(arr));
        for (int x = 0; x < arr.length; x++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    this.Swap(arr, i, i + 1);
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

class Auto {
    boolean[] fix = { true, true, true, true };
    String[] onderdelen = { "Motor", "Deur", "Voorruit", "Uitlaat" };
}

class Monteur {
    int kosten = 25;
    int totaal = 0;

    void repair(boolean[] fix, String[] onderdelen) {
        for (int i = 0; i < fix.length; i++) {
            if (fix[i] == true) {
                totaal += kosten;
                fix[i] = false;
                System.out.println(onderdelen[i] + " is gemaakt voor €" + kosten);
            }
        }
        System.out.println("Totale kosten: " + totaal);
    }
}

class SortString {
    Scanner scan = new Scanner(System.in);

    void Sort() {
        System.out.print("Input text to sort: ");
        String input = scan.nextLine();
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        System.out.println("Unsorted input: " + input);
        System.out.println("Sorted input: " + sortedString);
    }
}

class Lingo {
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
        char[] doelArray = woord.toCharArray();
        char[] resultWoord = new char[woord.length()];
        char[] resultArray = new char[woord.length()];
        String spelerKeuze = new String();

        for (int i = 0; i < woord.length(); i++) {
            resultArray[i] = '2';
        }

        this.aantalLetters();

        while (!Arrays.equals(resultWoord, doelArray)) {
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
                    } else if (spelerKeuze.charAt(i) != woord.charAt(i) && woord.contains(letter)) {
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
        System.out.println("Goedzo! Het woord was " + woord);
    }
}

class Boot {
    void starten() {
        System.out.println("We gaan varen!");
    }
}

class Speedboot extends Boot {
    @Override
    void starten() {
        System.out.println("Ik zet mijn pet even af!");
    }
}

class Kapitein {

    void varen(Boot boot) {
        boot.starten();
    }
}
