package com.example.release.dao;

import com.example.release.entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersDAO extends JpaRepository<OrdersEntity, Long> {
    List<OrdersEntity> findAll();
}
