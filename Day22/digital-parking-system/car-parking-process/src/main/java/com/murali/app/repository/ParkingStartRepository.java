package com.murali.app.repository;

import com.murali.app.module.ParkingStart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingStartRepository extends JpaRepository<ParkingStart, Integer> {



    ParkingStart findByParkingNo(String parkingNumber);
}
