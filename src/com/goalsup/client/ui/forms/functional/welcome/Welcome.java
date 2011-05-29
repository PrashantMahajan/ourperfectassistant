package com.goalsup.client.ui.forms.functional.welcome;

import com.goalsup.client.ui.controls.IControl;
import com.goalsup.client.ui.forms.Form;
import com.goalsup.client.ui.forms.functional.login.Login;

public class Welcome extends Form implements IWelcome{

	public Welcome () {
		super();
		
	}

	@Override
	public void addAllLayoutControls() {
		this.addNextControl(new Login());
	}

	@Override
	public void addNextControl(IControl prm_ctlControl) {
		this.allControls.add(prm_ctlControl);
	}

}
