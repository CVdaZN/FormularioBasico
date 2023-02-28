package br.com.criandoapi.projeto.dao;

import br.com.criandoapi.projeto.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuario extends CrudRepository<Usuario, Integer> {
}
