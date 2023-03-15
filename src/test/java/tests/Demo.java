package tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo {
	
	
	@Test(dataProvider="supplier")
	public void sampleTest(String a, String b) {
		
		System.out.println(a+" - "+b);
	}
	
	@DataProvider(name="supplier")
	public Object[][] dataSupplier() {
		//2 Dimensional
		Object[][] data = {
				{"Caleb", "Mortensen"},
				{"Joe", "Blow"},
				{"John", "Doe"}};
		
		return data;
	}
			
	/*-----*/
	@Test(dataProvider="supplier1")
	public void sampleTest1(String a) {
		
		System.out.println(a);
	}
	
	
	@DataProvider(name="supplier1")
	public Object[] dataSupplier1() {
		//Single Dimensional
		Object[] data = {"Caleb", "Mortensen", "John", "Smith", "David", "Goliath"};
				
		return data;
	}
	
	/*-----*/
	@Test(dataProvider="supplier2")
	public void sampleTest2(Object a) {
		
		System.out.println(a);
	}
	
	
	@DataProvider(name="supplier2")
	public Iterator<Object> dataSupplier2() {
		//List Iterator
		List<Object> list = new ArrayList<>();
		list.add("Caleb");
		list.add(9);
		list.add(true);
				
		return list.iterator();
	}
	
	
	/*-----*/
	@Test(dataProvider="supplier3")
	public void sampleTest3(Object a) {
		
		System.out.println(a);
	}
	
	
	@DataProvider(name="supplier3")
	public Iterator<Object> dataSupplier3() {
		//HashSet - random order passed
		
		Set<Object> set = new HashSet<Object>();
		set.add("Caleb");
		set.add("Mortensen");
		set.add("Chicken");
		set.add("Sandwich");
		
		return set.iterator();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
