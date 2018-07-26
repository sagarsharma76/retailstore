package com.retailstore;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.retailstore.constants.ApplicationConstants;
import com.retailstore.dto.CustomerDTO;
import com.retailstore.dto.ProductDTO;
import com.retailstore.service.DiscountService;
import com.retailstore.service.impl.DiscountServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("Application Started");
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
		logger.info("Total Amount is::" + discountService.getTotalPayableAmount(customerDTO));
	}
}
