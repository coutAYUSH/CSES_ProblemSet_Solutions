package Searching_and_Sorting;

import java.util.*;
import java.io.*;

public class Distinct_Numbers{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
       
        Set<Integer> set = new HashSet<>();
        
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int val = Integer.parseInt(st.nextToken());
            set.add(val);
        }
        
        System.out.println(set.size());

    }
}