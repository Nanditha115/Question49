package com.nanditha.inventory.service;

import java.util.List;

import com.nanditha.inventory.model.Inventory;


public interface InventoryService {
	

    public List<Inventory> findAll();
    
    void deleteById(Long id);

    public Inventory save(Inventory employee);


}
