package br.dev.rvz.contatos.resolvers;

import br.dev.rvz.contatos.dtos.CadastrarContatoDTO;
import br.dev.rvz.contatos.model.Contato;
import br.dev.rvz.contatos.services.ContatoService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContatoResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private ContatoService contatoService;

    public Contato cadastrarNovoContato(CadastrarContatoDTO contatoDTO) {
        return contatoService.cadastrarNovoContato(contatoDTO.converterDtoParaModelo());
    }

    public Iterable<Contato> obterTodosContatos() {
        return contatoService.obterTodosContatos();
    }
}
