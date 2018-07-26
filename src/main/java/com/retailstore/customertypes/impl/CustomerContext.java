package com.retailstore.customertypes.impl;

import java.math.BigDecimal;

import com.retailstore.constants.ApplicationConstants;
import com.retailstore.customertypes.CustomerType;
import com.retailstore.dto.CustomerDTO;
import com.retailstore.dto.ProductDTO;

public class CustomerContext {

	private CustomerType customerType;

	public BigDecimal applyProductDiscount(ProductDTO productDTO) {

		if (ApplicationConstants.PRODUCT_TYPE_NON_GR_CODE.equalsIgnoreCase(productDTO.getProductType())) {
			return customerType.applyDiscount(productDTO);
		}
		return productDTO.getPrice();
	}

	public void initialiseCustomerType(CustomerDTO customerDTO) {
		switch (customerDTO.getCustomerType()) {

		case ApplicationConstants.CUSTOMER_TYPE_EMPLOYEE:
			this.customerType = new Employee();
			break;
		case ApplicationConstants.CUSTOMER_TYPE_AFFILIATE:
			this.customerType = new Affiliate();
			break;
		case ApplicationConstants.CUSTOMER_TYPE_REGULAR:
			this.customerType = new RegularCustomer();
			break;
		default:
			this.customerType = new NewCustomer();
		}
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

}
