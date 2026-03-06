package Sorting;

public class bubblesort {
    public static void main(String[] args) {
        int a[]={1,2,7,3,5,4};
        int n=a.length;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                
                }
                
            }
        }
     
        for(int i=0;i<n;i++){
                System.out.print(i);
        }
    }
         

}
