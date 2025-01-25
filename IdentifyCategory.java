import java.util.*;
class IdentifyCategory{
public static void main(String[ ] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int a= sc.nextInt();
if(a<=12)
System.out.print("Child");
else if(a>=9 && a<=19)
System.out.print("Teenager");
else if(a>=20 && a<=64)
System.out.print("Adult");
else
System.out.print("Senior");
}}