package com.brett.amiibo;

import javax.persistence.*;

/**
 * Created by Brett on 2/7/17.
 */
@Entity
@Table(name = "amiibo")
public class Amiibo {
	@Id
	@GeneratedValue
	int id;

	@Column(nullable = false)
	String name;

	@Column(nullable = false)
	String imagePath;

	@Column
	Boolean owned;

	@ManyToOne
	AmiiboCategories line;

	public Amiibo(String name, String imagePath, AmiiboCategories line) {
		this.name = name;
		this.imagePath = imagePath;
		this.line = line;
		this.owned = false;
	}

	public Amiibo() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AmiiboCategories getLine() {
		return line;
	}

	public void setLine(AmiiboCategories line) {
		this.line = line;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Boolean getOwned() {
		return owned;
	}

	public void setOwned(Boolean owned) {
		this.owned = owned;
	}
}
