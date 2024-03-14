package com.bijoymogor.trendwave.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bijoymogor.trendwave.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
