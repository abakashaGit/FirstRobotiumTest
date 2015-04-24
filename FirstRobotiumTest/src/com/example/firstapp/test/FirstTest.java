package com.example.firstapp.test;

import com.example.firstapp.MainActivity;
import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class FirstTest extends ActivityInstrumentationTestCase2<MainActivity> {
	private Solo solo;

	public FirstTest() {
		super(MainActivity.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setUp() throws Exception {
		
		solo=new Solo(getInstrumentation(), getActivity());
	}
	@Override
	protected void tearDown() throws Exception {
		
		solo.finishOpenedActivities();
	}
	 public void testCase() throws Exception{
		 solo.enterText(0, "test Robo");
		 solo.clickOnButton("Button");
		 solo.clearEditText(0);
		 solo.enterText(0, "test Robo Second");
		 solo.clickOnButton("Button");
		 


	 }
	 public void testCase2() throws Exception{
		 solo.setActivityOrientation(Solo.LANDSCAPE);
		 solo.setActivityOrientation(Solo.PORTRAIT);
		 solo.clearEditText(0);

		 solo.clickOnButton("Button");
	 }
}
