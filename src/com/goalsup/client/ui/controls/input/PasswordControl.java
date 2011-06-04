package com.goalsup.client.ui.controls.input;

import com.google.gwt.user.client.ui.PasswordTextBox;

public class PasswordControl extends PasswordTextBox implements IPasswordControl {
	private String label = "";
	public PasswordControl(String prm_sString) {
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
