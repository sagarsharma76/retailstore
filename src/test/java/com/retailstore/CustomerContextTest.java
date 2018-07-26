package com.retailstore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Test;

import com.retailstore.constants.ApplicationConstants;
import com.retailstore.customertypes.impl.Affiliate;
import com.retailstore.customertypes.impl.CustomerContext;
import com.retailstore.dto.CustomerDTO;
import com.retailstore.dto.ProductDTO;

public class CustomerContextTest {

	@Test
	public void testCustomerTypeInitization() {

		CustomerContext customerContext = new CustomerContext();
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerType(ApplicationConstants.CUSTOMER_TYPE_AFFILIATE);
		customerContext.initialiseCustomerType(customerDTO);
		assertTrue(customerContext.getCustomerType() instanceof Affiliate);
	}

	@Test
	public void validateDiscountedPriceForEmployee() {

		CustomerContext customerContext = new CustomerContext();
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerType(ApplicationConstants.CUSTOMER_TYPE_EMPLOYEE);
		ProductDTO productOne = new ProductDTO();
		productOne.setPrice(BigDecimal.valueOf(20));
		productOne.setQuantity(2);
		productOne.setProductType(ApplicationConstants.PRODUCT_TYPE_NON_GR_CODE);
		productOne.setId(1l);
		customerContext.initialiseCustomerType(customerDTO);
		assertEquals(BigDecimal.valueOf(14.00).setScale(2),
				customerContext.applyProductDiscount(productOne).setScale(2));
	}

	@Test
	public void validateDiscountedPriceForRegularCus() {

		CustomerContext customerContext = new CustomerContext();
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerType(ApplicationConstants.CUSTOMER_TYPE_REGULAR);
		ProductDTO productOne = new ProductDTO();
		productOne.setPrice(BigDecimal.valueOf(20));
		productOne.setQuantity(2);
		productOne.setProductType(ApplicationConstants.PRODUCT_TYPE_NON_GR_CODE);
		productOne.setId(1l);
		customerContext.initialiseCustomerType(customerDTO);
		assertEquals(BigDecimal.valueOf(19.00).setScale(2),
				customerContext.applyProductDiscount(productOne).setScale(2));
	}

	@Test
	public void validateDiscountedPriceForAffiliate() {

		CustomerContext customerContext = new CustomerContext();
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerType(ApplicationConstants.CUSTOMER_TYPE_AFFILIATE);
		ProductDTO productOne = new ProductDTO();
		productOne.setPrice(BigDecimal.valueOf(20));
		productOne.setQuantity(2);
		productOne.setProductType(ApplicationConstants.PRODUCT_TYPE_NON_GR_CODE);
		productOne.setId(1l);
		customerContext.initialiseCustomerType(customerDTO);
		assertEquals(BigDecimal.valueOf(18.00).setScale(2),
				customerContext.applyProductDiscount(productOne).setScale(2));
	}

	@Test
	public void validateDiscountedPriceForNewCustomer() {

		CustomerContext customerContext = new CustomerContext();
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerType(ApplicationConstants.CUSTOMER_TYPE_NEW);
		ProductDTO productOne = new ProductDTO();
		productOne.setPrice(BigDecimal.valueOf(20));
		productOne.setQuantity(2);
		productOne.setProductType(ApplicationConstants.PRODUCT_TYPE_NON_GR_CODE);
		productOne.setId(1l);
		customerContext.initialiseCustomerType(customerDTO);
		assertEquals(BigDecimal.valueOf(20.00).setScale(2),
				customerContext.applyProductDiscount(productOne).setScale(2));
	}
}
