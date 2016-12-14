package com.samit.springservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="order_list")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="order_id")
	private int id;
	
	@Column(name="order_name")
	private String orderName;
	
	@Column(name="order_description")
	private String orderDescription;
	
	@Column(name="order_priority")
	private String orderPriority;
	
	@Column(name="order_status")
	private String orderStatus;
	
	@Column(name="order_archived")
	private int orderArchived = 0;

	public int getOrderId() {
		return id;
	}

	public void setOrderId(int orderId) {
		this.id = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderDescription() {
		return orderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	public String getOrderPriority() {
		return orderPriority;
	}

	public void setOrderPriority(String orderPriority) {
		this.orderPriority = orderPriority;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int isOrderArchived() {
		return orderArchived;
	}

	public void setOrderArchived(int orderArchived) {
		this.orderArchived = orderArchived;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderName=" + orderName
				+ ", orderDescription=" + orderDescription + ", orderPriority="
				+ orderPriority + ",orderStatus=" + orderStatus + "]";
	}

}

