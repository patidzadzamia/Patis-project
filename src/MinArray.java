public class MinArray {
    public static void main(String[] args) {
       int[] arr = {30,44,21,7,54,98};

       int minArr = arr[0];

       for(int i = 0; i < arr.length; i++){
           if (minArr > arr[i]){
               minArr = arr[i];
           }
       }
        System.out.println(minArr);
    }
}