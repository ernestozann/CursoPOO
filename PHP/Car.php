<?php
require_once('Account.php');
class Car {
	protected $id;
	protected $license;
	protected $driver;
	protected $passenger;

	public function	__construct($license,$driver) {
		$this->license = $license
		$this->driver = $driver
	}

	public function printDataCar() {
		echo "license: $this->license conductor:".$this->driver->name;
	}

	public function getPassenger() {
		return $this->passenger;
	}

	public function setPassenger($passenger) {
		if ($passenger == 4) {
			$this->passenger = $passenger;
		}
		else {
			echo "Necesitas asignar 4 pasageros";
		}
	}
}
?>