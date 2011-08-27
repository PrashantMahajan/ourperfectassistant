<?php
	include_once dirname(__FILE__) . './../../src/com/goalsup/server/db/connections/dbconnectionpooling.php';
	include_once dirname(__FILE__) . './../../src/com/goalsup/server/db/connections/dbconnection.php';
	
	class dbconnectionpoolingtest {
		private $dbconnectionpool;
		private $dboperations;
		public function __construct() {
			$v_objServiceUser = null;
			$this->dbconnectionpool = dbconnectionpooling::getInstance();
			$v_objServiceUser = $this->dbconnectionpool->getServiceUser();
			assert(null != $v_objServiceUser);
			echo("Pass");
			$this->dboperations = dboperations::getInstance();
			echo($this->dboperations->executeSQLAndReturnResults($v_objServiceUser, $this->getDummySQL())->length);
		}
		private function getDummySQL () {
			return "Select count(*) From User;";
		}
	}
	new dbconnectionpoolingtest();
?>