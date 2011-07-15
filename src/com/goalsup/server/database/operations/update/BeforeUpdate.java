package com.goalsup.server.database.operations.update;

import com.goalsup.server.database.tables.BaseTableRow;

public class BeforeUpdate {
	private BaseTableRow g_objBaseTable = null;
	public BeforeUpdate (BaseTableRow prm_objBaseTable) {
		this.setBaseTable(prm_objBaseTable);
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
