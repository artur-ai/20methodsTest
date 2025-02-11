import java.util.Arrays;

public class Main {
    public static void main( String[] args) {
    }

    public void charArray (char[] array) {
        System.out.println(array);
    }

    public char[] toCharArray (int[] array){
        char[] charArray = new char[array.length];
        for (int i =0; i<array.length; i++) {
            char symbol =(char) array[i];
            charArray[i] = symbol;
        }
        return charArray;
    }

    public int maxValue (int a, int b) {
        return (a > b) ? a : b;
    }

    public int maxValue (int c, int e, int d){
        return (c > d) ? ((c > e) ? c : e) : ((e > d) ? e : d);
    }

    public int maxValue (int f, int h, int g, int j, int k) {
        return (f > h) ? ((f > g) ? ((f > j) ? ((f > k) ? f : k) : ((j > k) ? j : k)) : ((g > j) ? ((g > k) ? g : k) : ((j > k) ? j : k))) : ((h > g)
                ? ((h > j) ? ((h > k) ? h : k) : ((j > k) ? j : k)) : ((g > j) ? ((g > k) ? g : k) : ((j > k) ? j : k)));
    }

    public String charToString (char[] chars) {
        return new String(chars);
    }

    public int indexOf (int [] array1, int value) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int indexOfEnd (int[] arraythird, int valuef){
        for (int i = arraythird.length - 1; i >= 0; i--){
            if (arraythird[i] == valuef){
                return i;
            }
        }
        return -1;
    }

    public int factorial (int q){
        if (q < 0) {
            System.out.println("Factorial is not defined for a negative number");
        }
        if (q == 0 || q == 1) {
            return 1;
        }
        return q * factorial(q - 1);
    }

    public boolean isLeapYear (int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            return true;
        } else {
            return false;
        }
    }

    public void multiple (int[] array, int number){
        for (int num : array) {
            if (num % number == 0) {
                System.out.println("The number is a multiple of "  + number + ": " + num);
            }
        }
    }

    public void sorting (int [] array){
        boolean isSorted = false;
        int index;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i]> array[i+1]){
                    isSorted = false;

                    index = array[i];
                    array[i] = array[i+1];
                    array[i+1] = index;
                }
            }
        }
    }

    public boolean reiteration (byte [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public int [] arrsMath (int[] arrayFirst, int[] arraySecond) {
        int [] arrayResult = new int[arrayFirst.length];
        for (int i = 0; i < arrayFirst.length; i++) {
            arrayResult[i] = arrayFirst[i] * arraySecond[i];
        }
        return arrayResult;
    }

    public int [] offSet (int [] arrayfirst, int [] arraysecond) {
       int size = arrayfirst.length + arraysecond.length;
       int [] arrayResult = new int[size];
       int index = 0;
        for (int i = 0; i < arrayfirst.length; i++) {
            boolean  found = false;
            for (int j = 0; j < arraysecond.length; j++) {
                if (arrayfirst[i] == arraysecond[j]) {
                    found = true;
                }
            }
            if (!found) {
                arrayResult[index++] = arrayfirst[i];
            }
        }
        for (int i = 0; i < arraysecond.length; i++) {
            boolean  found = false;
            for (int j = 0; j < arrayfirst.length; j++) {
                if (arraysecond[i] == arrayfirst[j]) {
                    found = true;
                }
            }
            if (!found) {
                arrayResult[index++] = arraysecond[i];
            }
        }
        return Arrays.copyOf(arrayResult, index);
    }

    public int[] reverseArray(int[] arrayfirst) {
        int[] reversed = new int[arrayfirst.length];
        for (int i = 0; i < arrayfirst.length; i++) {
            reversed[i] = arrayfirst[arrayfirst.length - i - 1];
        }return reversed;
    }

    public int[] randomArray (int min, int max, int length ) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int)(Math.random() * (max - min + 1) + min);
        }
        return array;
    }

    public boolean arrayChar (char[] first, char[] second) {
        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                return true;
            }
        }
        return false;
    }
}
