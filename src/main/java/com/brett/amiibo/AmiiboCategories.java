package com.brett.amiibo;

import javax.persistence.*;

/**
 * Created by Brett on 2/7/17.
 */
@Entity
@Table(name = "categories")
public class AmiiboCategories {
	@Id
	@GeneratedValue
	int id;

	@Column (nullable = false)
	String line;

	@Column (nullable = false)
	String imagePath;

	@Column
	String url;


	public AmiiboCategories(String line, String imagePath, String url) {
		this.line = line;
		this.imagePath = imagePath;
		this.url = url;
	}

	public AmiiboCategories() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
