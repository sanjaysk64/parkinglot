package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.ParkingLot;
import com.example.demo.Model.Vehicle;

 public interface ParkingService {
	
	public ParkingLot add(ParkingLot lot);
	public List<ParkingLot>getAllList();
	public List<Vehicle>getFourWheelers();
	public List<Vehicle>getTwoWheelers();
    public List<Vehicle>SortByName();
	public List<Vehicle>giveSlip();
   }
