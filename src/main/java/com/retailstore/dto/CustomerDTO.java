package com.retailstore.dto;

import java.io.Serializable;
import java.util.List;

public class CustomerDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4423393775293611299L;
	private Long id;
	private String customerType;
	private List<ProductDTO> products;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}

}
