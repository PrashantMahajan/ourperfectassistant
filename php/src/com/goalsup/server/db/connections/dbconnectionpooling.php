<?php
	/**
	 * @author Prashant
	 * @version $Id$
	 * @copyright 2011
	 */

	include_once dirname(__FILE__) . './serviceconnection.php';
	include_once dirname(__FILE__) . './useronnection.php';

	class dbconnectionpooling {
		public static function getInstance () {
			return new dbconnectionpooling();
		}
		/**
		 * Constructor
		 */
		private static $C_USER_CONNECTION = "user";
		private static $C_SERVICE_CONNECTION = "service";

		private static $C_MAX_ACTIVE_USERS = 3;
		private static $C_CURRENT_ACTIVE_USERS = 0;

		private static $C_MAX_ACTIVE_SERVICE_USERS = 3;
		private static $C_CURRENT_ACTIVE_SERVICE_USERS = 0;

		public function __construct(){
		}
		public function getUser () {
			$v_Return = null;
			$v_sDatabseName = "";
			$v_sDatabseServer = "";
			$v_sUserName = "";
			$v_sPassword = "";

			try {
				/*
				 * ToDo:
				 *  1. Need to implement Round Robin algorithm here.
				 *  2. Need to Get an event/timer for returning the Connection back.
				 */

				if (array_key_exists(dbconnectionpooling::$C_USER_CONNECTION, $_SERVER)) {/*If the Application Doesn't have one*/
					$v_Return = $_SERVER[dbconnectionpooling::$C_USER_CONNECTION];
				} else {
					if (dbconnectionpooling::$C_MAX_ACTIVE_USERS > dbconnectionpooling::$C_CURRENT_ACTIVE_USERS) {
						$v_sDatabseServer = "localhost";
						$v_sUserName = "root";
						$v_sPassword = "root";
						$v_sDatabseName = "goalsup";
						$v_Return = new userconnection($v_sDatabseServer, $v_sUserName, $v_sPassword, $v_sDatabseName);
						if ($v_Return->connect_error) {
							throw(mysqli_connect_error());
						}
						$_SERVER[dbconnectionpooling::$C_CURRENT_ACTIVE_USERS] = $v_Return;/*Register to Application Level*/
						dbconnectionpooling::$C_CURRENT_ACTIVE_USERS++;
					} else {
						/*Big Time error*/
						die(messages::getMessage(messages::$C_CODE_MAX_DATABASE_CONNECTIONS_EXCEED));
					}
				}
			} catch (exception $v_exException) {
				exceptionHandler::HandleException($v_exException);
			}
			return $v_Return;
		}
		public function getServiceUser () {
			$v_Return = null;
			$v_sDatabseName = "";
			$v_sDatabseServer = "";
			$v_sUserName = "";
			$v_sPassword = "";

			try {
				/*
				 * ToDo:
				 *  1. Need to implement Round Robin algorithm here.
				 *  2. Need to Get an event/timer for returning the Connection back.
				 */
				if (array_key_exists(dbconnectionpooling::$C_SERVICE_CONNECTION, $_SERVER)) {/*If the Application Doesn't have one*/
					$v_Return = $_SERVER[dbconnectionpooling::$C_SERVICE_CONNECTION];
				} else {
					if (dbconnectionpooling::$C_MAX_ACTIVE_SERVICE_USERS > dbconnectionpooling::$C_CURRENT_ACTIVE_SERVICE_USERS) {
						$v_sDatabseServer = "localhost";
						$v_sUserName = "root";
						$v_sPassword = "root";
						$v_sDatabseName = "goalsup";
						$v_Return = new serviceconnection($v_sDatabseServer, $v_sUserName, $v_sPassword, $v_sDatabseName);
						if ($v_Return->connect_error) {
							throw(mysqli_connect_error());
						}
						$_SERVER[dbconnectionpooling::$C_CURRENT_ACTIVE_SERVICE_USERS] = $v_Return;/*Register to Application Level*/
						dbconnectionpooling::$C_CURRENT_ACTIVE_SERVICE_USERS++;
					} else {
						/*Big Time error*/
						die(messages::getMessage(messages::$C_CODE_MAX_DATABASE_CONNECTIONS_EXCEED));
					}
				}
			} catch (Exception $v_exException) {
				exceptionHandler::HandleException($v_exException);
			}
			return $v_Return;
		}
	}
?>