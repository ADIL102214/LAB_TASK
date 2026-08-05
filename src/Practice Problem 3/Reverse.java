public class Reverse {
    public static void main(String[] args){
        int[] arr = {100 , 80, 60, 40, 20};
        for(int i = 0, j = arr.length-1; i<= arr.length/2; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}