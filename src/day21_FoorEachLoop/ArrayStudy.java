package day21_FoorEachLoop;

import java.util.Arrays;

public class ArrayStudy {
    public static void main(String[] args) {
        int[ ] arr = {0,1,3,0,3,4,0,5,6,0,7};
        int result[]= new int[arr.length];
        System.out.println(Arrays.toString(result));
        int begin = 0;
        int end= arr.length-1;
        for(int num:arr){
            if(num==0){
                result[end]+=0;
                --end;
            }else{
                result[begin]= num;
                 ++begin;
            }

        }
        System.out.println(Arrays.toString(result));
    }
}
