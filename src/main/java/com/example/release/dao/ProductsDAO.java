package com.example.release.dao;

import com.example.release.dto.ProductDTO;
import com.example.release.entity.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsDAO extends JpaRepository<ProductsEntity, Long> {

    @Modifying
    @Query(value = "SELECT order_items.PRODUCT_ID, SUM(QUANTITY) AS TOTAL_QUANTITY FROM order_items GROUP BY PRODUCT_ID ORDER BY TOTAL_QUANTITY DESC", nativeQuery = true)
    List<ProductDTO> findAllOrdered();

}
