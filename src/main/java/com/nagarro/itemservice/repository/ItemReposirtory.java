package com.nagarro.itemservice.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.nagarro.itemservice.dto.Items;

@Repository
public class ItemReposirtory {

    public List<Items> getAllItems() {
        return Stream.of(new Items(151, "Samsung", "Mobile"), new Items(1062, "Home Appliace", "Washing Machine"),
                new Items(13, "Home Appliace", "Air Conditioning"), new Items(8, "Hair", "Washing Machine"), new Items(3, "Apple", "Macbook pro laptop")).collect(Collectors.toList());
    }

}
