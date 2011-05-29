package com.goalsup.client.ui.controls;

import com.google.gwt.user.client.ui.IsWidget;

public interface IControl extends IsWidget {
	<nativeGWTControl extends IsWidget> nativeGWTControl getNativeGWTControl ();
	<nativeGWTControl extends IsWidget> void setNativeGWTControl (nativeGWTControl prm_objNativeControl);
}
