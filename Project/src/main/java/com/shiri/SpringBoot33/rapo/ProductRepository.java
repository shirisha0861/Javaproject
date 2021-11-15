package com.shiri.SpringBoot33.rapo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiri.SpringBoot33.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}