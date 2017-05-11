import java.util.Random;
import java.util.Scanner;

/**
 * Created by PARTHAS on 5/11/2017.
 */
public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(linearSearch(arr,key));
    }

    //Method for linear search
    public static int linearSearch(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }
}
