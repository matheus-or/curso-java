package entities;

public class PessoaFisica extends Pessoa {

	private Double gastoSaude;

	public PessoaFisica() {
		super();
	}

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
			imposto = (super.getRendaAnual() / 100) * 15;
		} else {
			imposto = (super.getRendaAnual() / 100) * 25;
		}

		if (this.gastoSaude > 0) {
			imposto = imposto - ((this.gastoSaude / 100) * 50);
		}

		return imposto;
	}

}
