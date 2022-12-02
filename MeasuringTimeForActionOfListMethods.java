package com.enikeili.lab3;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
/**
 * A class for measuring the time for the action of methods add, get, remove of List
 * @author enikeili
 */
public class MeasuringTimeForActionOfListMethods
{
	/**
	 * Measures the time for add elements of list, returns time(ms)
	 * @param list implementation of the list interface
	 * @param number_of_elements number of added elements
	 * @return the time for adding (ms)
	 */
	public long timeForAdd(List<Integer> list, int number_of_elements)
	{
		Instant start=Instant.now();
		for(int i=0; i<number_of_elements; i++)
		{
			list.add(i);
		}
		Instant finish=Instant.now();
		long time=Duration.between(start, finish).toMillis();
		return time;
	}
	/**
	 * Measures the time for get elements of list, returns time(ms)
	 * @param list implementation of the list interface
	 * @param number_of_elements number of received elements
	 * @return the time for getting (ms)
	 */
	public long timeForGet(List<Integer> list, int number_of_elements) throws IndexOutOfBoundsException
	{
		Instant start=Instant.now();
		if(number_of_elements > list.size()) throw new IndexOutOfBoundsException("Число выбирающихся по индексу элементов больше размера списка!");
		for(int i=0; i<number_of_elements; i++)
		{
			list.get(i);
		}
		Instant finish=Instant.now();
		long time=Duration.between(start, finish).toMillis();
		return time;
	}
	/**
	 * Measures the time for remove elements of list, returns time(ms)
	 * @param list implementation of the list interface
	 * @param number_of_elements number of removed elements
	 * @return the time for removing (ms)
	 */
	public long timeForRemove(List<Integer> list, int number_of_elements) throws IndexOutOfBoundsException
	{
		Instant start=Instant.now();
		if(number_of_elements > list.size()) throw new IndexOutOfBoundsException("Число удаляемых по индексу элементов больше размера списка!");
		for(int i=number_of_elements-1; i>=0; i--)
		{
			list.remove(i);
		}
		Instant finish=Instant.now();
		long time=Duration.between(start, finish).toMillis();
		return time;
	}

}
