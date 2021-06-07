import java.util.*;

public class Opdrachten {
    public static void main(String[] args) {
        //Concatenation con = new Concatenation();
        //con.concatenate();
        //EsTellen hoeveel = new EsTellen();
        //hoeveel.Tellen("hottentottententententoonstelling");
        //ArrayTellen artel = new ArrayTellen();
        //System.out.println(artel.Tellen());
        int[] array = new int[10];
        BubbleSort sort = new BubbleSort();
        array = sort.RandomNumbers(array);
        //System.out.println(Arrays.toString(array));
        sort.Sorteren(array);
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
        int itercount = 0;
        for (int x = 0; x < arr.length; x++) {
            for (int i = 0; i < arr.length - 1; i++) {
                itercount += 1;
                if (arr[i] > arr[i + 1]) {
                    this.Swap(arr, i, i+1);
                }
            }
        }
        System.out.println("Itterations: " + itercount);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }    
}