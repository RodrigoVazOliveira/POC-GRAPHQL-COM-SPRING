package br.dev.rvz.contatos.dtos;

import graphql.schema.GraphQLInputType;
import graphql.schema.GraphQLSchemaElement;
import graphql.schema.GraphQLTypeVisitor;
import graphql.schema.SchemaElementChildrenContainer;
import graphql.util.TraversalControl;
import graphql.util.TraverserContext;

import java.util.List;

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

    @Override
    public List<GraphQLSchemaElement> getChildren() {
        return GraphQLInputType.super.getChildren();
    }

    @Override
    public SchemaElementChildrenContainer getChildrenWithTypeReferences() {
        return GraphQLInputType.super.getChildrenWithTypeReferences();
    }

    @Override
    public GraphQLSchemaElement withNewChildren(SchemaElementChildrenContainer newChildren) {
        return GraphQLInputType.super.withNewChildren(newChildren);
    }

    @Override
    public TraversalControl accept(TraverserContext<GraphQLSchemaElement> context, GraphQLTypeVisitor visitor) {
        return null;
    }
}
