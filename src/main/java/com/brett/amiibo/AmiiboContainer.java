package com.brett.amiibo;

import java.util.ArrayList;

/**
 * Created by Brett on 2/7/17.
 */
public class AmiiboContainer {
	ArrayList<Amiibo> myAmiibo = new ArrayList<>();

	public AmiiboContainer(ArrayList<Amiibo> myAmiibo) {
		this.myAmiibo = myAmiibo;
	}

	public AmiiboContainer() {

	}

	public ArrayList<Amiibo> getMyAmiibo() {
		return myAmiibo;
	}

	public void setMyAmiibo(ArrayList<Amiibo> myAmiibo) {
		this.myAmiibo = myAmiibo;
	}
}
