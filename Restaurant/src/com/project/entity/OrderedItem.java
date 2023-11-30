package com.project.entity;
import javax.persistence.*;



import java.time.LocalTime;
@Entity
@Table(name="OrderedItems")

public class OrderedItem {
	@Id
	@Column(name="OrderId")
	private int orderid;
	
	@Column(name="DateOfOrder")
	private LocalTime date;
	@Column(name="TotalSpend")
	private double totalprice;
	@ManyToOne
	@JoinColumn(name="UserIdFk")
	private User userobj;
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public LocalTime getDate() {
		return date;
	}
	public void setDate(LocalTime date) {
		this.date = date;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public User getUserobj() {
		return userobj;
	}
	public void setUserobj(User userobj) {
		this.userobj = userobj;
	}
	

}
