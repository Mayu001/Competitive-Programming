/*
https://www.codechef.com/UAPRAC/problems/PSORT3/

You are given two arrays A and B of size N. We define a pair as (Ai, Bi) where 0≤i≤N−1.
The task is to sort these pairs in decreasing order of the second elements of the pairs i.e Bi. If both the second elements are equal sort according to increasing order of the first elements of the pairs.
Output the sorted pairs in a single line with a space separating the pairs. Each pair is printed with first element followed by a space and second element. See Explanation Section for better understanding.

Input:
First line will contain a single integer N.
Second line contains N space separated integers A0, A1, ... AN−1 denoting the elements of array A.
Third line contains N space separated integers B0, B1, ... BN−1 denoting the elements of array B.

Output:
Output in a single line 2∗N space separated integers. Output the pairs in sorted order, where the first element of a pair is from Aj and second element is from Bj with a space in between.

Constraints
1≤N≤105
1≤Ai,Bi≤1018

Subtasks
30 points : 1≤N≤1000
70 points : Original constraints

Sample Input:
3
2 2 3
6 3 3

Sample Output:
2 6 2 3 3 3

EXPLANATION:
The pairs are:

(2,6)
(2,3)
(3,3)
We are required to sort these pairs in decreasing order of second elements and then increasing order of first elements. Therefore, pairs sorted:

(2,6)
(2,3)
(3,3)
You can clearly see that the second elements are in decreasing order from top to bottom and when second elements of two pairs are equal they are sorted in increasing order of first elements from top to bottom. We print the pairs as follows:

2 6 2 3 3 3
The first two elements correspond to pair 1 in sorted list. The next two elements correspond to pair 2 in sorted list. The last two elements correspond to pair 3 from sorted list.

 */
import java.io.*;
import java.util.Arrays;

class Pair {
    long x,y;
    Pair(long x, long y) {
        this.x = x;
        this.y = y;
    }
}
class PairSort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr1 = Arrays.stream(br.readLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
        long[] arr2 = Arrays.stream(br.readLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
        pairSort(n, arr1, arr2);
    }

    private static void pairSort(int n, long[] arr1, long[] arr2) {

        Pair[] pair_arr = new Pair[n];
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++)
            pair_arr[i] = new Pair(arr1[i], arr2[i]);
        Arrays.sort(pair_arr, (e1,e2) -> e1.y == e2.y ? Long.compare(e1.x, e1.x) : Long.compare(e2.y,e1.y));
        for(int i=0; i<n; i++)
            sb.append(pair_arr[i].x).append(' ').append(pair_arr[i].y).append(' ');
        writer.println(sb);
        writer.close();
    }

}
