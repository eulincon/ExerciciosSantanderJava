package exercicioIcognitusSA;

import java.util.Date;

public class Supervisor extends FuncionarioPF{

	public void getBonificacao() {
		this.setSalarioBase(this.getSalarioBase() * 1.08);
	}

	public Supervisor(String endereco, String nome, String cpf, String setor, double salarioBase, Date dataAdmissao,
			Date dataDemissao, String nit) {
		super(endereco, nome, cpf, setor, salarioBase, dataAdmissao, dataDemissao, nit);
	}
	
	public boolean demitirFuncionario(Funcionario funcionario, Date dataDemissao) {
		var fGerente = funcionario.getClass().getSimpleName().compareTo("Gerente");
		var fSupervisor = funcionario.getClass().getSimpleName().compareTo("Supervisor");
		if( fGerente == 0 || fSupervisor == 0) {
			System.out.println(this.getNome() + "$: Você não tem permissão para demitir um funcionário da classe Gerente ou Supervisor.");			
			return false;
		}
		funcionario.setDataDemissao(dataDemissao);
		System.out.println(this.getNome() + "$: "+ funcionario.getNome() +" emitid@ com sucesso! " + "Data demissão: " + dataDemissao.toInstant());
		return true;
	}
}
