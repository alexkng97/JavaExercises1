package com.jetbrains;

public class AfternoonExercises {

    public static int[] swap(int[] array, int first, int second){
        int hold = array[first];
        array[first] = array[second];
        array[second] = hold;
        return array;
    }

    public static int sumOfNNumbers(int[] array, String evenOrOdd ){
        int sum = 0;
        for(int i : array){
            if(evenOrOdd.equals("even")){
                if(i %2 ==0){
                    sum += i;
                }
            }else if(evenOrOdd.equals("odd")){
                if(i % 2 != 0){
                    sum += i;
                }
            }else{
                sum +=i;
            }
        }
        return sum;
    }

    public static int[] fibonacci(int size){
        int[] results = new int[size];
        results[0] = 0;
        results[1] = 1;

        for(int i = 2; i < size ;i++){
            int sum = results[i-2] + results[i-1];
            results[i] = sum;
        }

        return results;
    }

    public static void daysOfWeek(int num){
        switch(num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter number from 1-7!");
        }

    }
}
