package com.goalsup.server.database.tables;

import javax.jdo.PersistenceManager;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.goalsup.server.database.operations.update.AfterUpdate;
import com.goalsup.server.database.operations.update.BeforeUpdate;
import com.goalsup.server.database.persistance.GoalsUpPersistanceController;
import com.google.appengine.api.datastore.Key;

@PersistenceCapable
@Inheritance(strategy = InheritanceStrategy.SUBCLASS_TABLE)
public abstract class BaseTableRow {
	private BeforeUpdate g_objBeforeSaveTrigger = null;
	private AfterUpdate g_objAfterSaveTrigger = null;

	public abstract boolean add();
	public abstract boolean deleteRow();

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	protected Key g_objKey;

	public boolean update() {
		boolean v_Return = false;
		PersistenceManager v_objPersistantManager;
		v_objPersistantManager = GoalsUpPersistanceController.get().getPersistenceManager();
		try {
			v_objPersistantManager.makePersistent(this);
			v_Return = true;
		} catch (Exception v_exException) {
			v_exException.printStackTrace();
			v_Return = false;
		} finally {
			v_objPersistantManager.close();
		}
		return v_Return;
	}
	public void setBeforeUpdateTrigger(BeforeUpdate g_objBeforeSaveTrigger) {
		this.g_objBeforeSaveTrigger = g_objBeforeSaveTrigger;
	}
	public BeforeUpdate getBeforeSaveTrigger() {
		return g_objBeforeSaveTrigger;
	}
	public void setAfterSaveTrigger(AfterUpdate g_objAfterSaveTrigger) {
		this.g_objAfterSaveTrigger = g_objAfterSaveTrigger;
	}
	public AfterUpdate getAfterSaveTrigger() {
		return g_objAfterSaveTrigger;
	}
}
