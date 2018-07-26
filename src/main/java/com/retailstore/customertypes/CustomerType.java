package com.retailstore.customertypes;

import java.math.BigDecimal;

import com.retailstore.dto.ProductDTO;

public interface CustomerType {

	BigDecimal applyDiscount(ProductDTO productDTO);
}
