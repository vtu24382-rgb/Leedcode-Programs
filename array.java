import java.util.Scanner;
import java.util.Arrays;

public class array {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the Index Number:");
        int pos=sc.nextInt();
        if (pos<n){
            System.out.println("Index position of array is "+pos+" value is "+arr[pos]);
        }else{
            System.out.println("The index position is invalid");
        }
        sc.close();
    }
}
