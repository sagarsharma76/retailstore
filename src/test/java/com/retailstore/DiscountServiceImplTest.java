package com.retailstore;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.retailstore.constants.ApplicationConstants;
import com.retailstore.dto.CustomerDTO;
import com.retailstore.dto.ProductDTO;
import com.retailstore.service.DiscountService;
import com.retailstore.service.impl.DiscountServiceImpl;

public class DiscountServiceImplTest {

	@Test
	public void getTotalPayableAmountForEmployee() {

		DiscountService discountService = new DiscountServiceImpl();
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerType(ApplicationConstants.CUSTOMER_TYPE_EMPLOYEE);
		List<ProductDTO> products = new ArrayList<>();
		ProductDTO productOne = new ProductDTO();
		productOne.setPrice(BigDecimal.valueOf(20));
		productOne.setQuantity(2);
		productOne.setProductType(ApplicationConstants.PRODUCT_TYPE_GR_CODE);
		productOne.setId(1l);
		ProductDTO producTwo = new ProductDTO();
		producTwo.setPrice(BigDecimal.valueOf(10));
		producTwo.setQuantity(10);
		producTwo.setProductType(ApplicationConstants.PRODUCT_TYPE_NON_GR_CODE);
		producTwo.setId(1l);
		products.add(productOne);
		products.add(producTwo);
		customerDTO.setProducts(products);
		assertEquals(BigDecimal.valueOf(105.00).setScale(2), discountService.getTotalPayableAmount(customerDTO));
	}

	@Test
	public void getTotalPayableAmountForAffiliate() {

		DiscountService discountService = new DiscountServiceImpl();
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerType(ApplicationConstants.CUSTOMER_TYPE_AFFILIATE);
		List<ProductDTO> products = new ArrayList<>();
		ProductDTO productOne = new ProductDTO();
		productOne.setPrice(BigDecimal.valueOf(20));
		productOne.setQuantity(2);
		productOne.setProductType(ApplicationConstants.PRODUCT_TYPE_GR_CODE);
		productOne.setId(1l);
		ProductDTO producTwo = new ProductDTO();
		producTwo.setPrice(BigDecimal.valueOf(10));
		producTwo.setQuantity(10);
		producTwo.setProductType(ApplicationConstants.PRODUCT_TYPE_NON_GR_CODE);
		producTwo.setId(1l);
		products.add(productOne);
		products.add(producTwo);
		customerDTO.setProducts(products);
		assertEquals(BigDecimal.valueOf(125.00).setScale(2), discountService.getTotalPayableAmount(customerDTO));
	}

	@Test
	public void getTotalPayableAmountForRegularCustomer() {

		DiscountService discountService = new DiscountServiceImpl();
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerType(ApplicationConstants.CUSTOMER_TYPE_REGULAR);
		List<ProductDTO> products = new ArrayList<>();
		ProductDTO productOne = new ProductDTO();
		productOne.setPrice(BigDecimal.valueOf(20));
		productOne.setQuantity(2);
		productOne.setProductType(ApplicationConstants.PRODUCT_TYPE_GR_CODE);
		productOne.setId(1l);
		ProductDTO producTwo = new ProductDTO();
		producTwo.setPrice(BigDecimal.valueOf(10));
		producTwo.setQuantity(10);
		producTwo.setProductType(ApplicationConstants.PRODUCT_TYPE_NON_GR_CODE);
		producTwo.setId(1l);
		products.add(productOne);
		products.add(producTwo);
		customerDTO.setProducts(products);
		assertEquals(BigDecimal.valueOf(130.00).setScale(2), discountService.getTotalPayableAmount(customerDTO));
	}

	@Test
	public void getTotalPayableAmountForNewCustomer() {

		DiscountService discountService = new DiscountServiceImpl();
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerType(ApplicationConstants.CUSTOMER_TYPE_NEW);
		List<ProductDTO> products = new ArrayList<>();
		ProductDTO productOne = new ProductDTO();
		productOne.setPrice(BigDecimal.valueOf(20));
		productOne.setQuantity(2);
		productOne.setProductType(ApplicationConstants.PRODUCT_TYPE_GR_CODE);
		productOne.setId(1l);
		ProductDTO producTwo = new ProductDTO();
		producTwo.setPrice(BigDecimal.valueOf(10));
		producTwo.setQuantity(10);
		producTwo.setProductType(ApplicationConstants.PRODUCT_TYPE_NON_GR_CODE);
		producTwo.setId(1l);
		products.add(productOne);
		products.add(producTwo);
		customerDTO.setProducts(products);
		assertEquals(BigDecimal.valueOf(135.00).setScale(2), discountService.getTotalPayableAmount(customerDTO));
	}

}
