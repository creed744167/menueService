package com.foodapp.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodapp.java.dto.MenuResponseProjection;
import com.foodapp.java.entity.Menu;
import com.foodapp.java.service.MenuService;

@RestController
public class MenuController {

	@Autowired
	MenuService menuService;

	@GetMapping("/menue")
	public ResponseEntity<List<Menu>> getFoodItems() {

		return new ResponseEntity<List<Menu>>(menuService.getFoodItems(), HttpStatus.ACCEPTED);
	}

	@GetMapping("/menue/search")
	public ResponseEntity<List<MenuResponseProjection>> searchFood(@RequestBody Menu menu) {

		return new ResponseEntity<List<MenuResponseProjection>>(menuService.searchFood(menu), HttpStatus.ACCEPTED);
	}
}
