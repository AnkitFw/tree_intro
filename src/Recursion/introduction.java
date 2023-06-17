package Recursion;
import java.util.Scanner;
class Help{


   public static void print(int x){          // 1,2,3,.......,x-1,x
    if(x==1){
        System.out.println(x);     // Base case
    return;
}
    print(x-1); //    1,2,3,........,x-1   // assumption
    System.out.println(x);
}}
public class introduction {
    public static void print(int x){          // 1,2,3,.......,x-1,x
        if(x==1){
            System.out.print(x+" ");     // Base case
            return;
        }
        print(x-1); //    1,2,3,........,x-1   // assumption
        System.out.print(x+" ");}
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int x = sc.nextInt();
        Help help = new Help();
        print(x);
    }
}