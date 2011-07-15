package com.goalsup.server.database.tables.user;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import com.goalsup.server.database.tables.BaseTableRow;

@PersistenceCapable
@Inheritance(customStrategy = "complete-table")
public class User extends BaseTableRow {

	@Persistent
	private String g_sName  = null;
	
	@Override
	public boolean add() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRow() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setName(String g_sName) {
		this.g_sName = g_sName;
	}

	public String getName() {
		return g_sName;
	}

}
