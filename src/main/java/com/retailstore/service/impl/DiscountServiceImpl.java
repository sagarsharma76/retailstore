package com.retailstore.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.apache.log4j.Logger;

import com.retailstore.constants.ApplicationConstants;
import com.retailstore.customertypes.impl.CustomerContext;
import com.retailstore.dto.CustomerDTO;
import com.retailstore.dto.ProductDTO;
import com.retailstore.service.DiscountService;

public class DiscountServiceImpl implements DiscountService {

	private static final Logger logger = Logger.getLogger(DiscountServiceImpl.class);

	public BigDecimal getTotalPayableAmount(CustomerDTO customerDTO) {

		logger.info("In method getTotalPayableAmount for customer id::" + customerDTO.getId());
		CustomerContext customerContext = new CustomerContext();
		customerContext.initialiseCustomerType(customerDTO);
		BigDecimal initialAmount = applyCustomerDiscount(customerDTO.getProducts(), customerContext);
		BigDecimal totalAmount = applyBillDiscount(initialAmount);
		return totalAmount.setScale(2);
	}

	private BigDecimal applyCustomerDiscount(List<ProductDTO> products, CustomerContext customerContext) {

		BigDecimal totalAmount = BigDecimal.valueOf(0);
		for (ProductDTO product : products) {
			totalAmount = totalAmount.add(
					customerContext.applyProductDiscount(product).multiply(BigDecimal.valueOf(product.getQuantity())));
		}
		return totalAmount;
	}

	private BigDecimal applyBillDiscount(BigDecimal totalAmount) {

		int discountMul = totalAmount.divide(BigDecimal.valueOf(ApplicationConstants.HUNDRED_THRESHOLD)).intValue();
		return totalAmount.subtract(new BigDecimal(ApplicationConstants.OVERALL_BILL_DISCOUNT * discountMul));
	}

}
