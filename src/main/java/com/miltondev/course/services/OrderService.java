package com.miltondev.course.services;

import java.util.List;
import java.util.Optional;

import com.miltondev.course.entities.Order;
import com.miltondev.course.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id){
            Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
