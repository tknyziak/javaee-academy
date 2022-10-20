package io._10a.javaeeacademy.entity;

import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS")
@NamedQueries({
@NamedQuery(
		name = "Customers.findAll",
		query = "SELECT c FROM Customer c"
),
@NamedQuery(
	name = "Customers.startingWith",
	query = "SELECT c FROM Customer c WHERE c.name LIKE :likeExpression"
)})
public class Customer {

	@Id
	@Column(name = "CUSTOMER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "NAME")
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
