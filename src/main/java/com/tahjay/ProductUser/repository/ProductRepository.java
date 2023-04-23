package com.tahjay.ProductUser.repository;

import com.tahjay.ProductUser.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
