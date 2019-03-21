package com.offer;

public class Offer_13 {
    public void reOrderArray(int [] array) {
        for (int i=0; i < array.length; ++i) {
            if (array[i] % 2 == 1) {
                for (int j = i -1; j >= 0; --j) {
                    if (array[j] % 2 == 0) {
                        int num = array[j+1];
                        array[j+1] = array[j];
                        array[j] = num;
                    } else {
                        break;
                    }
                }

            }

        }

    }

    public static void main(String[] args) {

    }
}
