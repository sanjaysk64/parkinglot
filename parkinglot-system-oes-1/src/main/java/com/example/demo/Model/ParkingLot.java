package com.example.demo.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
  import javax.persistence.Id;
 import javax.persistence.OneToMany;
@Entity
public class ParkingLot {

	@Id
	private Integer parkingNumber;
	
	@OneToMany(cascade = CascadeType.ALL)
 	private List<Vehicle>vehicles;
	
	public ParkingLot() {
		// TODO Auto-generated constructor stub
	}
	public Integer getParkingNumber() {
		return parkingNumber;
	}
	public void setParkingNumber(Integer parkingNumber) {
		this.parkingNumber = parkingNumber;
	}
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	@Override
	public String toString() {
		return "ParkingLot [parkingNumber=" + parkingNumber + ", vehicles=" + vehicles + "]";
	}
	
}
