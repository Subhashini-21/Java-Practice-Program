public class wordcount {
    public static void main(String[] args) {
        String s= "the world is a ending";
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' ')
                count++;
        }
        System.out.println(count+1);
    }
    
}
