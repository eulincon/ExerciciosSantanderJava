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
			System.out.println(this.getNome() + "$: Voc� n�o tem permiss�o para demitir um funcion�rio da classe Gerente.");			
			return false;
		}
		funcionario.setDataDemissao(dataDemissao);
		System.out.println(this.getNome() + "$: " + funcionario.getNome() + " Demitid@ com sucesso! " + "Data demiss�o: " + dataDemissao.toInstant());
		return true;
	}
	
	public boolean reajustarSalarioFuncionario(Funcionario funcionario, double novoSalario) {
		if(funcionario.getClass().getSimpleName().compareTo("Gerente") == 0) {
			System.out.println(this.getNome() + "$: Voc� n�o tem permiss�o para reajustar sal�rio da classe Gerente.");			
			return false;
		}		
		if(novoSalario < funcionario.getSalarioBase()) {
			System.out.println(this.getNome() + "$: N�o � permitido reduzir o sal�rio d@ funcion�ri@ referenciad@.");
			return false;
		}
		funcionario.setSalarioBase(novoSalario);
		System.out.println(this.getNome() + "$: O sal�rio d@ funcion�ri@ " + funcionario.getNome() + " foi atualizado com sucesso.");
		return true;
	}
	
}
