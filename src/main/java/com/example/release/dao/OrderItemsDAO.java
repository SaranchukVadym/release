package com.example.release.dao;

import com.example.release.entity.OrderItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderItemsDAO extends JpaRepository<OrderItemsEntity, Long> {
    Optional<OrderItemsEntity> findById(Long id);
    List<OrderItemsEntity> findAll();
}
