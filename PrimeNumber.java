import java.util.*;
class PrimeNumber{
public static void main(String[ ] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n<=1)
{
System.out.println("It is not a prime number");
return;
}
int limit=1;
while(limit*limit<=n){
limit ++;
}
limit--;
for(int i=2; i<=limit;i++){
if(n%i==0){
System.out.println("It is not prime number");
return;
}
System.out.println("It is a prime number");
}}}