public class longestword{
    public static void main(String[] args) {
        String s= " the words is longest";
        String[] w=s.split(" ");
        String l=w[0];
        for(int i=1;i<w.length;i++){
        if(w[i].length()>l.length())
            l=w[i];

    }
    System.out.println(l);
     
}
}