package com.aj.SpayRa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aj.SpayRa.dto.Customer;
import com.aj.SpayRa.dto.CustomerOrder;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Integer> {

	List<CustomerOrder> findByCustomerAndPaymentIdIsNotNull(Customer customer);

}

