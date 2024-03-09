package entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private Date manufactureDate;
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return String.format(" %s (Used) $ %.2f (Manufacture date: %s)", super.getName(), super.getPrice(), sdf1.format(this.manufactureDate));
	}
}
