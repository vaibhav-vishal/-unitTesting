package com.training.tests;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.samples.Student;
import com.training.samples.StudentList;

public class StudentTestCase {

	StudentList stud = null;
	StudentList list = null;

	@Before
	public void setUp() throws Exception {
		System.out.println("******Before called******");
		stud = new StudentList();
		list = new StudentList();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("*****After called*****");
	}

	@Test
	public void test1() {
		System.out.println("test1");
		Set<String> set = stud.getNames();
		int actual = set.size();
		assertEquals(2, actual);
	}

	@Test
	public void testSetAcceptDuplicate() {

		Student s1 = new Student(101, "Ramesh");
		Student s2 = new Student(101, "Ramesh");

		HashSet<Student> stud = new HashSet<Student>();

		stud.add(s1);
		stud.add(s2);

		list.setNameList(stud);

		int actual = list.getNameList().size();

		assertEquals(1, actual);

	}
}
