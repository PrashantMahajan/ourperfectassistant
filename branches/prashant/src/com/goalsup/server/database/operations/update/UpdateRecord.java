package com.goalsup.server.database.operations.update;

import com.goalsup.server.database.tables.BaseTableRow;

public class UpdateRecord {
	public boolean updateRecord (BaseTableRow prm_objBaseTable) {
		prm_objBaseTable.getBeforeSaveTrigger().execute();
		prm_objBaseTable.update();
		prm_objBaseTable.getAfterSaveTrigger().execute();
		return false;
	}
}
