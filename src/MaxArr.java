public class MaxArr {
    public static void main(String[] args) {
        int[] arr = {4, 67, 33, 55, 891, 3, 2};

        int maxArr = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (maxArr < arr[i]){
                maxArr = arr[i];
            }
        }
        System.out.println(maxArr);
    }


}
