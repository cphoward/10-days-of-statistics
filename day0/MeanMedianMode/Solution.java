package day0.MeanMedianMode;

import java.util.*;

public class Solution {

    public static float median(ArrayList<Integer> al) {
        int n = al.size();
        if (n % 2 == 1) {
            return al.get(n/2);
        } else {
            int left = n/2-1;
            int right = n/2;
            return (((float)al.get(left))+al.get(right))/2.0f;
        }
    }

    public static int mode(ArrayList<Integer> al) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int mode = Integer.MIN_VALUE;
        boolean mode_set = false;
        for (Integer elm : al) {
            if (hm.containsKey(elm)) {
                hm.put(elm, hm.get(elm) + 1);
                if (hm.get(mode) < hm.get(elm)) {
                    mode = elm;
                }
            } else {
                hm.put(elm, 1);
                if (! mode_set) {
                    mode = elm;
                    mode_set = true;
                }
            } // end if
        }
        if (mode_set) {
            return mode;
        } else {
            return Integer.MIN_VALUE;
        } // end if
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(sc.hasNext()) {
            al.add(sc.nextInt());
        }
        long sum = 0;
        for (int elm : al) {
            sum += elm;
        }
        System.out.printf("%.1f\n", ((double) sum)/N);
        Collections.sort(al);
        System.out.printf("%.1f\n", median(al));
        // al.forEach(num -> System.out.printf("%d ", num));
        // System.out.println();
        System.out.println(mode(al));
        sc.close();
    }
}
