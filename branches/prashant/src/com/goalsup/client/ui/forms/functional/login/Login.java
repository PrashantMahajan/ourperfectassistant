package com.goalsup.client.ui.forms.functional.login;

import com.goalsup.client.ui.controls.IControl;
import com.goalsup.client.ui.controls.input.PasswordControl;
import com.goalsup.client.ui.controls.input.TextBoxControl;
import com.goalsup.client.ui.controls.navigation.ButtonControl;
import com.goalsup.client.ui.forms.Form;
import com.google.gwt.user.client.ui.FlexTable;

public class Login extends Form implements ILogin {
	FlexTable g_ctlLayout = new FlexTable();
	public Login () {
		super();
	}
	@Override
	public void addAllLayoutControls() {
		this.addNextControl(new TextBoxControl());
		this.addNextControl(new PasswordControl());
		this.addNextControl(new ButtonControl());
	}
	@Override
	public void addNextControl(IControl prm_ctlControl) {
	}

}
