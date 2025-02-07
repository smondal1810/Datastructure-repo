package For_practic_array_string;

import java.util.Scanner;

class Index{
    public static void toFindLastIndex(int arr[],int x){
        int lastindex = -1;
        for(int i = 0;i< arr.length;i++){
            if(arr[i] == x){
                lastindex = i;

            }
        }
        System.out.println( "the last index is: "+lastindex);
    }
}

public class LastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x :");
        int x = sc.nextInt();
        System.out.println("enter the length of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array :");
        for (int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Index.toFindLastIndex(arr,x);
    }

}
