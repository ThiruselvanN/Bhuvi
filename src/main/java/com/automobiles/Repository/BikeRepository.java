package com.automobiles.Repository;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.automobiles.Entity.Bike;

public interface BikeRepository extends JpaRepository<Bike,Integer> {
	@Query(value = "select * from bike_details where brand like?",nativeQuery = true)
	List<Bike> getByBrand(String w);

	@Query(value = "select * from bike_details where price >? and price <?",nativeQuery = true)
	List<Bike> getByRange(int v, int u);

	@Query(value = "select * from bike_details where price = (select max(price) from bike_details)",nativeQuery = true)
	List<Bike> getMax();

}
