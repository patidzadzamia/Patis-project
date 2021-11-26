import java.util.Arrays;

public class GetSecondMax {
    public static void main(String[] args) {
        int[] arr = {4, 781, 8, 99, 103};

//        Arrays.sort(arr);
//        System.out.println(arr[arr.length -3]);

        int max = arr[0];
        int iMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                iMax = i;
            }
        }
        arr[iMax] = Integer.MIN_VALUE; // override the max with min
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println("Pati");

    }
}
