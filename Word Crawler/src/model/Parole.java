package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the parole database table.
 * 
 */
@Entity
@NamedQuery(name="Parole.findAll", query="SELECT p FROM Parole p")
public class Parole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String parola;

	//bi-directional many-to-many association to Url
	@ManyToMany
	@JoinTable(
		name="url_parole"
		, joinColumns={
			@JoinColumn(name="id_parola")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_url")
			}
		)
	private List<Url> urls;

	public Parole() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getParola() {
		return this.parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public List<Url> getUrls() {
		return this.urls;
	}

	public void setUrls(List<Url> urls) {
		this.urls = urls;
	}

}