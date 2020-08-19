package exercicioIcognitusSA;

import java.util.Date;

public class Gerente extends FuncionarioPF{
	
	
	public Gerente(String endereco, String nome, String cpf, String setor, double salarioBase, Date dataAdmissao,
			Date dataDemissao, String nit) {
		super(endereco, nome, cpf, setor, salarioBase, dataAdmissao, dataDemissao, nit);
	}

	public void getBonificacao() {
		this.setSalarioBase(this.getSalarioBase() * 1.12);
	}
	
	public boolean demitirFuncionario(Funcionario funcionario, Date dataDemissao) {
		if(funcionario.getClass().getSimpleName().compareTo("Gerente") == 0) {
			System.out.println(this.getNome() + "$: Você não tem permissão para demitir um funcionário da classe Gerente.");			
			return false;
		}
		funcionario.setDataDemissao(dataDemissao);
		System.out.println(this.getNome() + "$: " + funcionario.getNome() + " Demitid@ com sucesso! " + "Data demissão: " + dataDemissao.toInstant());
		return true;
	}
	
	public boolean reajustarSalarioFuncionario(Funcionario funcionario, double novoSalario) {
		if(funcionario.getClass().getSimpleName().compareTo("Gerente") == 0) {
			System.out.println(this.getNome() + "$: Você não tem permissão para reajustar salário da classe Gerente.");			
			return false;
		}		
		if(novoSalario < funcionario.getSalarioBase()) {
			System.out.println(this.getNome() + "$: Não é permitido reduzir o salário d@ funcionári@ referenciad@.");
			return false;
		}
		funcionario.setSalarioBase(novoSalario);
		System.out.println(this.getNome() + "$: O salário d@ funcionári@ " + funcionario.getNome() + " foi atualizado com sucesso.");
		return true;
	}
	
}
