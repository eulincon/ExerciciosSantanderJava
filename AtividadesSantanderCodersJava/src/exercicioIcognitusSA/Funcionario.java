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
		System.out.println(this.nome + "$: Funcionario: " + this.nome + "$ Salário: " + this.salarioBase);
		return this.salarioBase;
	}

	
	// Esta função somente pemite o funcionario requisitar as férias, porém não dá férias ao funcionário, tendo em vista
	// que para dar férias seriam necessárias outras informações como, quantos dias de férias, quando as férias começam.
	// Além disso, as férias devem tem permissão por parte da empresa pois há caso em que, mesmo o funcionário tendo direito às férias
	// a empresa não pode disponibilizar.
	// Desse modo esta função, no momento, somentente permite o funcionario requisitar as férias. Esta requisição será enviado para o 
	// RH analisá a posibilidade de dar as férias solicitadas.
	public boolean requisitarFerias() {
		var qtdMesesDesdeUltimasFerias = contadorDeMeses(this.ultimasFerias, new Date()) == null ? "Nunca tirou férias"
				: contadorDeMeses(this.ultimasFerias, new Date());
		Long qtdMesesDesdeAdmissao = contadorDeMeses(this.dataAdmissao, new Date());
		if (qtdMesesDesdeAdmissao >= 11) {
			if ((this.ultimasFerias == null) || (contadorDeMeses(this.ultimasFerias, new Date()) >= 4)) {
				System.out.println(this.nome + "$: Férias disponíveis - férias requisitadas. Aguarde a resposta do RH.");
				return true;
			} else {
				System.out
						.println(this.nome + "$: Qtd meses na empresa: " + qtdMesesDesdeAdmissao + " - Qtd meses desde ultima ferias: "
								+ qtdMesesDesdeUltimasFerias + " - Férias indisponíveis. :/");
				return false;
			}
		} else {
			System.out.println(this.nome + "$: Qtd meses na empresa: " + qtdMesesDesdeAdmissao + " - Férias indisponíveis. :(");
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
			System.out.println(this.nome + "$: Você está de férias e não pode trabalhar.");
			return false;
		}else if (this.dataDemissao != null) {
			System.out.println(this.nome + "$: Você já foi demitid@ e não pode trabalhar.");
			return false;			
		}
		System.out.println(this.nome + "$: Trabalhando...");
		return true;
	}

	public boolean pedirDemissao() {
		System.out.println(this.nome + "$: sua Solicitação de Demissão foi enviada.");
		return true;
	}

	public boolean solicitarAumento() {
		var nRandom = new Random();
		if (nRandom.nextBoolean()) {
			System.out.println(this.nome + "$: Parabens! A empresa concedeu o seu aumento. :)");
			return true;
		} else {
			System.out.println(this.nome + "$: Infelizmente o seu aumento não pode ser concedido. :(");
			return false;
		}
	}

	protected Long contadorDeMeses(Date data1, Date data2) {
		return ((data2.getTime() - data1.getTime()) / 1000 / 60 / 60 / 24 / 30);
	}

}
