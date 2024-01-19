package com.xproce.reporitories;

import com.xproce.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    public List<Customer> findByEmail(String username);

}
