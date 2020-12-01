package com.jetbrains;

import java.util.Arrays;

public class Printer {

    public static void main(String[] args) {
        int[] test = new int[]{1,2,4,1,2,4,7,8,3,1};

        System.out.println(Arrays.toString(AfternoonExercises.swap(test, 0,2)));
        System.out.println(AfternoonExercises.sumOfNNumbers(test, "odd"));
        System.out.println(Arrays.toString(AfternoonExercises.fibonacci(20)));
        AfternoonExercises.daysOfWeek(1);

    }
}
