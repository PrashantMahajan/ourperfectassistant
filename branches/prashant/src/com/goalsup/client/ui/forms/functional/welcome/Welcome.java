package com.goalsup.client.ui.forms.functional.welcome;

import java.util.Iterator;

import com.goalsup.client.ui.forms.Form;
import com.goalsup.client.ui.forms.IForm;
import com.goalsup.client.ui.forms.functional.login.Login;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Welcome extends Form implements IWelcome {

	public Welcome () {
		super();
		this.addNextForm(new Login());
	}
	@Override
	public Iterator<Widget> iterator() {
		return null;
	}

	@Override
	public boolean remove(Widget child) {
		return false;
	}

	@Override
	public void addNextForm(IForm prm_objForm) {
		this.add((Widget) prm_objForm);
	}
	@Override
	public void addNextControl(IsWidget prm_ctlControl) {
	}
	@Override
	public void addAllLayoutControls() {
	}

}
