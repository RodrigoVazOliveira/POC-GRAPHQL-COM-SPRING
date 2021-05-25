package br.dev.rvz.contatos.services;

import br.dev.rvz.contatos.model.Contato;
import br.dev.rvz.contatos.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public Contato procurarContatoPeloId(Long id) {
        Optional<Contato> optionalContato = contatoRepository.findById(id);

        if (optionalContato.isEmpty()) {
            throw new RuntimeException("Não existe contato com o id " + id);
        }

        return optionalContato.get();
    }
}
