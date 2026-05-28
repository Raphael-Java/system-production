package com.raphaeldev.systemproduct.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raphaeldev.systemproduct.entities.OrderItem;
import com.raphaeldev.systemproduct.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository <OrderItem, OrderItemPK>{ //registrar como componente do Spring

}
