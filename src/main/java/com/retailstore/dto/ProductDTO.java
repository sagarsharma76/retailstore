package com.retailstore.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8592963683676556792L;
	private Long id;
	private String productType;
	private BigDecimal price;
	private Integer quantity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
