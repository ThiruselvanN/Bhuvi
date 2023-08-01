package com.automobiles.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.automobiles.Entity.Bike;
import com.automobiles.Service.BikeService;

@RestController
public class BikeController {
	
	@Autowired
	BikeService bs;
	@PostMapping("/setBike")
	public String setBike(@RequestBody Bike b) {
		return bs.setBike(b);
	}
	
	
	@PostMapping("/setAllBike")
	public String setAllBike(@RequestBody List<Bike> ab) {
		return bs.setAllBike(ab);
	}
	
	
	@GetMapping("/getAll")
	public List<Bike> getAll(){
		return bs.getAll();				
	}
	
	
	@GetMapping("/getById/{x}")
	public Bike getById(@PathVariable int x) {
		return bs.getById(x);
	}
	
	
	@DeleteMapping("/deleteById/{y}")
	public String deleById(@PathVariable int y) {
		return bs.deleById(y);
	}
	
	
	@GetMapping("/getByBrand/{w}")
	public List<Bike> getByBrand(@PathVariable String w){
		return bs.getByBrand(w);
	}
	
	
	@GetMapping("/getByRange/{v}/{u}")
	public List<Bike> getByRange(@PathVariable int v,@PathVariable int u){
		return bs.getByRange(v,u);
	}
	
	
	@GetMapping("/getMax")
	public List<Bike> getMax() {
		return bs.getMax();
	}
}
