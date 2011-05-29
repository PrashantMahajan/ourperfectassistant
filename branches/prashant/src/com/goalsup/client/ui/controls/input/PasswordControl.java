package com.goalsup.client.ui.controls.input;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.PasswordTextBox;

public class PasswordControl extends TextBoxControl implements IPasswordControl {
	private PasswordTextBox g_ctlPassword = new PasswordTextBox();
	public PasswordControl (String prm_sLabel) {
		super(prm_sLabel);
	}
	@SuppressWarnings("unchecked")
	@Override
	public <nativeGWTControl extends IsWidget> nativeGWTControl getNativeGWTControl() {
		if (null == this.g_ctlPassword) {
			this.g_ctlPassword = new PasswordTextBox();
		}
		return (nativeGWTControl) this.g_ctlPassword;
	}

	@Override
	public <nativeGWTControl extends IsWidget> void setNativeGWTControl(nativeGWTControl prm_objNativeControl) {
		if (null == prm_objNativeControl || false == (prm_objNativeControl instanceof PasswordTextBox)) {
			return;
		}
		this.g_ctlPassword = (PasswordTextBox) prm_objNativeControl;
	}

}
