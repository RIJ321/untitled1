package com.company;

import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");

        ArrayList<String> people = new ArrayList<>(5);

        people.add(sc.next());
        people.add(sc.next());
        people.add(sc.next());
        people.add(sc.next());
        people.add(sc.next());

        Collections.sort(people);
        printPeople(people);

        ArrayList<String> people2 = new ArrayList<>(5);
        people2.add(sc.next());
        people2.add(sc.next());
        people2.add(sc.next());
        people2.add(sc.next());
        people2.add(sc.next());

        Collections.sort(people2);
        Collections.reverse(people2);
        printPeople(people2);

        ArrayList<String> people3 = new ArrayList<>();
        int nam = 0;
        while (people3.size()<9){
            people3.add(people.get(nam));
            people3.add(people2.get(nam));
            nam++;
        }

        Collections.sort(people3, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        printPeople(people3);
    }

    public static void printPeople(ArrayList<?> people) {
        System.out.println("------------------------");
        Iterator<String> iterator = (Iterator<String>) people.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}
