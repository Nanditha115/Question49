package com.nanditha.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.nanditha.inventory.model.Inventory;
import com.nanditha.inventory.repository.InventoryRepository;


@Service
public class InventoryServiceImpl implements InventoryService{

	@Autowired
    private InventoryRepository inventoryRepository;


	@Override
	public List<Inventory> findAll() {
		return inventoryRepository.findAll();
	}

	@Override
	public void deleteById(@PathVariable Long id) {
		inventoryRepository.deleteById(id);
		
	}

	@Override
	public Inventory save(Inventory inventory) {
		return inventoryRepository.save(inventory);
	}

}