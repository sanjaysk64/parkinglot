package com.example.demo.Model;

import java.util.Date;

public class Slip {
public Slip() {
	// TODO Auto-generated constructor stub
}
  private Integer Slipid;
  private Integer vehicleNumber;
  private String ownerName;
	
	private Date getAwayTime;
	
	private Date ParkingTime;
	
	private double parkingCharge;

	public Integer getSlipid() {
		return Slipid;
	}

	public void setSlipid(Integer slipid) {
		Slipid = slipid;
	}

	public Integer getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(Integer vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Date getGetAwayTime() {
		return getAwayTime;
	}

	public void setGetAwayTime(Date getAwayTime) {
		this.getAwayTime = getAwayTime;
	}

	public Date getParkingTime() {
		return ParkingTime;
	}

	public void setParkingTime(Date parkingTime) {
		ParkingTime = parkingTime;
	}

	public double getParkingCharge() {
		return parkingCharge;
	}

	public void setParkingCharge(double parkingCharge) {
		this.parkingCharge = parkingCharge;
	}

	public Slip(Integer slipid, Integer vehicleNumber, String ownerName, Date getAwayTime, Date parkingTime,
			double parkingCharge) {
		super();
		Slipid = slipid;
		this.vehicleNumber = vehicleNumber;
		this.ownerName = ownerName;
		this.getAwayTime = getAwayTime;
		ParkingTime = parkingTime;
		this.parkingCharge = parkingCharge;
	}

	@Override
	public String toString() {
		return "Slip [Slipid=" + Slipid + ", vehicleNumber=" + vehicleNumber + ", ownerName=" + ownerName
				+ ", getAwayTime=" + getAwayTime + ", ParkingTime=" + ParkingTime + ", parkingCharge=" + parkingCharge
				+ "]";
	}

  
}
