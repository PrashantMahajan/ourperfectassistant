package com.goalsup.client.ui.forms.functional.welcome;

import com.goalsup.client.ui.forms.IForm;
import com.goalsup.client.ui.forms.functional.login.Login;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Welcome extends VerticalPanel implements IWelcome {

	public Welcome () {
		super();
		this.addNextForm(new Login());
	}

	@Override
	public void addNextForm(IForm prm_objForm) {
		this.add(prm_objForm);
	}
}
