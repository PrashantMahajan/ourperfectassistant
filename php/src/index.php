<?php

	include_once dirname(__FILE__) . './com/goalsup/server/business/app/appcontroller.php';

	class index {
		public function __construct () {
			$v_objController = null;
			$v_sIsRedirect = null;
			$v_sIsRedirect = $_GET["redirected"];
			$v_objController = appcontroller::getInstance();
			if ($v_sIsRedirect == "true") {
			} else {
				$v_objController->showApp();
			}
		}
	}
	new index();
?>