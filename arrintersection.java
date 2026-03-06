public class arrintersection {
    public static void main(String[] args) {
        int [] a={1,2,3,5,7};
        int[] b={ 1,3,7,6,9};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j])
                    System.out.print(a[i]+" ");
            }
        }
    }
    
}
