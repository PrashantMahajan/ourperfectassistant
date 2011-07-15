package com.goalsup.server.database.operations.update;

import com.goalsup.server.database.tables.BaseTableRow;

public class AfterUpdate {
	private BaseTableRow g_objBaseTable = null;
	public AfterUpdate (BaseTableRow prm_objAfterSave) {
		this.setBaseTable(prm_objAfterSave);
	}
	public boolean execute () {
		return false;
	}
	public void setBaseTable(BaseTableRow g_objBaseTable) {
		this.g_objBaseTable = g_objBaseTable;
	}
	public BaseTableRow getBaseTable() {
		return g_objBaseTable;
	}
}
