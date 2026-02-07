package com.example.itemapi.repository;

import com.example.itemapi.model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ItemRepository {

    private final List<Item> items = new ArrayList<>();
    private Long idCounter = 1L;

    public Item save(Item item) {
        item.setId(idCounter++);
        items.add(item);
        return item;
    }

    public Optional<Item> findById(Long id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }
}