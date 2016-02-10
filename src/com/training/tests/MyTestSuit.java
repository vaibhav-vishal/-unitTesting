package com.training.tests;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuppressWarnings("unused")
@RunWith(Suite.class)
@SuiteClasses(value = { FirstTestCase.class, StudentTestCase.class })
public class MyTestSuit {

}
