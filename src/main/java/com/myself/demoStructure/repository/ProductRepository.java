package com.myself.demoStructure.repository;

import com.myself.demoStructure.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

