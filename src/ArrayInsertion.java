import java.util.Arrays;

public class ArrayInsertion {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Вставляем элемент в конец массива
        int elementToEnd = 6;
        int[] newArrayToEnd = insertElementToEnd(array, elementToEnd);
        System.out.println("After: " + Arrays.toString(newArrayToEnd));

        // Вставляем элемент по индексу
        int elementToIndex = 7;
        int index = 2;
        int[] newArrayToIndex = insertElementAtIndex(array, elementToIndex, index);
        System.out.println("After: " + Arrays.toString(newArrayToIndex));
    }

    public static int[] insertElementToEnd(int[] array, int element) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static int[] insertElementAtIndex(int[] array, int element, int index) {


        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = element;
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }
        return newArray;
    }
}


