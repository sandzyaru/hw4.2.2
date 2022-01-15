package com.company;

import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namesA = new ArrayList<>();
        namesA.add(scanner.next());
        namesA.add(scanner.next());
        namesA.add(scanner.next());
        namesA.add(scanner.next());
        namesA.add(scanner.next());
        for (int i = 0; i < namesA.size(); i++) {
            System.out.println("List A: " + namesA.get(i));
        }
        ArrayList<String> namesB = new ArrayList<>();
        namesB.add(scanner.next());
        namesB.add(scanner.next());
        namesB.add(scanner.next());
        namesB.add(scanner.next());
        namesB.add(scanner.next());
        for (int i = 0; i < namesB.size(); i++) {
            System.out.println("List B: " + namesB.get(i));
        }
        ArrayList<String> namesC = new ArrayList<>();
        Collections.reverse(namesB);
        Iterator<String> iterA = namesA.iterator();
        Iterator<String> iterB = namesB.iterator();
        for (int i = 0; i < namesA.size(); i++) {

            namesC.add(iterA.next());
            namesC.add(iterB.next());
        }
        System.out.println(namesC);
        Collections.sort(namesC , new LengthFirstComparator());
        System.out.println("Сортировка: "+namesC);



    }

}
