package ws;
import umc.sd.banco.Conta;

public class ServicoConta {

	
	public String[] consultarDadosConta(int idConta) {
		System.out.println("Dentro do m�todo consultarDadosConta");
		String[] dadosConta = null;
			
		try {
			Conta conta = new Conta();
			conta.setId(idConta);
			
			if (conta.recuperar()) {
				dadosConta = new String[2];
				dadosConta[0] = conta.getNome();
				dadosConta[1] = Double.toString(conta.getSaldo());
			} else {
				System.out.println("N�o foi poss�vel recuperar a conta com o id " + idConta);
			}
		
		}catch (Exception e) {
			System.out.println("Erro no servi�o consultarDadosConta: " + e.getMessage());
		}
		return dadosConta;		
	}
	
	public void sacar(int idconta, double quantia, String senha){
		System.out.println("Dentro do m�todo SACAR");
		
		try {	
			Conta conta = new Conta(idconta, senha);
			
			if (conta.saque(quantia)) {
				System.out.println("SAQUE realizado com sucesso!");
			} else {
				System.out.println("N�o foi poss�vel realizar o SAQUE");
			}
		
		}catch (Exception e) {
			System.out.println("Erro no servi�o consultarDadosConta: " + e.getMessage());
		}
		
	}
	
	public void depositar(int idconta, double quantia, String senha){
		System.out.println("Dentro do m�todo SACAR");
		
		try {	
			Conta conta = new Conta(idconta, senha);
			
			if (conta.deposito(quantia)) {
				System.out.println("DEPOSITO realizado com sucesso!");
			} else {
				System.out.println("N�o foi poss�vel realizar o DEPOSITO");
			}
		
		}catch (Exception e) {
			System.out.println("Erro no servi�o consultarDadosConta: " + e.getMessage());
		}
	}
	
	public void aberturaDeConta(String nome, String senha){
		System.out.println("Dentro do m�todo ABRIR CONTA");
		
		try {	
			Conta conta = new Conta(nome,senha);
			
			if (conta.abrirConta()) {
				System.out.println("ABERTURA DA CONTA realizado com sucesso!");
			} else {
				System.out.println("N�o foi poss�vel realizar a ABERTURA DA CONTA");
			}
		
		}catch (Exception e) {
			System.out.println("Erro no servi�o consultarDadosConta: " + e.getMessage());
		}
	}

}
