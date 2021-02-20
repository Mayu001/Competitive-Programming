/*
https://www.codechef.com/UAPRAC/problems/SSPRAC03

Write a program that sorts a list of numbers in ascending order using selection sort

Input format
Line 1: Integer N, the number of elements in the list
Line 2: N space separated distinct integers denoting the elements of the list

Output format
Print the list after each iteration of selection sort

Test data
1 ≤ N ≤ 1000
The numbers in the list range from 10-5 to 105

Sample Input
5
4 1 5 3 2

Sample Output

1 4 5 3 2
1 2 5 3 4
1 2 3 5 4
1 2 3 4 5

Explanation
In the ith iteration, selection sort "selects" the ith minimum and places it in its right position
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class SelectionSort_CodeChef_SSPRAC03
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        selectionSort(arr,n);
    }


    public static void selectionSort(int arr[], int n) {

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n-1; i++) {
            int min_idx = i;
            for(int j=i+1; j<n; j++)
                if(arr[j]<arr[min_idx])
                    min_idx = j;
            if(i != min_idx) {
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
            Arrays.stream(arr).forEach(x-> sb.append(x).append(' '));
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
