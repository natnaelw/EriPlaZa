
package com.mum.eriplaza.domain;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;
		
@Entity
public class Item implements Serializable{
	private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
		private Long itemId;	
		private String itemName;
		private String description;
		@ManyToOne
		private Category category;
		private double unitPrice;
		@JsonIgnore
		@Transient
		private MultipartFile  itemImage;
		private long unitsInStock;
		private String itemCondition; 
		
		
		

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


}
