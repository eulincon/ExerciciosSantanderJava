package exercicioIcognitusSA;

import java.util.Date;
import java.util.Random;

public abstract class Funcionario {
	private String endereco;
	private String nome;
	private String cpf;
	private String setor;
	private double salarioBase;
	private Date dataAdmissao;
	private Date dataDemissao;
	private Date ultimasFerias;
	private Boolean deFerias = false;

	// Constructor
	public Funcionario(String endereco, String nome, String cpf, String setor, double salarioBase, Date dataAdmissao,
			Date dataDemissao) {
		super();
		this.endereco = endereco;
		this.nome = nome;
		this.cpf = cpf;
		this.setor = setor;
		this.salarioBase = salarioBase;
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
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
		System.out.println(this.nome + "$: Funcionario: " + this.nome + "$ Sal�rio: " + this.salarioBase);
		return this.salarioBase;
	}

	
	// Esta fun��o somente pemite o funcionario requisitar as f�rias, por�m n�o d� f�rias ao funcion�rio, tendo em vista
	// que para dar f�rias seriam necess�rias outras informa��es como, quantos dias de f�rias, quando as f�rias come�am.
	// Al�m disso, as f�rias devem tem permiss�o por parte da empresa pois h� caso em que, mesmo o funcion�rio tendo direito �s f�rias
	// a empresa n�o pode disponibilizar.
	// Desse modo esta fun��o, no momento, somentente permite o funcionario requisitar as f�rias. Esta requisi��o ser� enviado para o 
	// RH analis� a posibilidade de dar as f�rias solicitadas.
	public boolean requisitarFerias() {
		var qtdMesesDesdeUltimasFerias = contadorDeMeses(this.ultimasFerias, new Date()) == null ? "Nunca tirou f�rias"
				: contadorDeMeses(this.ultimasFerias, new Date());
		Long qtdMesesDesdeAdmissao = contadorDeMeses(this.dataAdmissao, new Date());
		if (qtdMesesDesdeAdmissao >= 11) {
			if ((this.ultimasFerias == null) || (contadorDeMeses(this.ultimasFerias, new Date()) >= 4)) {
				System.out.println(this.nome + "$: F�rias dispon�veis - f�rias requisitadas. Aguarde a resposta do RH.");
				return true;
			} else {
				System.out
						.println(this.nome + "$: Qtd meses na empresa: " + qtdMesesDesdeAdmissao + " - Qtd meses desde ultima ferias: "
								+ qtdMesesDesdeUltimasFerias + " - F�rias indispon�veis. :/");
				return false;
			}
		} else {
			System.out.println(this.nome + "$: Qtd meses na empresa: " + qtdMesesDesdeAdmissao + " - F�rias indispon�veis. :(");
			return false;
		}
	}

	public Boolean getDeFerias() {
		return deFerias;
	}

	public void setDeFerias(Boolean deFerias) {
		this.deFerias = deFerias;
	}

	public boolean trabalhar() {
		if (this.deFerias) {
			System.out.println(this.nome + "$: Voc� est� de f�rias e n�o pode trabalhar.");
			return false;
		}else if (this.dataDemissao != null) {
			System.out.println(this.nome + "$: Voc� j� foi demitid@ e n�o pode trabalhar.");
			return false;			
		}
		System.out.println(this.nome + "$: Trabalhando...");
		return true;
	}

	public boolean pedirDemissao() {
		System.out.println(this.nome + "$: sua Solicita��o de Demiss�o foi enviada.");
		return true;
	}

	public boolean solicitarAumento() {
		var nRandom = new Random();
		if (nRandom.nextBoolean()) {
			System.out.println(this.nome + "$: Parabens! A empresa concedeu o seu aumento. :)");
			return true;
		} else {
			System.out.println(this.nome + "$: Infelizmente o seu aumento n�o pode ser concedido. :(");
			return false;
		}
	}

	protected Long contadorDeMeses(Date data1, Date data2) {
		return ((data2.getTime() - data1.getTime()) / 1000 / 60 / 60 / 24 / 30);
	}

}
