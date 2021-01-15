package com.hackathon3.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon3.api.entities.OrderList;

@Repository
public interface OrderListRepository extends JpaRepository<OrderList, Long> {

}
