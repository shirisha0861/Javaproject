package com.shiri.SpringBoot33.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiri.SpringBoot33.model.Customer;
import com.shiri.SpringBoot33.model.Login;
import com.shiri.SpringBoot33.rapo.CustomerRepository;


@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public void add(Customer customer) {
		customerRepository.save(customer);
	}

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	public boolean validate(Login login) {

		String email = login.getEmail();
		String password = login.getPassword();

		Customer customer = customerRepository.findByEmailAndPassword(email, password);

		return customer != null;

	}

}