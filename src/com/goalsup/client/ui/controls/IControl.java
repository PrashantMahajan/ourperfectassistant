package com.goalsup.client.ui.controls;

import com.google.gwt.user.client.ui.IsWidget;

public interface IControl extends IsWidget {
	String getLabel();
	void setLabel(String prm_sLable);
	<nativeGWTControl extends IsWidget> nativeGWTControl getNativeGWTControl ();
	<nativeGWTControl extends IsWidget> void setNativeGWTControl (nativeGWTControl prm_objNativeControl);
}
