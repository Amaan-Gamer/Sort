public class Main {
    public static void main(String[] args) {
        int[] numbers = {29, 23, 73, 93, 100, 97, 60, 83, 2, 94};

        System.out.println("PRINT METHOD: ");
        print(numbers);

        System.out.println("\nSUM METHOD: ");
        System.out.println("Sum: " + sum(numbers));

        System.out.println("\nAVERAGE METHOD: ");
        System.out.println("Average: " + average(numbers));

        System.out.println("\nMAXIMUM METHOD: ");
        System.out.println("Max: " + max(numbers));

        System.out.println("\nMINIMUM METHOD: ");
        System.out.println("Min: " + min(numbers));

        System.out.println("\nSORT METHOD: ");
        int[] sortedArray = sort(numbers);
        print(sortedArray);
    }

    public static void print(int[] array) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    public static double average(int[] array) {
        return sum(array) / (double) array.length;
    }

    public static int max(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static int min(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int[] sort(int[] array) {
        int[] sortedArray = array.clone();
        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] > sortedArray[j]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }
}
