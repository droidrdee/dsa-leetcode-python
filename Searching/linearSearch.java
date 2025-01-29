package Searching;

public class linearSearch {
    public static void main(String[] args){
        int[] arr = {1,5,5,6,3,55,63,62,33,85,58,47,74};
        int target = 33;

        int position = LS(arr, target);
        System.out.println("Position : "+ position);

    }
    static int LS(int[] arr, int target){

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
