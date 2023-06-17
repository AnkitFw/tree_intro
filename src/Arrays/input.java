package Arrays;
import java.util.Scanner;
class Method{
  public  static int occur(int arr[],int a){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                count++;
            }
        }
        return count;
    }
}
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("enter " +x + " elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Select no: ");
        int a = sc.nextInt();
        Method method = new Method();
        System.out.println("no of x: "  +  method.occur(arr,a));

    }
}
