package br.dev.rvz.contatos.dtos;

import br.dev.rvz.contatos.model.Contato;
import graphql.schema.GraphQLInputType;

public class CadastrarContatoDTO implements GraphQLInputType {

    private String nomeCompleto;

    private String email;

    private String telefone;

    public CadastrarContatoDTO() {
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public Contato converterDtoParaModelo() {
        Contato contato = new Contato();
        contato.setNomeCompleto(this.nomeCompleto);
        contato.setEmail(this.email);
        contato.setTelefone(this.telefone);

        return contato;
    }

    @Override
    public String getName() {
        return this.nomeCompleto;
    }
}
