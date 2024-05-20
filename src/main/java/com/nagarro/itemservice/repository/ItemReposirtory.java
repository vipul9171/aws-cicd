package com.nagarro.itemservice.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.nagarro.itemservice.dto.Items;

@Repository
public class ItemReposirtory {

	public List<Items> getAllItems() {
		return Stream.of(new Items(101, "Samsung", "Mobile"), new Items(102, "Home Appliace", "Washing Machine"),
				new Items(103, "Home Appliace", "Air Conditioning")).collect(Collectors.toList());
	}

}
