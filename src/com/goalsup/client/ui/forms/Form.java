package com.goalsup.client.ui.forms;

import java.util.ArrayList;
import java.util.List;

import com.goalsup.client.ui.controls.Control;
import com.goalsup.client.ui.controls.IControl;
import com.google.gwt.user.client.ui.IsWidget;

public abstract class Form extends Control implements IForm {
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
	@Override
	public <nativeGWTControl extends IsWidget> nativeGWTControl getNativeGWTControl() {
		return null;
	}

	@Override
	public <nativeGWTControl extends IsWidget> void setNativeGWTControl(nativeGWTControl prm_objNativeControl) {
		
	}
}
