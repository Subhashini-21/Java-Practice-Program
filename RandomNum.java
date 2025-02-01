import java.util.*;
class RandomNum{
public static void main(String[] args){
Random rnd=new Random();
int a=rnd.nextInt(100);
int b=rnd.nextInt(100);
int sum=a+b;
System.out.println("Randomly choosen number are : "+a+" and "+b);
System.out.println("The sum is: "+sum);
}}