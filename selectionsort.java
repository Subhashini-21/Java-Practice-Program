package Sorting;

public class selectionsort {
    public static void main(String[] args) {
      int a[]={1,2,7,3,5,4};
        int n=a.length;
        int temp=0;
        int minIndex=-1;
        for(int i=0;i<n-1;i++){
             minIndex=i;
            for(int j=i;j<n;j++){            
                 if(a[minIndex]>a[j]){
                    minIndex=j;
                 }
                    temp=a[minIndex];
                    a[minIndex]=a[j];
                    a[j]=temp;     
            }     }
       for(int i=1;i<n;i++){
                System.out.print(a[i]+" ");
        }
       
    }
    }
