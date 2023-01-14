/*
In this section we will see how to find maximum of given array element :
_________________________________________________________________________
Question : Calculate the maximum value out of all the element in given array.
__________________________________________________________________________________
 */
import java.util.Scanner;
public class MaximumValueOfArray {
    static int maximum(int arr[]){
        int ans =0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY :");
        int a = sc.nextInt();
        System.out.println("ENTER THE ELEMENT OF ARRAY :");
        int arr[] = new  int[a];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("NOW PRINTING THE MAXIMUM VALUE OF GIVEN ARRAY ELEMENT : ");
        System.out.println(maximum(arr));
    }
}
