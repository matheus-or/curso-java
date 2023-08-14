package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Client client;
	private LocalDate moment = LocalDate.now();
	private OrderStatus status;
	private List<OrderItem> orderItemList = new ArrayList<>();

	public Order() {

	}

	public Order(LocalDate moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDate getMoment() {
		return moment;
	}

	public void setMoment(LocalDate moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem orderItem) {
		orderItemList.add(orderItem);
	}

	public void removeItem(OrderItem orderItem) {
		orderItemList.remove(orderItem);
	}

	public Double total() {
		Double total = 0.0;

		for (OrderItem orderItem : orderItemList) {
			total += orderItem.subTotal();
		}

		return total;
	}

}
