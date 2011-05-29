package com.goalsup.client;

import com.goalsup.client.ui.forms.functional.welcome.Welcome;
import com.google.gwt.core.client.EntryPoint;
/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Goalsup implements EntryPoint {
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		new Welcome();
	}
}
