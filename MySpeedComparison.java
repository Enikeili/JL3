package com.enikeili.lab3;

import java.util.ArrayList;
import java.util.LinkedList;
/**
 * A class for comparing the speed of methods add, get, remove of ArrayList and LinkedList
 * @author enikeili
 */
public class MySpeedComparison
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		int numbers[]= {1000, 50000}; //array for number elements of list
		MeasuringTimeForActionOfListMethods m = new MeasuringTimeForActionOfListMethods(); 
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println("Time for "+Integer.toString(numbers[i])+" elements (ms):");
			System.out.println("\t   Add\tGet\tRemove");
			System.out.println("ArrayList  "+Long.toString(m.timeForAdd(arraylist, numbers[i]))+"\t"+Long.toString(m.timeForGet(arraylist, numbers[i]))+"\t"+Long.toString(m.timeForRemove(arraylist, numbers[i])));
			System.out.println("LinkedList "+Long.toString(m.timeForAdd(linkedlist, numbers[i]))+"\t"+Long.toString(m.timeForGet(linkedlist, numbers[i]))+"\t"+Long.toString(m.timeForRemove(linkedlist, numbers[i]))+"\n");
		}

	}

}
