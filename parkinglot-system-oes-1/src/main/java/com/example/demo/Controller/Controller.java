package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ParkingLot;
import com.example.demo.Model.Vehicle;
import com.example.demo.service.ParkingService;
 
@RestController
@RequestMapping("parkinglot")
public class Controller {

	@Autowired
	private ParkingService parkingService;
	
	@PostMapping("save")
	public ParkingLot save(@RequestBody ParkingLot lot)
	{
		return parkingService.add(lot);
	}
	@GetMapping("getAll")
	public List<ParkingLot>getAll()
	{
	    return parkingService.getAllList();
	}
	
	@GetMapping("getAllFour")
	public List<Vehicle> getAllFour()
	{
		return parkingService.getFourWheelers();
	}
	
	@GetMapping("getAllTwo")
	public List<Vehicle> getAllTwo()
	{
		return parkingService.getTwoWheelers();
	}

	@GetMapping("sortByName")
	public List<Vehicle> SortByOwnerNmae()
	{
		return parkingService.SortByName();
	}
	
	@GetMapping("slip")
     public List<Vehicle> getSlip()
     {
		return parkingService.giveSlip();
     }
}
