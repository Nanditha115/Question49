package com.nanditha.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nanditha.inventory.model.Inventory;
import com.nanditha.inventory.service.InventoryService;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value="/inv")
public class InventoryController {

	@Autowired
    private InventoryService inventoryService;


	@GetMapping
	    public List<Inventory> findAll() {
	        return inventoryService.findAll();
	    }
	
    @PostMapping
    public Inventory save(@RequestBody Inventory inventory) {
        return inventoryService.save(inventory);
    }
    
    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id) {
    	inventoryService.deleteById(id);
    }
}
