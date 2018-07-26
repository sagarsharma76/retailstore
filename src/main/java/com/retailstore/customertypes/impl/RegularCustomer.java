package com.retailstore.customertypes.impl;

import java.math.BigDecimal;

import com.retailstore.constants.ApplicationConstants;
import com.retailstore.customertypes.CustomerType;
import com.retailstore.dto.ProductDTO;

public class RegularCustomer implements CustomerType {

	public BigDecimal applyDiscount(ProductDTO productDTO) {
		return productDTO.getPrice()
				.multiply(BigDecimal.valueOf(1).subtract(ApplicationConstants.REGULAR_CUSTOMER_DISCOUNT));
	}

}
