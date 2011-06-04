package com.goalsup.client.ui.forms.functional.login;

import java.util.ArrayList;

import com.goalsup.client.ui.controls.IControl;
import com.goalsup.client.ui.controls.input.LabelControl;
import com.goalsup.client.ui.controls.input.PasswordControl;
import com.goalsup.client.ui.controls.input.TextBoxControl;
import com.goalsup.client.ui.controls.navigation.ButtonControl;
import com.goalsup.client.ui.forms.Form;
import com.goalsup.client.ui.forms.IForm;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Login extends Form implements ILogin {
	protected ArrayList<IControl> allControls = new ArrayList<IControl>();
	protected ArrayList<IControl> allRequiredControls = new ArrayList<IControl>();
	protected VerticalPanel g_ctlLayout = null;

	public Login () {
		super();
		this.g_ctlLayout = new VerticalPanel();
		this.setWidget(this.g_ctlLayout);
		this.addAllLayoutControls();
	}
	@Override
	public void addAllLayoutControls() {
		this.addNextControl(new TextBoxControl("Login"));
		this.addNextControl(new PasswordControl("Password"));
		this.addNextControl(new ButtonControl());
	}
	@Override
	public void addNextControl(IControl prm_ctlControl) {
		HorizontalPanel v_objRow = null;
		LabelControl v_ctlLabel = null;
		
		v_objRow = new HorizontalPanel();
		if (null != prm_ctlControl && null != prm_ctlControl.getLabel()) {
			v_ctlLabel = new LabelControl(prm_ctlControl.getLabel());
			v_ctlLabel.setWidth("200");
			v_objRow.add(v_ctlLabel);
			v_objRow.add(prm_ctlControl);
		}
		this.g_ctlLayout.add(v_objRow);
		super.addNextControl(prm_ctlControl);
	}
}
