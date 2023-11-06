public class ArrayMethods {
    public void elementAdd(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += x;
        }
    }

    public int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
        }
        return min;
    }

    public int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }
        return max;
    }

    public int range(int[] arr) {
        int min = min(arr);
        int max = max(arr);
        return max - min;
    }

    public int uniqueSum(int[] arr) {
        int sum = arr[0];
        int lastElement = arr[0];

        for (int element : arr) {
            if (element == lastElement) {
                continue;
            }
            sum += element;
            lastElement = element;
        }

        return sum;
    }
}