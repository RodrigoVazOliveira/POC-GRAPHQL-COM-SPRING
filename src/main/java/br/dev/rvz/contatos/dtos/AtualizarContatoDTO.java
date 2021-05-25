package br.dev.rvz.contatos.dtos;

import br.dev.rvz.contatos.model.Contato;
import graphql.schema.GraphQLInputType;

public class AtualizarContatoDTO implements GraphQLInputType {

    private Long id;

    private String nomeCompleto;

    private String email;

    private String telefone;

    public AtualizarContatoDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        contato.setId(this.id);
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
