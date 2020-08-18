package exercicioBancoSantander;

public class Cliente {
	private int clientNumber;
	private String surname;
	private String rg;
	private String cpf;

	public Cliente(int clientNumber, String surname, String rg, String cpf) {
		super();
		this.clientNumber = clientNumber;
		this.surname = surname;
		this.rg = rg;
		this.cpf = cpf;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
