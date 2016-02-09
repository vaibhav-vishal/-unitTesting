package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.samples.CurrencyConverter;

public class FirstTestCase {

	@Before
	public void setUp() throws Exception {
		System.out.println("******Before called******");
	}

	@After
	public void tearDown() throws Exception {
	System.out.println("*****After called*****");}
	

	@Test
	public void test1() {
	System.out.println("test1");
	//	fail("Not yet implemented 1");
	CurrencyConverter conv = new CurrencyConverter();
	double actual =conv.dollerToRupees(10.0);
	assertEquals(678.0, actual , 0);
	}
	@Test
	public void test2() {
		System.out.println("test2");
		fail("Not yet implemented 2");
	}

}
