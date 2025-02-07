package String;

public class AccendingOrder {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 34;
        arr[2] = 43;
        arr[3] = 2;
        arr[4] =21;
        int temp=0;
        for(int i =0; i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;

                }
            }
        }
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(arr[arr.length-2]);

    }
}
