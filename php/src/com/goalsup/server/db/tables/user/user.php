<?php
	include_once dirname(__FILE__) . './../table.php';
	class user extends table {
		public $iduser;
		public $username;
		public $password;
		public function getId () {
			return $this->iduser;
		}
		public function getUserName () {
			return $this->username;
		}
		public function getPassword () {
			return $this->password;
		}
	}
?>