package com.nagarro.itemservice.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.itemservice.dto.Items;
import com.nagarro.itemservice.repository.ItemReposirtory;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequiredArgsConstructor
public class ItemController {

	private final ItemReposirtory itemReposirtory;

	@GetMapping("/getItems")
	public List<Items> getItems() {
		
		log.info("Get Item details requested successfully");
		return itemReposirtory.getAllItems().stream().sorted(Comparator.comparing(Items::getId))
				.collect(Collectors.toList());

	}
}
