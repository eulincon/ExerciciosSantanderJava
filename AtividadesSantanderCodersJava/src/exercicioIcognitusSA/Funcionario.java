package exercicioIcognitusSA;

import java.util.Date;

public abstract class Funcionario {
	private String endereco;
	private String nome;
	private String cpf;
	private String setor;
	private double salarioBase;
	private Date dataAdmissao;
	private Date dataDemissao;
	private Date ultimasFerias;

	// Constructor
	public Funcionario(String endereco, String nome, String cpf, String setor, double salarioBase, Date dataAdmissao,
			Date dataDemissao, Date ultimasFerias) {
		super();
		this.endereco = endereco;
		this.nome = nome;
		this.cpf = cpf;
		this.setor = setor;
		this.salarioBase = salarioBase;
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
		this.ultimasFerias = ultimasFerias;
	}

	// Getters and Setters
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Date getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public Date getUltimasFerias() {
		return ultimasFerias;
	}

	public void setUltimasFerias(Date ultimasFerias) {
		this.ultimasFerias = ultimasFerias;
	}

	// Other methods
	public double contraCheque() {
		return this.salarioBase;
	}

	public boolean requisitarFerias() {
		Long qtdMesesDesdeAdmissao = contadorDeMeses(this.dataAdmissao, new Date());
		if (qtdMesesDesdeAdmissao >= 11){
			if ((this.ultimasFerias == null) || (contadorDeMeses(this.ultimasFerias, new Date()) >= 4))  {
				System.out.println("Férias disponíveis - férias requisitadas.");
				return true;
			} else {
				System.out.println("Férias indisponíveis.");
				return false;
			}
		} else {
			System.out.println("Férias indisponíveis.");
			return false;
		}
	}

	protected Long contadorDeMeses(Date data1, Date data2) {
		return ((data2.getTime() - data1.getTime()) / 1000 / 60 / 60 / 24 / 30);
	}

}
