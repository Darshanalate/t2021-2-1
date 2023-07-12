import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("input:"); 
    int a=in.nextInt();
    int x=1;
    if(a%2==0){
      a=a-1;
    }
    while(a--!=0)
    {
     System.out.print(x+" ");
     x=x+2;
   } 
}}
