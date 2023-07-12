import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println(" Enter input:"); 
    int a=in.nextInt();
    int x=1;
    while(a--!=0)
    {
     System.out.print(x+" ");
     x=x+2;
    }
}}
