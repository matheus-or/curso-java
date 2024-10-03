package entities;

public class ImportedProduct extends Product {

	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
		return String.format(" %s $ %.2f (Custom fee: $ %.2f)", super.getName(), this.totalPrice(), this.customsFee);
	}

	public Double totalPrice() {
		return super.getPrice() + this.customsFee;
	}
}
