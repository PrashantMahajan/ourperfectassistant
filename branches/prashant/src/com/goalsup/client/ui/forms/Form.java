package com.goalsup.client.ui.forms;

import java.util.ArrayList;
import java.util.List;

import com.goalsup.client.ui.controls.IControl;
import com.google.gwt.user.client.ui.Panel;

public abstract class Form extends Panel implements IForm {
	protected ArrayList<IControl> allControls = new ArrayList<IControl>();
	protected ArrayList<IControl> allRequiredControls = new ArrayList<IControl>();
	public Form () {
		this.addAllLayoutControls();
	}
	public List<IControl> getAllControls () {
		return this.allControls;
	}
	public List<IControl> getAllRequiredControls () {
		return this.allRequiredControls;
	}
}
