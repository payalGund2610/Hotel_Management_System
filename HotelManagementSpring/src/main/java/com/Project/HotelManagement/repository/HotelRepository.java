package com.Project.HotelManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Project.HotelManagement.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,Integer>{

}
