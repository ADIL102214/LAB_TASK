public class Max {
    public static void main(String[] args){
        int[] arr = {100, 120, 80, 60 , 40};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        System.out.println("Greatest : " + max);
    }
}