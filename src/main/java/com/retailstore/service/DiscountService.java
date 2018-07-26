package com.retailstore.service;

import java.math.BigDecimal;

import com.retailstore.dto.CustomerDTO;

public interface DiscountService {

	BigDecimal getTotalPayableAmount(CustomerDTO customerDTO);

}
