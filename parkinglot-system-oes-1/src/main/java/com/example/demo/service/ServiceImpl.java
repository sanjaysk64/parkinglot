package com.example.demo.service;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ParkingLot;
import com.example.demo.Model.Vehicle;
import com.example.demo.repo.ParkingRepo;
import com.example.demo.repo.Repo;

@Service
public class ServiceImpl implements ParkingService{

	@Autowired
	private Repo repo;
	@Autowired
  private ParkingRepo parkingRepo;	
	@Override
	
	public ParkingLot add(ParkingLot lot) 
	{
	return	parkingRepo.save(lot);
  	}
	@Override
	public List<ParkingLot> getAllList() {
		// TODO Auto-generated method stub
		return parkingRepo.findAll();
	}
	@Override
	public List<Vehicle> getFourWheelers() {
		List<Vehicle> list = repo.findAll();
	List<Vehicle>vehicles= 	list.stream().filter((i1)->i1.getVehicleType().equals("four wheeler")).collect(Collectors.toList());
		
 		return vehicles;
	}
	@Override
	public List<Vehicle> getTwoWheelers() {
		List<Vehicle> list = repo.findAll();
		List<Vehicle>ve=  list.stream().filter((i1)->i1.getVehicleType().equals("two wheeler")).collect(Collectors.toList());
 		return  ve ;
	}
	 @Override
	public List<Vehicle> SortByName() 
	 {
		 List<Vehicle> list = repo.findAll();
		 List<Vehicle>ve= list.stream().sorted((i1,i2)->i1.getOwnerName().compareTo(i2.getOwnerName())).collect(Collectors.toList());
 		return ve;
	}
	 @Override
	public List<Vehicle> giveSlip() {
	int s=0;	 
    List<Vehicle>list=repo.findAll();
	for (Vehicle vehicle : list)
		
	{
		Date d=vehicle.getParkingTime();
		int a=d.getHours();
		  
		LocalTime t=LocalTime.now();
		int b=t.getHour();
		
		s=a-b;	
	}
	System.out.println(s);
 		return list;
	}
		 
	 
	 
}
