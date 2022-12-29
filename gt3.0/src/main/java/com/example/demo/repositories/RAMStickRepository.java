package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.productTypes.RAMStick;

@Repository
public interface RAMStickRepository extends CrudRepository<RAMStick, Long> {
}
