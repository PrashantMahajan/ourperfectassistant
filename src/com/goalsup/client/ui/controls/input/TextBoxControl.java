package com.goalsup.client.ui.controls.input;

import com.goalsup.client.ui.controls.IControl;
import com.google.gwt.user.client.ui.TextBox;

public class TextBoxControl extends TextBox implements IControl {
	protected String label = "";
	public TextBoxControl (String prm_sLabel) {
		this.setLabel(prm_sLabel);
	}
	@Override
	public String getLabel() {
		return this.label;
	}
	@Override
	public void setLabel(String prm_sLable) {
		this.label = prm_sLable;
	}
}
