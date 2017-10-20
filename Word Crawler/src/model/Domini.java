package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the domini database table.
 * 
 */
@Entity
@NamedQuery(name="Domini.findAll", query="SELECT d FROM Domini d")
public class Domini implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String dominio;

	//bi-directional many-to-one association to Url
	@OneToMany(mappedBy="domini")
	private List<Url> urls;

	public Domini() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDominio() {
		return this.dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public List<Url> getUrls() {
		return this.urls;
	}

	public void setUrls(List<Url> urls) {
		this.urls = urls;
	}

	public Url addUrl(Url url) {
		getUrls().add(url);
		url.setDomini(this);

		return url;
	}

	public Url removeUrl(Url url) {
		getUrls().remove(url);
		url.setDomini(null);

		return url;
	}

}