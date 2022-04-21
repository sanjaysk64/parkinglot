package com.example.demo.Model;

import java.util.Date;

import javax.persistence.Entity;
  import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Vehicle {

	@Id
	private Integer vehicleNum;
	private String ownerName;
	private String vehicleType;
	private Double parkingCharge;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date parkingTime = new Date(System.currentTimeMillis());

	public Integer getVehicleNum() {
		return vehicleNum;
	}

	public void setVehicleNum(Integer vehicleNum) {
		this.vehicleNum = vehicleNum;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Double getParkingCharge() {
		return parkingCharge;
	}

	public void setParkingCharge(Double parkingCharge) {
		this.parkingCharge = parkingCharge;
	}

	public Date getParkingTime() {
		return parkingTime;
	}

	public void setParkingTime(Date parkingTime) {
		this.parkingTime = parkingTime;
	}
public Vehicle() {
	// TODO Auto-generated constructor stub
}
	public Vehicle(Integer vehicleNum, String ownerName, String vehicleType, Double parkingCharge, Date parkingTime) {
		super();
		this.vehicleNum = vehicleNum;
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.parkingCharge = parkingCharge;
		this.parkingTime = parkingTime;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleNum=" + vehicleNum + ", ownerName=" + ownerName + ", vehicleType=" + vehicleType
				+ ", parkingCharge=" + parkingCharge + ", parkingTime=" + parkingTime + "]";
	}

		
	
}
