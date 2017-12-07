package Negocio;

import DAO.*;
import EDA.*;
import java.util.ArrayList;

public class NegocioFacade {

	static final DAOFacade registros = DAOMemoria.get();

	private NegocioFacade(){ }

	public static Administrador login(String login, String senha) {
		senha = Toolbox.encrypt( senha );
                Administrador adm = registros.login( login, senha );
                return adm;
	}

	public static Usuario loginBanco(String login, String senha) {
		senha = Toolbox.encrypt( senha );
                Usuario usr = registros.loginBanco( login, senha );
                return usr;
	}

	public static void deposito(double valor_deposito, Usuario usuario) {

	}

	public static void saque(Double valor_saque, Usuario usuario) {

	}

	public static boolean solicitarEmprestimo(Double valor_emprestimo, Usuario usuario) {
		return true;
	}

	public static void realizarEmprestimo(double valor_emprestimo, Usuario usuario) {

	}

	public static void excluirCliente(Usuario usr) {
	}

	public static void modificarCliente(Usuario usr) {
	}

	public static boolean cadastrarCliente(Usuario usr) {
		return true;
	}

	public static boolean verificaDispSaldo(float Valor, Usuario usr) {
		return false;
	}

	public static ArrayList<Usuario> getContas(Administrador login) {
		return null;
	}

	public static ArrayList<Administrador> getGerente(Administrador login) {
		return null;
	}

	public static ArrayList<Sacar> getSaques(Usuario cpf) {
		return null;
	}

	public static ArrayList<Depositar> getDepositos(Usuario cpf) {
		return null;
	}

	public static ArrayList<Emprestimo> getEmprestimos(Usuario cpf) {
		return null;
	}

}