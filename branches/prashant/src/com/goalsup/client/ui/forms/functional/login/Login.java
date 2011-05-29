package com.goalsup.client.ui.forms.functional.login;

import java.util.Iterator;

import com.goalsup.client.ui.controls.input.PasswordControl;
import com.goalsup.client.ui.controls.input.TextBoxControl;
import com.goalsup.client.ui.controls.navigation.ButtonControl;
import com.goalsup.client.ui.forms.Form;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class Login extends Form implements ILogin {
	FlexTable g_ctlLayout = new FlexTable();
	public Login () {
		super();
	}
	@Override
	public void addAllLayoutControls() {
		this.addNextControl(new TextBoxControl("Login"));
		this.addNextControl(new PasswordControl("Password"));
		this.addNextControl(new ButtonControl());
	}
	@Override
	public void addNextControl(IsWidget prm_ctlControl) {
		RootPanel.get().add(prm_ctlControl);
	}
	@Override
	public Iterator<Widget> iterator() {
		return null;
	}
	@Override
	public boolean remove(Widget child) {
		return false;
	}

}
