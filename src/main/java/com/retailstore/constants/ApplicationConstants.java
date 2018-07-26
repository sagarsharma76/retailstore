package com.retailstore.constants;

import java.math.BigDecimal;

public final class ApplicationConstants {

	public static final BigDecimal EMPOYEE_DISCOUNT = BigDecimal.valueOf(0.3);
	public static final BigDecimal AFFILIATE_DISCOUNT = BigDecimal.valueOf(0.1);
	public static final BigDecimal REGULAR_CUSTOMER_DISCOUNT = BigDecimal.valueOf(0.05);
	public static final String PRODUCT_TYPE_GR_CODE = "gr";
	public static final String PRODUCT_TYPE_NON_GR_CODE = "ngr";
	public static final String CUSTOMER_TYPE_EMPLOYEE = "emp";
	public static final String CUSTOMER_TYPE_AFFILIATE = "aff";
	public static final String CUSTOMER_TYPE_REGULAR = "reg";
	public static final String CUSTOMER_TYPE_NEW = "new";
	public static final Integer OVERALL_BILL_DISCOUNT = 5;
	public static final Integer HUNDRED_THRESHOLD = 100;

	private ApplicationConstants() {

	}
}
