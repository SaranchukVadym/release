package com.example.release.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "ORDER_ITEMS")
public class OrderItemsEntity {

    @Embeddable
    static class OrderItemPK implements Serializable {
        private Long orderId;
        private Long productId;
    }

    @EmbeddedId
    private OrderItemPK orderItemPK;

    @MapsId("orderId")
    @ManyToOne(optional = false)
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ID")
    private OrdersEntity order;

    @MapsId("productId")
    @ManyToOne(optional = false)
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID")
    private ProductsEntity product;

    @Column(name = "QUANTITY")
    private Integer quantity;

}
