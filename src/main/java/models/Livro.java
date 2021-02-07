package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Livro {

	private Long id;

	private String titulo;

	private String nomeAutor;

	private String texto;

	@JoinColumn
	@ManyToOne
	private Categoria categoria;

	// COnstrutor sem argumentos
	public Livro() {

	}
	//Construtor com argumentos
	public Livro(Long id, String titulo, String nomeAutor, String texto, Categoria categoria) {
		this.id = id;
		this.titulo = titulo;
		this.nomeAutor = nomeAutor;
		this.texto = texto;
		this.categoria = categoria;
	}

	// GET

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public String getTexto() {
		return texto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	// Compração por ID
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
