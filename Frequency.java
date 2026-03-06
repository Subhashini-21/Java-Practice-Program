class Frequency  {
    public static void main(String[] args) {
        String r="Ahi1 2346& 7hg";
        int v=0,c=0,n=0,s=0;
        r=r.toLowerCase();
        for(int i=0;i<=r.length()-1;i++){
            char ch=r.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o'||ch=='u')
                    v++;
                else
                    c++;
        }
        else if(ch>='0' && ch<='9')
            n++;
        else if (ch!=' ')
            s++;
    }
    System.out.println(("vowels:"+v+" ,consonant:"+c+", digits:"+n+", special:"+s));

    }
    
}
