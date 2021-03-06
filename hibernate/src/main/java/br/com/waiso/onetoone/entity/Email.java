package br.com.waiso.onetoone.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 
 * @author fabianomatias
 * 
 * @since 09/06/2015
 * 
 * @type Dominante
 *
 */
@Entity
@Table(name = "email")
public class Email implements Serializable {

	@Transient
	private static final long serialVersionUID = -3689382195454890010L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "email")
	private String email;
	
	/*
	 * Com esse atributo e anotação o relacionamento ficará bidirecional
	 * Quando expressamos um relacionamento colocando um atributo em uma das entidades, 
	 * pode-mos acessar a outra entidade a partir da primeira.
	 * 
	 */
//	@OneToOne(mappedBy="email")
//	private Usuario usuario;

	public Email() {
	}

	public Email(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
