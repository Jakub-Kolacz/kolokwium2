package com.company.zadanie2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class PositiveSet {
    public Set<Integer> basicSet;

    public PositiveSet() {
        basicSet = fillSet();
    }

    public int generateRandomPositiveNumber(){
        Random random = new Random();
        return random.nextInt(100 );
    }

    public Set<Integer> fillSet(){
        Set<Integer> numbers = new HashSet<>(generateRandomPositiveNumber());
        for (int i = 0; i < numbers.size(); i++) {
            numbers.add(generateRandomPositiveNumber());
        }
        return numbers;
    }

    public Set<Integer> sum(Set<Integer> set){
        Set<Integer> sum = new HashSet<>();

        Object[] setA = this.basicSet.toArray();
        Object[] setB = set.toArray();

        Arrays.stream(setA).map(element -> sum.add((Integer) element));
        Arrays.stream(setB).map(element -> sum.add((Integer) element));

        return sum;
    }

    public Set<Integer> difference(Set<Integer> set){
        Set<Integer> difference = new HashSet<>();
        basicSet.stream().map(difference::add);
        set.stream().map(difference::add);
        return difference;
    }
}
