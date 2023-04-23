package com.tahjay.ProductUser.repository;

import com.tahjay.ProductUser.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
