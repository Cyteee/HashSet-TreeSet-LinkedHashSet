package application;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<String> set = new TreeSet<>();

        set.add("Monitor");
        set.add("Iphone");
        set.add("Desktop");

        System.out.println(set.contains("Iphone"));

        for (String p : set){
            System.out.println(p);
        }

        sc.close();
    }
}