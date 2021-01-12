public class MyMain {




    // Shuffles an
    public static int[] perfectShuffle(int[] arr) {
        int[] cards = new int[arr.length];
        for (int i = 0; i < arr.length / 2; i++) {
            cards[i * 2] = arr[i];
            cards[(i * 2) + 1] = arr[(arr.length / 2) + i];
        }
        return cards;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) {
        int temp = 0;
        int random = 0; 
        for (int i = 0; i < arr.length; i++) {
            random = (int) (Math.random() * arr.length);  
            temp = arr[i];
            arr[i] = arr[random];
            arr[random] = temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
