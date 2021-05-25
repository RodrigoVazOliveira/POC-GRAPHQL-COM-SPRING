package br.dev.rvz.contatos.repositories;

import br.dev.rvz.contatos.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
