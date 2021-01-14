package com.hackathon3.api.repositories;

import com.hackathon3.api.entities.ProductList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductListRepository extends JpaRepository<ProductList, Long> {
}
