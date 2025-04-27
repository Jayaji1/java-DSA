package Sorting;

public class InsetionSort {
    public static void main(String[] args) {
        int a[]={56,2,45,89,10};
        for(int i=1;i<a.length;i++){
            int temp,j;
            temp=a[i];
            j=i;
            while(j>0 && a[j-1]>temp) {
                a[j] = a[j - 1];
                j = j - 1;
            }
                a[j]=temp;
            }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        }
    }

