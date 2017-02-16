package com.brett.amiibo;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Brett on 2/7/17.
 */
public interface AmiiboCategoriesRepository extends CrudRepository<AmiiboCategories, Integer> {
	AmiiboCategories findByLine (String name);
}
