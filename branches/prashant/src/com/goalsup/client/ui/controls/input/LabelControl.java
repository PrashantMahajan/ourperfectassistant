package com.goalsup.client.ui.controls.input;

import com.google.gwt.user.client.ui.Label;

public class LabelControl extends Label implements ILabelControl {

	private String label = "";
	public LabelControl(String prm_sString) {
		this.setLabel(prm_sString);
		this.setText(prm_sString);
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
