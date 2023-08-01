
package com.automobiles.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.automobiles.Entity.Bike;
import com.automobiles.Repository.BikeRepository;
@Repository
public class BikeDao {
	@Autowired
	BikeRepository br;
	public String setBike(Bike b) {
		br.save(b);
		return "saved";
	}
	public String setAllBike(List<Bike> ab) {
		br.saveAll(ab);
		return "saved again";
	}
	public List<Bike> getAll() {
		return br.findAll();
		
	}
	public Bike getById(int x) {
		return br.findById(x).get();
		
	}
	public String deleById(int y) {
		br.deleteById(y);
		return "deleted";
	}
	public List<Bike> getByBrand(String w) {
		return br.getByBrand(w);
	}
	
	public List<Bike> getByRange(int v, int u) {
		return br.getByRange(v,u);
	}
	public List<Bike> getMax() {
		return br.getMax();
	}
	

}
