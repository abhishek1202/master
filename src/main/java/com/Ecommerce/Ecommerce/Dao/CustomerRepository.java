package com.Ecommerce.Ecommerce.Dao;

import com.Ecommerce.Ecommerce.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}