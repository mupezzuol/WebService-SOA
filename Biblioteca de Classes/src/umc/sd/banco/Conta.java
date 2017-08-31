package umc.sd.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conta {
	//Atributos
	private int id;
	private String nome;
	private double saldo;
	private String senhaC;
	
	//Get's e Set's
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public String getSenhaC(){
		return this.senhaC;
	}
	public void setSenhaC(String senha){
		this.senhaC = senha;
	}
	
	public Conta(){}
	
	public Conta(int idconta, String senha){
		this.id = idconta;
		this.senhaC = senha;
	}
	
	public Conta(String nome, String senha){
		this.nome = nome;
		this.senhaC = senha;
	}
	
	
	//RECUPERAR - CONSULTAR TODOS
	public boolean recuperar() {
		System.out.println("Dentro do método recuperar()");
		
		boolean resultado = false;
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
        
        try {
        	con = this.getConexao();
        	stmt = con.prepareStatement("SELECT * FROM conta WHERE idconta = ?");
			stmt.setInt(1, this.getId());
			rs = stmt.executeQuery();

			if (rs.next()) {
				this.setId(rs.getInt("idconta"));
				this.setNome(rs.getString("nome"));
				this.setSaldo(rs.getDouble("saldo"));
				resultado = true;
			}
			con.close();
			
        } catch (Exception e) {
        	System.out.println("Erro no método recuperar: " + e.getMessage());
			e.printStackTrace();
        }
        return resultado;
	}
	
	//SAQUE
	public boolean saque(double quantia) {
		
		Connection con = this.getConexao(); //Conecta o banco
		try {
			PreparedStatement stmt = con.prepareStatement("update conta set saldo = saldo - ? where idconta = ? and senha = ?");
			stmt.setDouble(1, quantia);
			stmt.setInt(2, this.id);
			stmt.setString(3, this.senhaC);
			stmt.execute();
			return true; 
		} catch (Exception e) {
		    System.out.println("Erro no método recuperar: " + e.getMessage());
			e.printStackTrace();
		 } finally {
			    try {
			         con.close();
			    }
			     catch (Exception e) {
			    	 System.out.println("Erro no método recuperar: " + e.getMessage());
					 e.printStackTrace();   
			     }
			}
		return false;
	}
		
	//DEPÓSITO
	public boolean deposito(double quantia) {
		
		Connection con = this.getConexao(); //Conecta o banco
		try {
			PreparedStatement stmt = con.prepareStatement("update conta set saldo = saldo + ? where idconta = ? and senha = ?");
			stmt.setDouble(1, quantia);
			stmt.setInt(2, this.id);
			stmt.setString(3, this.senhaC);
			stmt.execute();
			return true; 
		} catch (Exception e) {
		    System.out.println("Erro no método recuperar: " + e.getMessage());
			e.printStackTrace();
		 } finally {
			    try {
			         con.close();
			    }
			     catch (Exception e) {
			    	 System.out.println("Erro no método recuperar: " + e.getMessage());
					 e.printStackTrace();   
			     }
			}
		return false;
	}
	
	public boolean abrirConta() {
				Connection con = this.getConexao(); //Conecta o banco
				try {
					PreparedStatement stmt = con.prepareStatement("insert into conta(nome,saldo,senha) values(?,0,?)");
					stmt.setString(1, this.nome);
					stmt.setString(2, this.senhaC);
					stmt.execute();
					return true; 
				} catch (Exception e) {
				    System.out.println("Erro no método recuperar: " + e.getMessage());
					e.printStackTrace();
				 } finally {
					    try {
					         con.close();
					    }
					     catch (Exception e) {
					    	 System.out.println("Erro no método recuperar: " + e.getMessage());
							 e.printStackTrace();   
					     }
					}
				return false;
			}
	
	
	
	//CONEXÃO COM BANCO DE DADOS
	private Connection getConexao() {
		Connection con = null;
        try{
           String url ="jdbc:postgresql://localhost:5432/dbbanco";
           String usuario="postgres";
           String senha = "postgres";
           Class.forName("org.postgresql.Driver");
           con = DriverManager.getConnection(url,usuario,senha);
           System.out.println("Conexão realizada com sucesso.");
        }catch(Exception e) {
            System.out.println("Falha conexão: " + e.getMessage());
        }
        return con;
	}
}
