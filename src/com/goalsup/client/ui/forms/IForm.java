package com.goalsup.client.ui.forms;

import java.util.List;

import com.goalsup.client.ui.controls.IControl;

public interface IForm extends IControl {
	void addNextControl(IControl prm_ctlControl);
	void addAllLayoutControls();
	List<IControl> getAllControls ();
	List<IControl> getAllRequiredControls();
}
