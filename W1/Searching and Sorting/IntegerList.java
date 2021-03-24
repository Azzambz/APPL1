// ****************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create, fill,
// sort, and search in a list of integers.
//
// ****************************************************************

import java.util.Scanner;
public class IntegerList
{
    int[] list; //values in the list
    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }
    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
        list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
        System.out.println(i + ":\t" + list[i]);
    }
    //-------------------------------------------------------
    //return the index of the first occurrence of target in the list.
    //return -1 if target does not appear in the list
    //-------------------------------------------------------
    public int search(int target)
    {
        int location = -1;
        for (int i=0; i<list.length && location == -1; i++)
                if (list[i] == target)
                    location = i;
        return location;
    }
    //-------------------------------------------------------
    //sort the list into ascending order using the selection sort algorithm
    //-------------------------------------------------------
    public void selectionSort()
    {
        int minIndex;
        for (int i=0; i < list.length-1; i++)
        {
            //find smallest element in list starting at location i
            minIndex = i;
            for (int j = i+1; j < list.length; j++)
                if (list[j] < list[minIndex])
                    minIndex = j;
            //swap list[i] with smallest element
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
    }

    void replaceFirst(int oldVal, int newVal) {
        int i = search(oldVal);
        if(i != -1) {
            list[i] = newVal;
        }
    }

    void replaceAll(int oldVal, int newVal) {
        int i;
        do {
            i = search(oldVal);
            if(i != -1) {
                list[i] = newVal;
            }
        } while(i != -1);
    }

    void sortDecreasing() {
        int minIndex;
        for (int i=0; i < list.length-1; i++)
        {
            //find biggest element in list starting at location i
            minIndex = i;
            for (int j = i+1; j < list.length; j++)
                if (list[j] > list[minIndex])
                    minIndex = j;
            //swap list[i] with biggest element
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
    }

    int binarySearchD(int target) {  
        int location = -1;
        int mid = list.length/2;  
        int first = 0;
        int last = list.length - 1;
        while(first <= last) {  
            if( list[mid] < target ) {  
               first = mid + 1;     
            } else if(list[mid] == target) {  
               location = mid;
               return location;  
            } else {  
               last = mid - 1;  
            }  
            mid = (first + last)/2;  
        }  
        if( first > last ) {  
           return location;
        }  
        return location;
    }  
}