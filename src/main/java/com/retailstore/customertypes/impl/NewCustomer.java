package com.retailstore.customertypes.impl;

import java.math.BigDecimal;

import com.retailstore.customertypes.CustomerType;
import com.retailstore.dto.ProductDTO;

public class NewCustomer implements CustomerType {

	public BigDecimal applyDiscount(ProductDTO productDTO) {
		return productDTO.getPrice();
	}
}
