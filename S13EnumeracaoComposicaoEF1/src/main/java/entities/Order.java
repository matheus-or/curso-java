package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private Client client;
	private LocalDateTime moment = LocalDateTime.now();
	private OrderStatus status;
	private List<OrderItem> orderItemList = new ArrayList<>();

	public Order(OrderStatus status, Client client) {
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: " + moment.format(fmt)+ "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + "(" + client.getBirthDate().format(fmt2) + ") - " + client.getEmail() + "\n");
		sb.append("Order items: " + "\n");
	
		for (OrderItem orderItem : orderItemList) {
			sb.append(orderItem.getProduct().getName() + String.format(", $%.2f", orderItem.getProduct().getPrice()) + ", Quantity: " + orderItem.getQuantity()+ ", Subtotal: " + String.format(", $%.2f", orderItem.subTotal()) + "\n");
		}
		sb.append(String.format("Total price: $%.2f", total()));
		
		return sb.toString();
	}
	
}
