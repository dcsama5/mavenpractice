package com.effectivemaven.chapter01;

import org.testng.annotations.*;

public class ExampleActionTest {
	private ExampleAction action = new ExampleAction();
	
	@Test
	public void executionSuccesseds()
	{
		assert action.execute();
	}
}
