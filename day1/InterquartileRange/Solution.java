package day1.InterquartileRange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Pair {
  public Integer first;
  public Integer second;
  public Pair(Integer f, Integer s) {
    first = f;
    second = s;
  }
  public String toString() {
    return first + " " + second;
  }
}

public class Solution {
  public static void main(final String[] args) {
    // Pair<Integer, Integer> p = new Pair<Integer, Integer>(1,2);
    final Scanner scan = new Scanner(System.in);
    final ArrayList<Pair> al = new ArrayList<>(50);
    final Integer n = scan.nextInt();
    final Integer[] firsts = new Integer[50];
    final Integer[] seconds = new Integer[50];
    for (Integer i = 0; i < n; i++) {
      firsts[i] = scan.nextInt();
    }
    for (Integer i = 0; i < n; i++) {
      seconds[i] = scan.nextInt();
    }
    for (Integer i = 0; i < n; i++) {
      al.add(new Pair(firsts[i], seconds[i]));
    }
    Collections.sort(al, (o1, o2) -> (o1.first.compareTo(o2.first)));
    for (Pair p : al) {
      System.out.println(p);
    }
    scan.close();
  }
}