package br.dev.rvz.contatos.services;

import br.dev.rvz.contatos.model.Contato;
import br.dev.rvz.contatos.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    public Contato cadastrarNovoContato(Contato contato) {
        return contatoRepository.save(contato);
    }

    public Iterable<Contato> obterTodosContatos() {
        return contatoRepository.findAll();
    }
}
