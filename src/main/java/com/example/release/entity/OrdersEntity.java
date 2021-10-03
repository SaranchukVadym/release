package com.example.release.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "ORDERS")
public class OrdersEntity {

    @Id
    private Long id;

    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "CREATED_AT")
    private String createdAt;

}
