package com.mum.eriplaza.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;


		
@Entity
public class Item implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	    @Id
	    @GeneratedValue
		private Long itemId;
	    @NotEmpty(message="Name is Required")
		private String itemName;
	    @NotEmpty(message="Description is Required")
		private String description;
	    @ManyToOne
	    @Valid
		private Category category;
		@NotNull (message=" Item Must Have a Price")
		private Double unitPrice;
		@JsonIgnore
		@Transient
		private MultipartFile  itemImage;
		@Min(1)
		private long unitsInStock;
		private String itemCondition; 
		private String itemPath;
		
		
	

		public Item() {
			super();
	}
		
		public Long getItemId() {
			return itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public String getItemName() {
		return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Category getCategory() {
			return category;
		}
		public void setCategory(Category category) {
			this.category = category;
		}

		public Double getUnitPrice() {
			return unitPrice;
		}

		public void setUnitPrice(Double unitPrice) {
			this.unitPrice = unitPrice;
		}

		public long getUnitsInStock() {
			return unitsInStock;
		}

		public void setUnitsInStock(long unitsInStock) {
			this.unitsInStock = unitsInStock;
		}

		public String getItemCondition() {
			return itemCondition;
		}

		public void setItemCondition(String itemCondition) {
			this.itemCondition = itemCondition;
		}
        @XmlTransient
		public MultipartFile getItemImage() {
			return itemImage;
		}

		public void setItemImage(MultipartFile itemImage) {
			this.itemImage = itemImage;
		}
		public String getItemPath() {
			return itemPath;
		}

		public void setItemPath(String itemPath) {
			this.itemPath = itemPath;
		}

}

