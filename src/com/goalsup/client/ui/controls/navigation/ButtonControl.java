package com.goalsup.client.ui.controls.navigation;

import com.google.gwt.user.client.ui.Button;

public class ButtonControl extends Button implements IButtonControl {
	private String label = "";
	public ButtonControl() {
	}
	public ButtonControl(String prm_sString) {
		this.setLabel(prm_sString);
	}

	@Override
	public String getLabel() {
		return this.label;
	}

	@Override
	public void setLabel(String prm_sLabel) {
		this.label = prm_sLabel;
	}
}
