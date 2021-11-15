package com.shiri.SpringBoot33.rapo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiri.SpringBoot33.model.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Long>{

	Customer findByEmailAndPassword(String email, String password);

}