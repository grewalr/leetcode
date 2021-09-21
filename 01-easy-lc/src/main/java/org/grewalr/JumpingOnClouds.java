package org.grewalr;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class JumpingOnClouds {

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int i = 0;
        int numJumps = 0;

        while (i < c.size()) {
            if ((i+2) < c.size() && c.get(i + 2) == 0) {
                numJumps++;
                i+=2;
            } else if ((i+1) < c.size() && c.get(i + 1) == 0) {
                numJumps++;
                i++;
            } else {
                i++;
            }
        }

        return numJumps;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> array = new ArrayList<>();
        array.add(0);
        array.add(1);
        array.add(0);
        array.add(0);
        array.add(0);
        array.add(1);
        array.add(0);

        List<Integer> array2 = new ArrayList<>();
        array2.add(0);
        array2.add(0);
        array2.add(1);
        array2.add(0);
        array2.add(0);
        array2.add(1);
        array2.add(0);

        int result = JumpingOnClouds.jumpingOnClouds(array);
        System.out.println(result);

        int result2 = JumpingOnClouds.jumpingOnClouds(array2);
        System.out.println(result2);

    }
}

