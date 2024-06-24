package com.Project.HotelManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.HotelManagement.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>
{

}
