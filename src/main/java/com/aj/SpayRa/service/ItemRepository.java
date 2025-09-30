package com.aj.SpayRa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aj.SpayRa.dto.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
