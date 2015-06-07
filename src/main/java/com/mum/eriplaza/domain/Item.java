package com.mum.eriplaza.domain;

import org.springframework.web.multipart.MultipartFile;

public class Item {
	 private static final long serialVersionUID = 1L;
		
		private String itemId;	
		private String name;
		private String description;
		private String category;
		private double unitPrice;
		public String getItemId() {
			return itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public double getUnitPrice() {
			return unitPrice;
		}

		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}

		public long getUnitsInStock() {
			return unitsInStock;
		}

		public void setUnitsInStock(long unitsInStock) {
			this.unitsInStock = unitsInStock;
		}

		public String getCondition() {
			return condition;
		}

		public void setCondition(String condition) {
			this.condition = condition;
		}

		public MultipartFile getProductImage() {
			return productImage;
		}

		public void setProductImage(MultipartFile productImage) {
			this.productImage = productImage;
		}

		private long unitsInStock;
		private String condition; 
		private MultipartFile  productImage;

		public Item() {
			super();
	}


}
