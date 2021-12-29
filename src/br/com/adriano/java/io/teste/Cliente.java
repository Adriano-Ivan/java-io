
package br.com.adriano.java.io.teste;

import java.io.Serializable;

/**
 * Esta classe representa um cliente no projeto
 * banco do Bytebank.
 * 
 * @author Adriano Ivan
 * @version 0.1
 */
public class Cliente implements Serializable{

	private static final long serialVersionUID= 1250912443096717610L;
	
    private String nome;
    private String cpf;
    private String profissao;

    public String getNomeProfissao() {
    	return nome+", "+profissao;
    }
    public String getNomeCpf() {
    	return nome+", "+cpf;
    }
    public String getNomeCpfProfissao() {
    	return nome+", "+cpf+", "+profissao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
