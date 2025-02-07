package String;

import java.util.Scanner;

public class TwoDeArray {
    static void MultiWrong(int[][] arr_1,int r1,int c1,int[][] arr_2,int r2,int c2 ){
        if(c1 != r2){
            System.out.println("wrong input");
            return;
        }


    }
    static void Multiply(int[][] arr_1,int r1,int c1,int[][] arr_2,int r2,int c2){
        MultiWrong( arr_1, r1, c1, arr_2,r2, c2);
        int[][] multi = new int[r1][c2];
        for(int i =0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    multi[i][j] = (arr_1[i][k]*arr_2[i][k]);
                }
            }
        }

        System.out.println(multi);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row of 1st array :");
        int r1 = sc.nextInt();
        System.out.println("enter the number of column of 1st array :");
        int c1 = sc.nextInt();
        int[][] arr_1 = new int[r1][c1];
        System.out.print("enter the elements of 1st array :");
        for(int i =0;i<r1;i++){
            for(int j =0;j<c1;j++){
                arr_1[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("enter the number of row of 2nd array :");
        int r2 = sc.nextInt();
        System.out.println("enter the number of column of 2nd array :");
        int c2 = sc.nextInt();
        int[][] arr_2 = new int[r2][c2];
        System.out.print("enter the elements of 2nd array :");
        for(int i =0;i<r2;i++){
            for(int j =0;j<c2;j++){
                arr_1[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        Multiply(arr_1,r1,c1,arr_2,r2,c2);



    }
}
