package com.brett.amiibo;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brett on 2/7/17.
 */
public interface AmiiboRepository extends CrudRepository<Amiibo, Integer> {
	ArrayList<Amiibo> findByLineIdOrderByIdAsc(int lineId);
}
