import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BiggestNumber {

    public static void main(String args[]){
        int arr[] ={3,30,34,5,9};
        int length=arr.length;
        int arr2[] ={3,30,34,5,9};
        int result[]=new int[length];
        for(int a=0;a<length;a++){
            int temp=0;
            int index=-1;
            for(int b=0;b<length;b++){
               index=indexOfFirst(temp,arr2[b],b, index);
                temp=first(temp,arr[b]);
            }
            result[a]=temp;
            arr[index]=0;
            arr2[index]=0;
        }
        String s="";
        for (int i:result){
            s=s+Integer.toString(i);
        }
        System.out.println(s);
    }

    private static int indexOfFirst(int i, int j, int b, int index2) {
        String s1=Integer.toString(i)+Integer.toString(j);
        String s2=Integer.toString(j)+Integer.toString(i);
        int i1=Integer.parseInt(s1);
        int i2=Integer.parseInt(s2);
        if (i1<i2){
            return b;
        }else {
            return index2;
        }
    }

    private static int first(int i, int j) {
        String s1=Integer.toString(i);
        String s2=Integer.toString(j);
        if (Integer.parseInt(s1+s2)<Integer.parseInt(s2+s1)){
            return j;
        }else {
            return i;
        }
    }

}
