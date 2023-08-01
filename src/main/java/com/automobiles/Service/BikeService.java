package com.automobiles.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.automobiles.Dao.BikeDao;
import com.automobiles.Entity.Bike;
@Service
public class BikeService {
	@Autowired
	BikeDao bd;
	public String setBike(Bike x) {
		return bd.setBike(x);
	}
	public String setAllBike(List<Bike> ab) {
		return bd.setAllBike(ab);
	}
	public List<Bike> getAll() {
		return bd.getAll();
	}
	
	public Bike getById(int x) {
		return bd.getById(x);
	}
	public String deleById(int y) {
		return bd.deleById(y);
	}
	public List<Bike> getByBrand(String w) {
		return bd.getByBrand(w);
	}
	
	
	public List<Bike> getByRange(int v, int u) {
		return bd.getByRange(v,u);
	}
	public List<Bike> getMax() {
		return bd.getMax();
	}

}
