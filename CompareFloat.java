import java.util.*;
class CompareFloat{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers with decimal values:");
double a=sc.nextDouble();
double b=sc.nextDouble();
int aa=(int)(a*1000);
int bb=(int)(b*1000);
if(aa==bb){
System.out.println("The numbers are equal upto 3 decimal.");
}
else{
System.out.println("The number are not equal upto 3 decimal.");
}}}