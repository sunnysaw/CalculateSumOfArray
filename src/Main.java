/*
In this section we will see a very easy code for adding given element of array :
___________________________________________________________________________________
Question : Calculate the sum of all the elements of array.
____________________________________________________________
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER THE LENGTH OF ARRAY : ");
        int a = sc.nextInt();
        System.out.println("ENTER THE ELEMENT OF ARRAY :");
        int arr [] = new int[a];
        for (int j = 0; j < arr.length; j++){
            arr[j] = sc.nextInt();
            ans += arr[j];
            }
        System.out.println("NOW PRINTING THE SUM OF ARRAY ELEMENTS : ");
        System.out.println(ans);
        }
    }
