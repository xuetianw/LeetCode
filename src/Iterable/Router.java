package Iterable;

// Below is the program to convert an Iterable
// into a Collection using iterable.forEach

import java.io.*;
import java.util.*;

// Program to convert an Iterable
// into a Collection

import java.io.*;
import java.util.*;
import java.util.stream.*;

class GFG {
    // function to convert Iterable into Collection
    public static Collection<Integer>
    getCollectionFromIteralbe(Iterable<Integer> itr) {
        // Create an empty Collection to hold the result
        Collection<Integer> cltn = new ArrayList<Integer>();

        // Iterate through the iterable to
        // add each element into the collection
        for (Integer t : itr)
            cltn.add(t);

        // Return the converted collection
        return cltn;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Iterable<Integer> i = list;
        System.out.println("Iterable List : " + i);

        Collection<Integer> cn = getCollectionFromIteralbe(i);
        System.out.println("Collection List : " + cn);
    }
}
