package com.goalsup.client.ui.controls.input;

import com.goalsup.client.ui.controls.Control;
import com.google.gwt.user.client.ui.IsWidget;

public class LabelControl extends Control implements ILabelControl {

	public LabelControl(String prm_sString) {
		super(prm_sString);
	}

	@Override
	public <nativeGWTControl extends IsWidget> nativeGWTControl getNativeGWTControl() {
		return null;
	}

	@Override
	public <nativeGWTControl extends IsWidget> void setNativeGWTControl(nativeGWTControl prm_objNativeControl) {
	}

}
