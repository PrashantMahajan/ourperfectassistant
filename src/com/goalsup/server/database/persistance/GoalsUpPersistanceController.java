package com.goalsup.server.database.persistance;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public final class GoalsUpPersistanceController {

	private static final PersistenceManagerFactory PERSISTANCE_MANAGER = JDOHelper.getPersistenceManagerFactory("transactions-optional");

	private GoalsUpPersistanceController() {
	}

	public static PersistenceManagerFactory get() {
		return PERSISTANCE_MANAGER;
	}
}
