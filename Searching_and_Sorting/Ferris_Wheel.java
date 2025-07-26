package Searching_and_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ferris_Wheel {
    public static void main(String[] args) throws IOException{
          
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] w = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            w[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(w);
        int lo = 0, hi = n - 1;
        int rides = 0;

        while (lo <= hi) {
            if (w[lo] + w[hi] <= x) {
                lo++;
                hi--;
            } else {
                hi--;
            }
            rides++;
        }

        System.out.println(rides);
    }
}
