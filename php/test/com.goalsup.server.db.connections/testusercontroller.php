<?php
	include_once dirname(__FILE__) . './../../src/com/goalsup/server/db/connections/dbconnectionpooling.php';
	include_once dirname(__FILE__) . './../../src/com/goalsup/server/db/connections/dbconnection.php';
	include_once dirname(__FILE__) . './../../src/com/goalsup/server/db/tables/user/usercontroller.php';
	
	class dbconnectionpoolingtest {
		private $dbconnectionpool;
		private $dboperations;
		public function __construct() {
			$v_objResults = null;
			$v_objServiceUser = null;
			$v_objUserController = null;
			$v_arrAllUsers = null;
			$this->dbconnectionpool = dbconnectionpooling::getInstance();
			$v_objServiceUser = $this->dbconnectionpool->getServiceUser();
			assert(null != $v_objServiceUser);
			echo("Pass");
			$this->dboperations = dboperations::getInstance();
			$v_objResults = $this->dboperations->executeSQLAndReturnResults($v_objServiceUser, $this->getDummySQL());
			$v_objUserController = usercontroller::getInstance();
			$v_arrAllUsers = $v_objUserController->serialize($v_objResults);
			for ($v_iI = 0; $v_iI < count($v_arrAllUsers); $v_iI++) {
				$v_objUser = $v_arrAllUsers[$v_iI];
				echo ("<BR>User" . $v_iI . ":  Id : " . $v_objUser->getId() . " getUserName : " . $v_objUser->getUserName() . " : getPassword : " . $v_objUser->getPassword());
			}
		}
		private function getDummySQL () {
			return "Select * From User;";
		}
	}
	new dbconnectionpoolingtest();
?>