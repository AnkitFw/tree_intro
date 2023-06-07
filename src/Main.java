// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
class Input{
    static void print_array(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
   public static int occure(int arr[],int x ){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;

            }
        }
        return count;
    }
}
public class Main {
    public static void main(String[] args) {
      /*  int a[] []= {{1,2,4},{8,5,8},{3,7,8,9,0}};
        for(int m[]:a){
            for(int h :m){
                System.out.print(h+" ");
            }
            System.out.println();*/
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: " );
        int x = sc.nextInt();
        int p[] = new int[x];
        System.out.println("Enter " +x+ " elements" );
        for(int i=0;i<p.length;i++){
            p[i] = sc.nextInt();
        }
        for(int i=0;i<x;i++) {
            System.out.println(p[i]);*/
       Input input = new Input();

       int arr[] = {1,3,5,7,9,0,2,2,2,3,4,5,6,1,3,5,6,6,4};

        System.out.println("printing Ist array");
       input.print_array(arr);
     int  arr_2[] = arr;
        System.out.println("printing copied array");
        input.print_array(arr_2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the value to count ");
        int x = sc.nextInt();
        System.out.println("count is:"+ input.occure(arr,x) );

    }
        }





