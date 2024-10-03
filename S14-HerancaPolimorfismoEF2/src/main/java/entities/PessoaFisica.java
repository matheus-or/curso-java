package entities;

public class PessoaFisica extends Pessoa {

	private Double gastoSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double valorImpostoPago() {

		double imposto = 0.0;

		if (super.getRendaAnual() < 20000.00) {
			imposto = super.getRendaAnual() * 0.15;
		} else {
			imposto = super.getRendaAnual() * 0.25;
		}

		if (this.gastoSaude > 0) {
			imposto -= this.gastoSaude * 0.50;
		}

		if (imposto < 0.0) {
			imposto = 0.0;
		}

		return imposto;
	}

}
