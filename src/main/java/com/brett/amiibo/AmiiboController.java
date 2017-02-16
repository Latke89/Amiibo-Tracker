package com.brett.amiibo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;

/**
 * Created by Brett on 2/7/17.
 */
@Controller
public class AmiiboController {

	@Autowired
	AmiiboRepository amiibos;

	@Autowired
	AmiiboCategoriesRepository lines;

	@PostConstruct
	public void init() {

		System.out.println("In post-construct");

		AmiiboCategories smash = new AmiiboCategories("Smash Bros", "/images/smashSeries/smashLogo.png", "/smash");
		AmiiboCategories marioSeries = new AmiiboCategories("Mario Bros", "/images/lineLogos/mariobros.png", "/marioSeries");
		AmiiboCategories animalCrossing = new AmiiboCategories("Animal Crossing", "/images/lineLogos/animalcrossing.png", "/crossing");
		AmiiboCategories fireEmblem = new AmiiboCategories("Fire Emblem", "/images/lineLogos/fireemblem.png", "/fe");
		AmiiboCategories kirbySeries = new AmiiboCategories("Kirby", "/images/lineLogos/kirby.png", "/kirbySeries");
		AmiiboCategories zeldaBOTW = new AmiiboCategories("Zelda: Breath of the Wild", "/images/lineLogos/zeldabotw.jpg", "/zeldaSeries");
		AmiiboCategories splatoon = new AmiiboCategories("Splatoon", "/images/lineLogos/splatoon.png", "/splat");

		if(lines.count() == 0) {
			lines.save(smash);
			lines.save(marioSeries);
			lines.save(animalCrossing);
			lines.save(fireEmblem);
			lines.save(kirbySeries);
			lines.save(zeldaBOTW);
			lines.save(splatoon);
		}

		// Smash Bros. Amiibo
		Amiibo mario = new Amiibo("Mario", "/images/smashSeries/mario.png", smash);
		Amiibo luigi = new Amiibo("Luigi", "/images/smashSeries/luigi.png", smash);
		Amiibo peach = new Amiibo("Peach", "/images/smashSeries/peach.png", smash);
		Amiibo bowser = new Amiibo("Bowser", "/images/smashSeries/bowser.png", smash);
		Amiibo drMario = new Amiibo ("Dr. Mario", "/images/smashSeries/drmario.png", smash);
		Amiibo yoshi = new Amiibo("Yoshi", "/images/smashSeries/yoshi.png", smash);
		Amiibo donkeyKong = new Amiibo("Donkey Kong", "/images/smashSeries/donkeykong.png", smash);
		Amiibo diddyKong = new Amiibo("Diddy Kong", "/images/smashSeries/diddykong.png", smash);
		Amiibo link = new Amiibo("Link", "/images/smashSeries/link.png", smash);
		Amiibo zelda = new Amiibo("Zelda", "/images/smashSeries/zelda.png", smash);
		Amiibo sheik = new Amiibo("Sheik", "/images/smashSeries/sheik.png", smash);
		Amiibo ganondorf = new Amiibo("Ganondorf", "/images/smashSeries/ganondorf.png", smash);
		Amiibo toonLink = new Amiibo("Toon Link", "/images/smashSeries/toonlink.png", smash);
		Amiibo samus = new Amiibo("Samus", "/images/smashSeries/samus.png", smash);
		Amiibo zeroSuitSamus = new Amiibo("Zero Suit Samus", "/images/smashSeries/zerosuitsamus.png", smash);
		Amiibo kirby = new Amiibo("Kirby", "/images/smashSeries/kirby.png", smash);
		Amiibo metaKnight = new Amiibo("Meta Knight", "/images/smashSeries/metaknight.png", smash);
		Amiibo dedede = new Amiibo("King Dedede", "/images/smashSeries/dedede.png", smash);
		Amiibo fox = new Amiibo("Fox", "/images/smashSeries/fox.png", smash);
		Amiibo falco = new Amiibo("Falco", "/images/smashSeries/falco.png", smash);
		Amiibo pikachu = new Amiibo("Pikachu", "/images/smashSeries/pikachu.png", smash);
		Amiibo jigglypuff = new Amiibo("Jigglypuff", "/images/smashSeries/jigglypuff.png", smash);
		Amiibo mewtwo = new Amiibo("Mewtwo", "/images/smashSeries/mewtwo.png", smash);
		Amiibo charizard = new Amiibo("Charizard", "/images/smashSeries/charizard.png", smash);
		Amiibo lucario = new Amiibo("Lucario", "/images/smashSeries/lucario.png", smash);
		Amiibo captainFalcon = new Amiibo("Captain Falcon", "/images/smashSeries/captainfalcon.png", smash);
		Amiibo ness = new Amiibo("Ness", "/images/smashSeries/ness.png", smash);
		Amiibo lucas = new Amiibo("Lucas", "/images/smashSeries/lucas.png", smash);
		Amiibo marth = new Amiibo("Marth", "/images/smashSeries/marth.png", smash);
		Amiibo roy = new Amiibo("Roy", "/images/smashSeries/roy.png", smash);
		Amiibo ike = new Amiibo("Ike", "/images/smashSeries/ike.png", smash);
		Amiibo gameAndWatch = new Amiibo("Mr. Game and Watch", "/images/smashSeries/gameandwatch.png", smash);
		Amiibo pit = new Amiibo("Pit", "/images/smashSeries/pit.png", smash);
		Amiibo wario = new Amiibo("Wario", "/images/smashSeries/wario.png", smash);
		Amiibo olimar = new Amiibo("Olimar", "/images/smashSeries/olimar.png", smash);
		Amiibo rob = new Amiibo("R.O.B.", "/images/smashSeries/rob.png", smash);
		Amiibo famicomRob = new Amiibo("R.O.B. Famicom Red", "/images/smashSeries/redrob.png", smash);
		Amiibo sonic = new Amiibo("Sonic", "/images/smashSeries/sonic.png", smash);
		Amiibo rosalina = new Amiibo("Rosalina and Luma", "/images/smashSeries/rosalina.png", smash);
		Amiibo bowserJr = new Amiibo("Bowser Jr.", "/images/smashSeries/bowserjr.png", smash);
		Amiibo greninja = new Amiibo("Greninja", "/images/smashSeries/greninja.png", smash);
		Amiibo robin = new Amiibo("Robin", "/images/smashSeries/robin.png", smash);
		Amiibo lucina = new Amiibo("Lucina", "/images/smashSeries/lucina.png", smash);
		Amiibo palutena = new Amiibo("Palutena", "/images/smashSeries/palutena.png", smash);
		Amiibo darkPit = new Amiibo("Dark Pit", "/images/smashSeries/darkpit.png", smash);
		Amiibo villager = new Amiibo("Villager", "/images/smashSeries/villager.png", smash);
		Amiibo littleMac = new Amiibo("Little Mac", "/images/smashSeries/littlemac.png", smash);
		Amiibo wiiFitTrainer = new Amiibo("Wii Fit Trainer", "/images/smashSeries/wiifittrainer.png", smash);
		Amiibo shulk = new Amiibo("Shulk", "/images/smashSeries/shulk.png", smash);
		Amiibo duckHunt = new Amiibo("Duck Hunt Dog", "/images/smashSeries/duckhunt.png", smash);
		Amiibo megaMan = new Amiibo("Mega Man", "/images/smashSeries/megaman.png", smash);
		Amiibo pacman = new Amiibo("Pacman", "/images/smashSeries/pacman.png", smash);
		Amiibo ryu = new Amiibo("Ryu", "/images/smashSeries/ryu.png", smash);
		Amiibo brawler = new Amiibo("Mii Brawler", "/images/smashSeries/miibrawler.png", smash);
		Amiibo gunner = new Amiibo("Mii Gunner", "/images/smashSeries/miigunner.png", smash);
		Amiibo swordfighter = new Amiibo("Mii Swordfighter", "/images/smashSeries/miiswordfighter.png", smash);

		//Kirby Amiibo
		Amiibo kirby1 = new Amiibo("Kirby", "/images/kirby/kirby.png", kirbySeries);
		Amiibo kingDedede = new Amiibo("King Dedede", "/images/kirby/dedede.png", kirbySeries);
		Amiibo meta = new Amiibo("Meta Knight", "/images/kirby/metaknight.png", kirbySeries);
		Amiibo waddleDee = new Amiibo("Waddle Dee", "/images/kirby/waddledee.png", kirbySeries);

		//Mario Amiibo
		Amiibo eightBitClassic = new Amiibo("Classic Mario - 8 Bit", "/images/marioSeries/8bitclassic.png", marioSeries);
		Amiibo eightBitModern = new Amiibo("Modern Mario - 8 Bit", "/images/marioSeries/8bitmario.png", marioSeries);
		Amiibo boo = new Amiibo("Boo", "/images/marioSeries/boo.png", marioSeries);
		Amiibo bowser2 = new Amiibo("Bowser", "/images/marioSeries/bowser.png", marioSeries);
		Amiibo daisy = new Amiibo("Daisy", "/images/marioSeries/daisy.png", marioSeries);
		Amiibo diddy = new Amiibo("Diddy Kong", "/images/marioSeries/diddy.png", marioSeries);
		Amiibo dk = new Amiibo("Donkey Kong", "/images/marioSeries/dk.png", marioSeries);
		Amiibo goldMario = new Amiibo("Gold Mario", "/images/marioSeries/goldmario.png", marioSeries);
		Amiibo luigi2 = new Amiibo("Luigi", "/images/marioSeries/luigi.png", marioSeries);
		Amiibo mario2 = new Amiibo("Mario", "/images/marioSeries/mario.png", marioSeries);
		Amiibo peach2 = new Amiibo("Peach", "/images/marioSeries/peach.png", marioSeries);
		Amiibo rosalina2 = new Amiibo("Rosalina", "/images/marioSeries/rosalina.png", marioSeries);
		Amiibo silverMario = new Amiibo("Silver Mario", "/images/marioSeries/silvermario.png", marioSeries);
		Amiibo toad = new Amiibo("Toad", "/images/marioSeries/toad.png", marioSeries);
		Amiibo waluigi = new Amiibo("Waluigi", "/images/marioSeries/waluigi.png", marioSeries);
		Amiibo wario2 = new Amiibo("Wario", "/images/marioSeries/wario.png", marioSeries);
		Amiibo yoshi2 = new Amiibo("Yoshi", "/images/marioSeries/yoshi.png", marioSeries);

		//Animal Crossing Amiibo
		Amiibo blathers = new Amiibo("Blathers", "/images/animalCrossing/blathers.png", animalCrossing);
		Amiibo cyrus = new Amiibo("Cyrus", "/images/animalCrossing/cyrus.png", animalCrossing);
		Amiibo digby = new Amiibo("Digby", "/images/animalCrossing/digby.png", animalCrossing);
		Amiibo summerIsabelle = new Amiibo("Isaballe - Summer", "/images/animalCrossing/isabellesummer.png", animalCrossing);
		Amiibo winterIsabelle = new Amiibo("Isabelle - Winter", "/images/animalCrossing/isabellewinter.png", animalCrossing);
		Amiibo kappn = new Amiibo("Kapp'n", "/images/animalCrossing/kappn.png", animalCrossing);
		Amiibo kicks = new Amiibo("Kicks", "/images/animalCrossing/kicks.png", animalCrossing);
		Amiibo kkslider = new Amiibo("K.K. Slider", "/images/animalCrossing/kkslider.png", animalCrossing);
		Amiibo lottie = new Amiibo("Lottie", "/images/animalCrossing/lottie.png", animalCrossing);
		Amiibo mabel = new Amiibo("Mabel", "/images/animalCrossing/mabel.png", animalCrossing);
		Amiibo reese = new Amiibo("Reese", "/images/animalCrossing/reese.png", animalCrossing);
		Amiibo resetti = new Amiibo("Mr. Resetti", "/images/animalCrossing/resetti.png", animalCrossing);
		Amiibo rover = new Amiibo("Rover", "/images/animalCrossing/rover.png", animalCrossing);
		Amiibo tt = new Amiibo("Timmy and Tommy", "/images/animalCrossing/timmy&tommy.png", animalCrossing);
		Amiibo nook = new Amiibo("Tom Nook", "/images/animalCrossing/tomnook.png", animalCrossing);

		//Splatoon Amiibo
		Amiibo inklingBoyBlue = new Amiibo("Inkling Boy - Blue", "/images/splatoon/inklingboyBlue.png", splatoon);
		Amiibo inklingBoyPurple = new Amiibo("Inkling Boy - Purple", "/images/splatoon/inklingboyPurple.png", splatoon);
		Amiibo inklingGirlGreen = new Amiibo("Inkling Girl - Green", "/images/splatoon/inklinggirlGreen.png", splatoon);
		Amiibo inklingGirlOrange = new Amiibo("Inkling Girl - Orange", "/images/splatoon/inklinggirlOrange.png", splatoon);
		Amiibo squidGreen = new Amiibo("Squid - Green", "/images/splatoon/squidGreen.png", splatoon);
		Amiibo squidOrange = new Amiibo("Squid - Orange", "/images/splatoon/squidOrange.png", splatoon);
		Amiibo callie = new Amiibo("Callie", "/images/splatoon/callie.png", splatoon);
		Amiibo marie = new Amiibo("Marie", "/images/splatoon/marie.png", splatoon);

		//Zelda Amiibo
		Amiibo guardian = new Amiibo("Guardian", "/images/zelda/guardian.png", zeldaBOTW);
		Amiibo linkArcher = new Amiibo("Archer Link", "/images/zelda/linkarcher.png", zeldaBOTW);
		Amiibo eightBitLink = new Amiibo("Link - 8 Bit", "/images/zelda/linkloz.png", zeldaBOTW);
		Amiibo linkOot = new Amiibo("Link - Ocarina of Time", "/images/zelda/linkoot.png", zeldaBOTW);
		Amiibo linkRider = new Amiibo("Rider Link", "/images/zelda/linkrider.png", zeldaBOTW);
		Amiibo tLink = new Amiibo("Toon Link", "/images/zelda/linkww.png", zeldaBOTW);
		Amiibo toonZelda = new Amiibo("Toon Zelda", "/images/zelda/zeldaww.png", zeldaBOTW);
		Amiibo wolfLink = new Amiibo("Wolf Link", "/images/zelda/wolflink.png", zeldaBOTW);

		if (amiibos.count() == 0) {
			amiibos.save(mario);
			amiibos.save(luigi);
			amiibos.save(peach);
			amiibos.save(bowser);
			amiibos.save(drMario);
			amiibos.save(yoshi);
			amiibos.save(donkeyKong);
			amiibos.save(diddyKong);
			amiibos.save(link);
			amiibos.save(zelda);
			amiibos.save(sheik);
			amiibos.save(ganondorf);
			amiibos.save(toonLink);
			amiibos.save(samus);
			amiibos.save(zeroSuitSamus);
			amiibos.save(kirby);
			amiibos.save(metaKnight);
			amiibos.save(dedede);
			amiibos.save(fox);
			amiibos.save(falco);
			amiibos.save(pikachu);
			amiibos.save(jigglypuff);
			amiibos.save(mewtwo);
			amiibos.save(charizard);
			amiibos.save(lucario);
			amiibos.save(captainFalcon);
			amiibos.save(ness);
			amiibos.save(lucas);
			amiibos.save(lucario);
			amiibos.save(marth);
			amiibos.save(roy);
			amiibos.save(ike);
			amiibos.save(gameAndWatch);
			amiibos.save(pit);
			amiibos.save(wario);
			amiibos.save(olimar);
			amiibos.save(rob);
			amiibos.save(famicomRob);
			amiibos.save(sonic);
			amiibos.save(rosalina);
			amiibos.save(bowserJr);
			amiibos.save(greninja);
			amiibos.save(robin);
			amiibos.save(lucina);
			amiibos.save(palutena);
			amiibos.save(darkPit);
			amiibos.save(villager);
			amiibos.save(littleMac);
			amiibos.save(wiiFitTrainer);
			amiibos.save(shulk);
			amiibos.save(duckHunt);
			amiibos.save(megaMan);
			amiibos.save(pacman);
			amiibos.save(ryu);
			amiibos.save(brawler);
			amiibos.save(gunner);
			amiibos.save(swordfighter);
			//Adding kirby series
			amiibos.save(kirby1);
			amiibos.save(kingDedede);
			amiibos.save(meta);
			amiibos.save(waddleDee);
			//Adding Mario series
			amiibos.save(eightBitClassic);
			amiibos.save(eightBitModern);
			amiibos.save(boo);
			amiibos.save(bowser2);
			amiibos.save(daisy);
			amiibos.save(diddy);
			amiibos.save(dk);
			amiibos.save(goldMario);
			amiibos.save(luigi2);
			amiibos.save(mario2);
			amiibos.save(peach2);
			amiibos.save(rosalina2);
			amiibos.save(silverMario);
			amiibos.save(toad);
			amiibos.save(waluigi);
			amiibos.save(wario2);
			amiibos.save(yoshi2);
			//Adding Animal Crossing
			amiibos.save(blathers);
			amiibos.save(cyrus);
			amiibos.save(digby);
			amiibos.save(summerIsabelle);
			amiibos.save(winterIsabelle);
			amiibos.save(kappn);
			amiibos.save(kicks);
			amiibos.save(kkslider);
			amiibos.save(lottie);
			amiibos.save(mabel);
			amiibos.save(reese);
			amiibos.save(resetti);
			amiibos.save(rover);
			amiibos.save(tt);
			amiibos.save(nook);
			//Adding Splatoon Amiibo
			amiibos.save(inklingBoyBlue);
			amiibos.save(inklingBoyPurple);
			amiibos.save(inklingGirlGreen);
			amiibos.save(inklingGirlOrange);
			amiibos.save(squidGreen);
			amiibos.save(squidOrange);
			amiibos.save(callie);
			amiibos.save(marie);
			//Adding Zelda Series
			amiibos.save(guardian);
			amiibos.save(linkArcher);
			amiibos.save(eightBitLink);
			amiibos.save(linkOot);
			amiibos.save(linkRider);
			amiibos.save(tLink);
			amiibos.save(toonZelda);
			amiibos.save(wolfLink);
		}

	}

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(path = "/smash", method = RequestMethod.GET)
	public String smashBros() {
		return "smashBros";
	}

	@RequestMapping(path = "/crossing", method = RequestMethod.GET)
	public String animalCrossing() {
		return "animalCrossing";
	}

	@RequestMapping(path = "/kirbySeries", method = RequestMethod.GET)
	public String getKirby() {
		return "kirby";
	}

	@RequestMapping(path = "/marioSeries", method = RequestMethod.GET)
	public String mario() {
		return "mario";
	}

	@RequestMapping(path = "/splat", method = RequestMethod.GET)
	public String splatoon() {
		return "splatoon";
	}

	@RequestMapping(path = "/zeldaSeries", method = RequestMethod.GET)
	public String zelda() {
		return "zelda";
	}

	@RequestMapping(path = "/fe", method = RequestMethod.GET)
	public String fireEmblem() {
		return "fireEmblem";
	}

}
