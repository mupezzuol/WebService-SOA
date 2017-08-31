package ws;
import umc.sd.banco.Conta;

public class ServicoConta {

	
	public String[] consultarDadosConta(int idConta) {
		System.out.println("Dentro do método consultarDadosConta");
		String[] dadosConta = null;
			
		try {
			Conta conta = new Conta();
			conta.setId(idConta);
			
			if (conta.recuperar()) {
				dadosConta = new String[2];
				dadosConta[0] = conta.getNome();
				dadosConta[1] = Double.toString(conta.getSaldo());
			} else {
				System.out.println("Não foi possível recuperar a conta com o id " + idConta);
			}
		
		}catch (Exception e) {
			System.out.println("Erro no serviço consultarDadosConta: " + e.getMessage());
		}
		return dadosConta;		
	}
	
	public void sacar(int idconta, double quantia, String senha){
		System.out.println("Dentro do método SACAR");
		
		try {	
			Conta conta = new Conta(idconta, senha);
			
			if (conta.saque(quantia)) {
				System.out.println("SAQUE realizado com sucesso!");
			} else {
				System.out.println("Não foi possível realizar o SAQUE");
			}
		
		}catch (Exception e) {
			System.out.println("Erro no serviço consultarDadosConta: " + e.getMessage());
		}
		
	}
	
	public void depositar(int idconta, double quantia, String senha){
		System.out.println("Dentro do método SACAR");
		
		try {	
			Conta conta = new Conta(idconta, senha);
			
			if (conta.deposito(quantia)) {
				System.out.println("DEPOSITO realizado com sucesso!");
			} else {
				System.out.println("Não foi possível realizar o DEPOSITO");
			}
		
		}catch (Exception e) {
			System.out.println("Erro no serviço consultarDadosConta: " + e.getMessage());
		}
	}
	
	public void aberturaDeConta(String nome, String senha){
		System.out.println("Dentro do método ABRIR CONTA");
		
		try {	
			Conta conta = new Conta(nome,senha);
			
			if (conta.abrirConta()) {
				System.out.println("ABERTURA DA CONTA realizado com sucesso!");
			} else {
				System.out.println("Não foi possível realizar a ABERTURA DA CONTA");
			}
		
		}catch (Exception e) {
			System.out.println("Erro no serviço consultarDadosConta: " + e.getMessage());
		}
	}

}
