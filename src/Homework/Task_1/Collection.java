package Homework.Task_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Collection {
    public static void main(String[] args) {

        List <Integer> myCollection = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {

            myCollection.add(sc.nextInt());
        }
        myCollection.add(2, 1);
        myCollection.add(5, -4);
        myCollection.add(8, -3);
        System.out.println(myCollection);
        for (int i = 0; i < 10; i++) {
            if (myCollection.get(i) < 20){
                myCollection.remove(i);
            }
        }
        System.out.println(myCollection);
        }
    }
