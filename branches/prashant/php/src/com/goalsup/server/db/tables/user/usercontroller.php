<?php
	include_once dirname(__FILE__) . './../table.php';
	include_once dirname(__FILE__) . './user.php';
	class usercontroller {
		public static function getInstance () {
			return new usercontroller();
		}
		public function serialize ($prm_objResults) {
			$v_Return = array();
			$v_objTable = null;
			if (null == $prm_objResults) {
				return $v_Return;
			}
			while($v_objTable = $prm_objResults->fetch_object("user")) {
				array_push($v_Return, $v_objTable);
			}
			$prm_objResults->close();
			return $v_Return;
		}
	}
?>