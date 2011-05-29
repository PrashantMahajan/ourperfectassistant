package com.goalsup.client.ui.controls.input;

import com.goalsup.client.ui.controls.Control;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.TextBox;

public class TextBoxControl extends Control {
	private TextBox g_ctlControl = new TextBox();
	public TextBoxControl (String prm_sLabel) {
		super(prm_sLabel);
	}
	@SuppressWarnings("unchecked")
	@Override
	public <nativeGWTControl extends IsWidget> nativeGWTControl getNativeGWTControl() {
		if (null == this.g_ctlControl) {
			this.g_ctlControl = new TextBox();
		}
		return (nativeGWTControl) this.g_ctlControl;
	}
	@Override
	public <nativeGWTControl extends IsWidget> void setNativeGWTControl(nativeGWTControl prm_objNativeControl) {
		if (null == prm_objNativeControl) {
		} else if (prm_objNativeControl instanceof TextBox) {
			this.g_ctlControl = (TextBox) prm_objNativeControl;
		}
	}
}
