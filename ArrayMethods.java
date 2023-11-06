public class ArrayMethods {

    public int min(int[] arr) {
        int currMin = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < currMin) {
                currMin = arr[i];
            }
        }
        return currMin;
    }
}