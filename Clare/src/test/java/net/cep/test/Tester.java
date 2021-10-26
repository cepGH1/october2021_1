package net.cep.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import net.cep.main.simpleThing;

public class Tester {

	@Test
	public void test1() {
		System.out.println("here is a test");
		simpleThing fred = new simpleThing();
		
		assertTrue("not creted", fred instanceof simpleThing);
	}
	
	@Test
	public void test2() {
		System.out.println("here is  test 2");
		simpleThing fred = new simpleThing();
		assertEquals(fred.doSomethingElse(3,1), 4);
	}
	
	@Test
	public void test3() {
		System.out.println("test 3");
		simpleThing fred = new simpleThing();
		assertTrue("doSomething is undone", fred.doSomething());
	}
}
