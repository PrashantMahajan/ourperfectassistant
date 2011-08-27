<?php
	class app {
		public function __construct () {
		}
		public function showPage () {
			$v_sUsername = null;
			$v_sUsername = $_COOKIE["username"];
			if(appcontroller::getInstance()->validateUser()) {
				$this->showWelcomeScreen();
			}
		}
		private function redirectToLoginIfInValid () {
			header("Location: ./../../../../../index.php?redirected=true");
			exit();
		}
		private function showWelcomeScreen () {
			echo("Yo Fellas this is the Welcome Screen");
		}
	};
?>
