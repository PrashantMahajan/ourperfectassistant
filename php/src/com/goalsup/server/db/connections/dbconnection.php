<?php
	/**
	 * @author Prashant
	 * @version $Id$
	 * @copyright 2011
	 */
	class dboperations{
		public static function getInstance () {
			return new dboperations();
		}
		public function executeSQL (mysqli $prm_objDBConnection, $prm_sSQLToExecute) {
			
		}
		public function executeSQLAndReturnResults ($prm_objConnection, $prm_sSQLToExecute) {
			if (null == $prm_objConnection || null == $prm_sSQLToExecute) {
				return null;
			}
			return $prm_objConnection->query($prm_sSQLToExecute, MYSQLI_STORE_RESULT );
		}
	}
?>