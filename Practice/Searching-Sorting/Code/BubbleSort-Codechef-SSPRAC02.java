/*
https://www.codechef.com/UAPRAC/problems/SSPRAC02/

Write a program that sorts a list of numbers in ascending order using bubble sort

Input format
Line 1: Integer N, the number of elements in the list
Line 2: N space separated distinct integers, denoting the elements of the list

Output format
Print the list after each iteration of bubble sort
Your algorithm must stop after the array is sorted

Test data
1 ≤ N ≤ 1000
The numbers in the list range from 10-5 to 105

Sample Input
5
4 1 5 3 2

Sample Output
1 4 3 2 5
1 3 2 4 5
1 2 3 4 5

Explanation
In each iteration, the ith maximum bubbles to its correct position
The algorithm stops when the array is sorted
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class BubbleSortCodeChef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        bubbleSort(arr);
    }


    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            boolean isSwapped = false;
            for(int j=0; j<n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped)
                break;
            Arrays.stream(arr).forEach(x -> sb.append(x).append(' '));
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
