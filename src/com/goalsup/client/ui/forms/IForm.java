package com.goalsup.client.ui.forms;

import java.util.List;

import com.goalsup.client.ui.controls.IControl;
import com.google.gwt.user.client.ui.IsWidget;

public interface IForm {
	void addNextControl(IsWidget prm_ctlControl);
	void addAllLayoutControls();
	List<IControl> getAllControls ();
	List<IControl> getAllRequiredControls();
}
