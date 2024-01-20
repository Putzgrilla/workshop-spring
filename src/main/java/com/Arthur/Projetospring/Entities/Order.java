package com.Arthur.Projetospring.Entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.Arthur.Projetospring.Entities.Enum.OrderStatus;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd 'T'HH:mm:ss 'Z'", timezone = "GMT")
	private Instant moment;
	
	private Integer status;
	@ManyToOne
	@JoinColumn(name = "Client_id")
	private User client;

	public Order() {

	}

	public Order(Long id, Instant moment, User client,OrderStatus status) {
		setStatus(status);
		this.setStatus(status);
		this.id = id;
		this.moment = moment;
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	public OrderStatus getStatus() {
		return OrderStatus.valueOf(status);
	}
	
	public void setStatus(OrderStatus status) {
		if(status != null) {
		this.status =  status.getCode();}
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(id, other.id);
	}


}
