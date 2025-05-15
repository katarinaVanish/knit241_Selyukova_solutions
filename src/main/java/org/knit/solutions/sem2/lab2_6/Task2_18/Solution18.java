package org.knit.solutions.sem2.lab2_6.Task2_18;

public class Solution18 {
    /**
     * Дублирует каждый ноль в массиве, сдвигая элементы вправо.
     * Элементы, выходящие за границы массива, отбрасываются.
     *
     * @param arr Входной массив (изменяется на месте)
     */
    public void duplicateZeros(int[] arr){
        int n = arr.length;
        int possibleDups = 0;

        for (int i = 0; i < n - possibleDups; i++){
            if (arr[i] == 0){
                if (i == n - possibleDups - 1){
                    arr[n - 1] = 0;
                    n -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        int last = n - possibleDups - 1;

        for (int i = last; i >= 0; i--){
            if (arr[i] == 0){
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}
