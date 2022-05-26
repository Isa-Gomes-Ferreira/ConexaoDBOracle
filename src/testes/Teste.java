package testes;

import java.sql.SQLException;
import java.util.Calendar;
import java.sql.Date;
import java.util.List;
import model.Usuario;
import repository.UsuarioDAO;

public class Teste {


	public static void main(String[] args) {

		UsuarioDAO dao = new UsuarioDAO();
		Usuario emerson = new Usuario();
		Usuario adriane = new Usuario();
		
		emerson.setId(5L);
		emerson.setNome("Emerson");
		emerson.setEmail("prof.emerson.ti@gmail.com");
		emerson.setTelefone(135791113);
		
		adriane.setId(6L);
		adriane.setNome("Adriane");
		adriane.setEmail("prof.adriane.ti@yahoo.com.br");
		adriane.setTelefone(987654321);

		//inserirNovo(dao, emerson);
		//inserirNovo(dao, adriane);
		//listarPorId(dao, 2L);
		//excluir(dao, 2L);
		//excluir(dao, 3L);
		//alterar(dao, emerson);
		listarTodos(dao);
		// listarPorId(dao, 1L);

	}

	public static void inserirNovo(UsuarioDAO dao, Usuario usuario) {

		usuario.setId(usuario.getId());
		usuario.setNome(usuario.getNome());
		usuario.setEmail(usuario.getEmail());
		usuario.setTelefone(usuario.getTelefone());
		usuario.setData(usuario.getData());

		try {
			dao.insert(usuario);
			System.out.println("Cadastro realizado");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void excluir(UsuarioDAO dao, Long id) {
		try {
			dao.delete(id);
			System.out.println("Exclusão realizada");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void alterar(UsuarioDAO dao, Usuario usuario) {
		try {
			dao.update(usuario);
			System.out.println("Alteração realizada");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void listarTodos(UsuarioDAO dao) {

		try {
			List<Usuario> usuarios = dao.select();
			for (Usuario usuario : usuarios) {
				System.out.println(usuario.getId());
				System.out.println(usuario.getNome());
				System.out.println(usuario.getEmail());
				System.out.println(usuario.getData());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void listarPorId(UsuarioDAO dao, Long id) {
		try {
			Usuario usuario = dao.selectById(id);

			System.out.println(usuario.getId());
			System.out.println(usuario.getNome());
			System.out.println(usuario.getEmail());
			System.out.println(usuario.getData());

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}
