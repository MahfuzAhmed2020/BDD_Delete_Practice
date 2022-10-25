package com.hooks.my;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class MyHooks {
	@Before
	public static void beforeScenario() {
		System.out.println("*******beforeScenario******");
		
	}
	@After
	public static void afterScenario() {
		System.out.println("###########afterScenario##########");
		
	}

}
