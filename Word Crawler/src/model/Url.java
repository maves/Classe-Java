package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the url database table.
 * 
 */
@Entity
@NamedQuery(name="Url.findAll", query="SELECT u FROM Url u")
public class Url implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String url;

	//bi-directional many-to-one association to Domini
	@ManyToOne
	@JoinColumn(name="id_dominio")
	private Domini domini;

	//bi-directional many-to-many association to Parole
	@ManyToMany(mappedBy="urls")
	private List<Parole> paroles;

	public Url() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Domini getDomini() {
		return this.domini;
	}

	public void setDomini(Domini domini) {
		this.domini = domini;
	}

	public List<Parole> getParoles() {
		return this.paroles;
	}

	public void setParoles(List<Parole> paroles) {
		this.paroles = paroles;
	}

}