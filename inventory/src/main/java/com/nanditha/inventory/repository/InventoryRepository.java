package com.nanditha.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nanditha.inventory.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

}
