<?php
	include_once dirname(__FILE__) . './../connections/dbconnection.php';

	class transaction {
		private $g_arrAllTransactions = array();
		public static function getInstance () {
			return new transaction();
		}
		public function addSQL (string $prm_sSQL) {
			array_push($this->g_arrAllTransactions, $prm_sSQL);
		}
		public function addSQLs (array $prm_arrSQLArray) {
			array_merge($array1, $prm_arrSQLArray);
		}
		public function rollback () {
			
		}
		public function commit ($prm_objConnection) {
			
		}
	}
?>