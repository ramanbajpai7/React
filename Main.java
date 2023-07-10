import java.util.*;
public class Main
{
    
    public static void mergesort(int arr[] , int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = (si+ei)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i= si;
        int j= mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++; k++;
            }
            else{
                temp[k]= arr[j];
                k++; j++;
            }
        }
        while(i<=mid){
            arr[k++]= temp[i++];
        }
        while(j<=ei){
            arr[k++] =temp[j++];
        }
        for(k=0, i=si; k<temp.length; k++,i++){
            arr[i] =temp[k];
        }
    }
        public static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        
    }
	public static void main(String[] args) {
		int arr[] = {1,6,8,3,5,8};
		mergesort(arr, 0, arr.length-1);
		printarray(arr);
	}
}
