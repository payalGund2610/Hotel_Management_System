package com.Project.HotelManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.HotelManagement.entities.*;

public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
