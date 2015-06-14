
package com.mum.eriplaza.domain;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;
		
@Entity
public class Item implements Serializable{
	private static final long serialVersionUID = 1L;
	    @Id
		private String itemId;	
		private String itemName;
		private String description;
		@OneToMany
		private List<Category> category;
		private double unitPrice;
	//	@JsonIgnore
	//	@Transient
	//	private MultipartFile  itemImage;
		private long unitsInStock;
	//	private String condition; 
		

		public Item() {
			super();
	}
		public String getItemId() {
			return itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public String getName() {
			return itemName;
		}

		public void setName(String itemName) {
			this.itemName = itemName;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<Category> getCategory() {
			return category;
		}
		public void setCategory(List<Category> category) {
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

//		public String getCondition() {
//			return condition;
//		}
//
//		public void setCondition(String condition) {
//			this.condition = condition;
//		}
//        @XmlTransient
//		public MultipartFile getItemImage() {
//			return itemImage;
//		}
//
//		public void setItemImage(MultipartFile itemImage) {
//			this.itemImage = itemImage;
//		}


}
