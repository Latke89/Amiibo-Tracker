package com.brett.amiibo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by Brett on 2/7/17.
 */
@RestController
public class AmiiboRestController {
	@Autowired
	AmiiboRepository amiibos;

	@Autowired
	AmiiboCategoriesRepository lines;

	private final static String marioBros = "Mario Bros";
	private final static String zelda = "Zelda: Breath of the Wild";
	private final static String animalCrossing = "Animal Crossing";
	private final static String smash = "Smash Bros";
	private final static String kirby = "Kirby";
	private final static String splatoon = "Splatoon";

	@RequestMapping(path = "amiibo.json", method = RequestMethod.POST)
	public AmiiboContainer getAllAmiibo() {
		Iterable<Amiibo> allAmiibo = amiibos.findAll();
		AmiiboContainer myContainer = new AmiiboContainer();
		myContainer = putAmiiboIntoContainer(allAmiibo, myContainer);
		return myContainer;
	}

	@RequestMapping(path = "lines.json", method = RequestMethod.POST)
	public CategoriesContainer getAllLines() {
		CategoriesContainer myContainer = new CategoriesContainer();
		Iterable<AmiiboCategories> allLines = lines.findAll();
		myContainer = putLinesIntoContainer(allLines, myContainer);
		return myContainer;
	}

	//Testing Querying Methods
	@RequestMapping(path = "getAmiibo.json", method = RequestMethod.GET)
	public AmiiboContainer getList () {
		AmiiboContainer myContainer = new AmiiboContainer();
		myContainer = putSpecificAmiiboIntoContainer(marioBros, myContainer);

		return myContainer;
	}
	@RequestMapping(path = "smashBros.json", method = RequestMethod.POST)
	public AmiiboContainer smashBros() {
		AmiiboContainer myContainer = new AmiiboContainer();
		myContainer = putSpecificAmiiboIntoContainer(smash, myContainer);
		return myContainer;
	}

	@RequestMapping(path = "animalCrossing.json", method = RequestMethod.POST)
	public AmiiboContainer animalCrossing() {
		AmiiboContainer myContainer = new AmiiboContainer();
		myContainer = putSpecificAmiiboIntoContainer(animalCrossing, myContainer);
		return myContainer;
	}

	@RequestMapping(path = "kirby.json", method = RequestMethod.POST)
	public AmiiboContainer kirby() {
		AmiiboContainer myContainer = new AmiiboContainer();
		myContainer = putSpecificAmiiboIntoContainer(kirby, myContainer);
		return myContainer;
	}

	@RequestMapping(path = "mario.json", method = RequestMethod.POST)
	public AmiiboContainer marioSeries() {
		AmiiboContainer myContainer = new AmiiboContainer();
		myContainer = putSpecificAmiiboIntoContainer(marioBros, myContainer);
		return myContainer;
	}

	@RequestMapping(path = "splatoon.json", method = RequestMethod.POST)
	public AmiiboContainer splatoon() {
		AmiiboContainer myContainer = new AmiiboContainer();
		myContainer = putSpecificAmiiboIntoContainer(splatoon, myContainer);
		return myContainer;
	}

	@RequestMapping(path = "zelda.json", method = RequestMethod.POST)
	public AmiiboContainer zelda() {
		AmiiboContainer myContainer = new AmiiboContainer();
		myContainer = putSpecificAmiiboIntoContainer(zelda, myContainer);
		return myContainer;
	}

	@RequestMapping(path = "toggle.json", method = RequestMethod.POST)
	public AmiiboContainer toggle(@RequestBody Amiibo requestedAmiibo) {
		Amiibo myAmiibo = amiibos.findOne(requestedAmiibo.id);
		AmiiboContainer myContainer = new AmiiboContainer();
		if(myAmiibo.owned) {
			myAmiibo.owned = false;
		} else {
			myAmiibo.owned = true;
		}
		amiibos.save(myAmiibo);
		myContainer = putSpecificAmiiboIntoContainer(myAmiibo.line.line, myContainer);
		return myContainer;
	}

	@RequestMapping(path = "toggleSingle.json", method = RequestMethod.POST)
	public Amiibo toggleSingle(@RequestBody Amiibo toggle) {
		Amiibo myAmiibo = amiibos.findOne(toggle.id);
		if(myAmiibo.owned) {
			myAmiibo.owned = false;
		} else {
			myAmiibo.owned = true;
		}
		amiibos.save(myAmiibo);
		return myAmiibo;
	}

	//Moves amiibo from Iterable list to ArrayList
	public AmiiboContainer putAmiiboIntoContainer(Iterable<Amiibo> myList, AmiiboContainer myContainer) {
		for(Amiibo amiibo : myList) {
			myContainer.myAmiibo.add(amiibo);
		}
		return myContainer;
	}

	//Moves amiibo lines from Iterable List to ArrayList
	public CategoriesContainer putLinesIntoContainer(Iterable<AmiiboCategories> myList, CategoriesContainer myContainer) {
		for (AmiiboCategories lines : myList) {
			myContainer.categories.add(lines);
		}
		return myContainer;
	}

	public AmiiboContainer putSpecificAmiiboIntoContainer(String lineName, AmiiboContainer myContainer) {
		AmiiboCategories myLine = lines.findByLine(lineName);
		myContainer.myAmiibo = amiibos.findByLineIdOrderByIdAsc(myLine.getId());
		return myContainer;
	}
}
