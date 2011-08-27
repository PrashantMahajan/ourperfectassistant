<?php
	include_once dirname(__FILE__) . './app.php';
	include_once dirname(__FILE__) . './appmodel.php';
	
	class appcontroller {
		public static function getInstance () {
			return new appcontroller();
		}
		public function showApp () {
			$v_objView = null;
			$v_objView = $this->getNewView();
			$v_objView->showPage();
		}
		public function validateUser () {
			return true;
		}
		private function getNewView() {
			return new app();
		}
		private function getNewModel() {
			return new appmodel();
		}
	}
?>
