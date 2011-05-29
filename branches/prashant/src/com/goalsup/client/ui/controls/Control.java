package com.goalsup.client.ui.controls;

import com.google.gwt.user.client.ui.Widget;

public abstract class Control extends Widget implements IControl {
	protected String label = "";
	public Control() {
	}
	public Control(String prm_sString) {
		this.setLabel(prm_sString);
	}
	public String getLabel() {
		return this.label;
	}
	public void setLabel(String prm_sLable) {
		this.label = prm_sLable;
	}
}
