package com.brett.amiibo;

import java.util.ArrayList;

/**
 * Created by Brett on 2/8/17.
 */
public class CategoriesContainer {
	ArrayList<AmiiboCategories> categories = new ArrayList<>();

	public ArrayList<AmiiboCategories> getCategories() {
		return categories;
	}

	public void setCategories(ArrayList<AmiiboCategories> categories) {
		this.categories = categories;
	}

	public CategoriesContainer(ArrayList<AmiiboCategories> categories) {
		this.categories = categories;
	}

	public CategoriesContainer() {
	}
}
