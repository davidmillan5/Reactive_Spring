package com.rsb.bootstrap.services;

import com.rsb.bootstrap.domain.Customer;

import java.util.Collection;

public interface CustomerService {

    Collection<Customer> save(String...names);

    Customer findById(Long id);

    Collection<Customer> findAll();
}
