package org.wecancodeit.albumcollection;

// import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.albumcollection.model.Artist;
import org.wecancodeit.albumcollection.model.Album;
import org.wecancodeit.albumcollection.model.Song;
import org.wecancodeit.albumcollection.repositories.ArtistRepository;
import org.wecancodeit.albumcollection.repositories.AlbumRepository;
import org.wecancodeit.albumcollection.repositories.SongRepository;

@Service
public class Populator implements CommandLineRunner {

	@Autowired
	ArtistRepository artistRepo;
	
	@Autowired
	AlbumRepository albumRepo;
	
	@Autowired
	SongRepository songRepo;
	
	@Override
	public void run(String... args) throws Exception {
		// Create default artists
		Artist mcs = new Artist("Motion City Soundtrack", "https://kellimk.github.io/src/main/resources/static/images/motioncitysoundtrack.png");
		Artist femm = new Artist("FEMM", "https://kellimk.github.io/src/main/resources/static/images/femm.png");
		Artist marina = new Artist("Marina (AKA Marina and the Diamonds)", "https://kellimk.github.io/src/main/resources/static/images/marina.png");
		
		// add default artists to repository
		artistRepo.save(mcs);
		artistRepo.save(femm);
		artistRepo.save(marina);
		
		// create default artist's albums
		Album thefamilyjewels = new Album("The Family Jewels", "https://kellimk.github.io/src/main/resources/static/images/thefamilyjewels.png", "Atlantic Records", marina);
		Album electraheart = new Album("Electra Heart", "https://kellimk.github.io/src/main/resources/static/images/electraheart.png", "Atlantic Records", marina);
		Album frootalbum = new Album("Froot", "https://kellimk.github.io/src/main/resources/static/images/froot.png", "Atlantic Records", marina);
		Album iamthemovie = new Album("I Am The Movie", "https://kellimk.github.io/src/main/resources/static/images/iamthemovie.png", "Epitaph Records", mcs);
		Album committhistomemory = new Album("Commit This Too Memory", "https://kellimk.github.io/src/main/resources/static/images/committhistomemory.png", "Epitaph Records", mcs);
		Album evenifitkillsme = new Album("Even If It Kills Me", "https://kellimk.github.io/src/main/resources/static/images/evenifitkillsme.png", "Columbia Records", mcs);
		Album mydinosaurlife = new Album("My Dinosaur Life", "https://kellimk.github.io/src/main/resources/static/images/mydinosaurlife.png", "Epitaph Records", mcs);
		Album gomcs = new Album("Go", "https://kellimk.github.io/src/main/resources/static/images/gomcs.png", "Epitaph Records", mcs);
		Album panicstations = new Album("Panic Stations", "https://kellimk.github.io/src/main/resources/static/images/panicstations.png", "Epitaph Records", mcs);
		Album femmisation = new Album("Femm-isation", "https://kellimk.github.io/src/main/resources/static/images/femmisation.png", "Avex Music Creative Inc.", femm);
		Album jpoprevival = new Album("J-Pop Revival", "https://kellimk.github.io/src/main/resources/static/images/jpoprevival.png", "Avex Music Creative Inc.", femm);
		
		// add default artist's albums to repository
		albumRepo.save(thefamilyjewels);
		albumRepo.save(electraheart);
		albumRepo.save(frootalbum);
		albumRepo.save(iamthemovie);
		albumRepo.save(committhistomemory);
		albumRepo.save(evenifitkillsme);
		albumRepo.save(mydinosaurlife);
		albumRepo.save(gomcs);
		albumRepo.save(panicstations);
		albumRepo.save(femmisation);
		albumRepo.save(jpoprevival);
		
		// create default artist songs (there's a lot of them so I'm just gonna add them to the repo below their declaration)
		// The family jewels
		Song areYouSatisfied = new Song("Are You Satisfied?", 3, 21, "Atlantic Records", "songUrl", thefamilyjewels);
		songRepo.save(areYouSatisfied);
		Song shampain = new Song("Shampain", 3, 11, "Atlantic Records", "songUrl", thefamilyjewels);
		songRepo.save(shampain);
		Song notARobot = new Song("I Am Not a Robot", 3, 35, "Atlantic Records", "songUrl", thefamilyjewels);
		songRepo.save(notARobot);
		Song girls = new Song("Girls", 3, 28, "Atlantic Records", "songUrl", thefamilyjewels);
		songRepo.save(girls);
		Song mowglisRoad = new Song("Mowgli's Road", 3, 12, "Atlantic Records", "songUrl", thefamilyjewels);
		songRepo.save(mowglisRoad);
		Song obsessions = new Song("Obsessions", 3, 38, "Atlantic Records", "songUrl", thefamilyjewels);
		songRepo.save(obsessions);
		Song hollywood = new Song("Hollywood", 3, 50, "Atlantic Records", "songUrl", thefamilyjewels);
		songRepo.save(hollywood);
		Song outsider = new Song("The Outsider", 3, 17, "Atlantic Records", "songUrl", thefamilyjewels);
		songRepo.save(outsider);
		Song hermitTheFrog = new Song("Hermit the Frog", 3, 35, "Atlantic Records", "songUrl", thefamilyjewels);
		songRepo.save(hermitTheFrog);
		Song ohNo = new Song("Oh No!", 3, 02, "Atlantic Records", "songUrl", thefamilyjewels);
		songRepo.save(ohNo);
		Song rootless = new Song("Rootless", 3, 28, "Atlantic Records", "songUrl", thefamilyjewels);
		songRepo.save(rootless);
		Song numb = new Song("Numb", 4, 16, "Atlantic Records", "songUrl", thefamilyjewels);
		songRepo.save(numb);
		Song guilty = new Song("Guilty", 3, 40, "Atlantic Records", "songUrl", thefamilyjewels);
		songRepo.save(guilty);
		
		// Electra Heart
		Song bubblegumBitch = new Song("Bubblegum Bitch", 2, 34, "Atlantic Records", "songUrl", electraheart);
		songRepo.save(bubblegumBitch);
		Song primadonna = new Song("Primadonna", 3, 41, "Atlantic Records", "songUrl", electraheart);
		songRepo.save(primadonna);
		Song lies = new Song("Lies", 3, 46, "Atlantic Records", "songUrl", electraheart);
		songRepo.save(lies);
		Song homewrecker = new Song("Homewrecker", 3, 22, "Atlantic Records", "songUrl", electraheart);
		songRepo.save(homewrecker);
		Song starringRole = new Song("Starring Role", 3, 27, "Atlantic Records", "songUrl", electraheart);
		songRepo.save(starringRole);
		Song stateOfDreaming = new Song("The State of Dreaming", 3, 36, "Atlantic Records", "songUrl", electraheart);
		songRepo.save(stateOfDreaming);
		Song powerAndControl = new Song("Power and Control", 3, 46, "Atlantic Records", "songUrl", electraheart);
		songRepo.save(powerAndControl);
		Song livingDead = new Song("Living Dead", 4, 04, "Atlantic Records", "songUrl", electraheart);
		songRepo.save(livingDead);
		Song teenIdle = new Song("Teen Idle", 4, 14, "Atlantic Records", "songUrl", electraheart);
		songRepo.save(teenIdle);
		Song valleyOfTheDolls = new Song("Valley of the Dolls", 4, 13, "Atlantic Records", "songUrl", electraheart);
		songRepo.save(valleyOfTheDolls);
		Song hypocrates = new Song("Hypocrates", 4, 01, "Atlantic Records", "songUrl", electraheart);
		songRepo.save(hypocrates);
		Song fearAndLoathing = new Song("Fear and Loathing", 6, 07, "Atlantic Records", "songUrl", electraheart);
		songRepo.save(fearAndLoathing);
		
		// Froot
		Song happy = new Song("Happy", 4, 03, "Atlantic Records", "songUrl", frootalbum);
		songRepo.save(happy);
		Song froot = new Song("Froot", 5, 31, "Atlantic Records", "songUrl", frootalbum);
		songRepo.save(froot);
		Song imARuin = new Song("I'm a Ruin", 4, 32, "Atlantic Records", "songUrl", frootalbum);
		songRepo.save(imARuin);
		Song blue = new Song("Blue", 4, 14, "Atlantic Records", "songUrl", frootalbum);
		songRepo.save(blue);
		Song forget = new Song("Forget", 4, 9, "Atlantic Records", "songUrl", frootalbum);
		songRepo.save(forget);
		Song gold = new Song("Gold", 4, 14, "Atlantic Records", "songUrl", frootalbum);
		songRepo.save(gold);
		Song cantPinMeDown = new Song("Can't Pin Me Down", 3, 25, "Atlantic Records", "songUrl", frootalbum);
		songRepo.save(cantPinMeDown);
		Song solitaire = new Song("Solitaire", 4, 37, "Atlantic Records", "songUrl", frootalbum);
		songRepo.save(solitaire);
		Song betterThanThat = new Song("Better Than That", 4, 36, "Atlantic Records", "songUrl", frootalbum);
		songRepo.save(betterThanThat);
		Song weeds = new Song("Weeds", 4, 07, "Atlantic Records", "songUrl", frootalbum);
		songRepo.save(weeds);
		Song savages = new Song("Savages", 4, 16, "Atlantic Records", "songUrl", frootalbum);
		songRepo.save(savages);
		Song immortal = new Song("Immortal", 5, 21, "Atlantic Records", "songUrl", frootalbum);
		songRepo.save(immortal);
		
		// I Am the Movie
		Song cambridge = new Song("Cambridge", 2, 30, "Epitaph Records", "songUrl", iamthemovie);
		songRepo.save(cambridge);
		Song shiver = new Song("Shiver", 2, 54, "Epitaph Records", "songUrl", iamthemovie);
		songRepo.save(shiver);
		Song theFutureFreaksMeOut = new Song("The Future Freaks Me Out", 3, 36, "Epitaph Records", "songUrl", iamthemovie);
		songRepo.save(theFutureFreaksMeOut);
		Song indoorLiving = new Song("Indoor Living", 3, 47, "Epitaph Records", "songUrl", iamthemovie);
		songRepo.save(indoorLiving);
		Song myFavoriteAccident = new Song("My Favorite Accident", 3, 20, "Epitaph Records", "songUrl", iamthemovie);
		songRepo.save(myFavoriteAccident);
		Song perfectTeeth = new Song("Perfect Teeth", 3, 29, "Epitaph Records", "songUrl", iamthemovie);
		songRepo.save(perfectTeeth);
		Song boomboxGeneration = new Song("Boombox Generation", 3, 07, "Epitaph Records", "songUrl", iamthemovie);
		songRepo.save(boomboxGeneration);
		Song dontCallItAComeback = new Song("Don't Call It a Comeback", 1, 51, "Epitaph Records", "songUrl", iamthemovie);
		songRepo.save(dontCallItAComeback);
		Song modernChemistry = new Song("Modern Chemistry", 2, 22, "Epitaph Records", "songUrl", iamthemovie);
		songRepo.save(modernChemistry);
		Song capitalH = new Song("Capital H", 2, 52, "Epitaph Records", "songUrl", iamthemovie);
		songRepo.save(capitalH);
		Song redDress = new Song("Red Dress", 2, 36, "Epitaph Records", "songUrl", iamthemovie);
		songRepo.save(redDress);
		Song maryWithoutSound = new Song("Mary Without Sound", 3, 00, "Epitaph Records", "songUrl", iamthemovie);
		songRepo.save(maryWithoutSound);
		Song autographsAndApologies = new Song("Autographs and Apologies", 3, 52, "Epitaph Records", "songUrl", iamthemovie);
		songRepo.save(autographsAndApologies);
		Song aOk = new Song("A-OK", 3, 47, "Epitaph Records", "songUrl", iamthemovie);
		songRepo.save(aOk);
		Song paperCranes = new Song("1000 Paper Cranes", 2, 20, "Epitaph Records", "songUrl", iamthemovie);
		songRepo.save(paperCranes);
		
		// Commit This to Memory
		Song attractiveToday = new Song("Attractive Today", 1, 42, "Epitaph Records", "songUrl", committhistomemory);
		songRepo.save(attractiveToday);
		Song everythingIsAlright = new Song("Everything Is Alright", 3, 26, "Epitaph Records", "songUrl", committhistomemory);
		songRepo.save(everythingIsAlright);
		Song whenYoureAround = new Song("When \"You're\" Around", 2, 51, "Epitaph Records", "songUrl", committhistomemory);
		songRepo.save(whenYoureAround);
		Song resolution = new Song("Resolution", 3, 48, "Epitaph Records", "songUrl", committhistomemory);
		songRepo.save(resolution);
		Song feelLikeRain = new Song("Feel Like Rain", 3, 34, "Epitaph Records", "songUrl", committhistomemory);
		songRepo.save(feelLikeRain);
		Song makeOutKids = new Song("Make Out Kids", 3, 04, "Epitaph Records", "songUrl", committhistomemory);
		songRepo.save(makeOutKids);
		Song timeTurnedFragile = new Song("Time Turned Fragile", 4, 15, "Epitaph Records", "songUrl", committhistomemory);
		songRepo.save(timeTurnedFragile);
		Song lgfuad = new Song("L.G. FUAD", 3, 06, "Epitaph Records", "songUrl", committhistomemory);
		songRepo.save(lgfuad);
		Song betterOpenTheDoor = new Song("Better Open the Door", 3, 00, "Epitaph Records", "songUrl", committhistomemory);
		songRepo.save(betterOpenTheDoor);
		Song togetherWellRingInTheNewYear = new Song("Together We'll Ring in the New Year", 2, 13, "Epitaph Records", "songUrl", committhistomemory);
		songRepo.save(togetherWellRingInTheNewYear);
		Song hangman = new Song("Hangman", 2, 51, "Epitaph Records", "songUrl", committhistomemory);
		songRepo.save(hangman);
		Song holdMeDown = new Song("Hold Me Down", 5, 19, "Epitaph Records", "songUrl", committhistomemory);
		songRepo.save(holdMeDown);
		Song invisibleMonsters = new Song("Invisible Monsters", 3, 55, "Epitaph Records", "songUrl", committhistomemory);
		songRepo.save(invisibleMonsters);
		
		// Even If It Kills Me
		Song fellInLoveWithoutYou = new Song("Fell in Love Without You", 2, 31, "Epitaph Records", "songUrl", evenifitkillsme);
		songRepo.save(fellInLoveWithoutYou);
		Song thisIsForReal = new Song("This is for Real", 3, 10, "Epitaph Records", "songUrl", evenifitkillsme);
		songRepo.save(thisIsForReal);
		Song itHadToBeYou = new Song("It Had to Be You", 3, 48, "Epitaph Records", "songUrl", evenifitkillsme);
		songRepo.save(itHadToBeYou);
		Song lastNight = new Song("Last Night", 3, 17, "Epitaph Records", "songUrl", evenifitkillsme);
		songRepo.save(lastNight);
		Song callingAllPigs = new Song("Calling All C*ps", 3, 24, "Epitaph Records", "songUrl", evenifitkillsme);
		songRepo.save(callingAllPigs);
		Song cantFinishWhatYouStarted = new Song("Can't Finish What You Started", 3, 56, "Epitaph Records", "songUrl", evenifitkillsme);
		songRepo.save(cantFinishWhatYouStarted);
		Song theConversation = new Song("The Conversation", 2, 50, "Epitaph Records", "songUrl", evenifitkillsme);
		songRepo.save(theConversation);
		Song brokenHeart = new Song("Broken Heart", 3, 01, "Epitaph Records", "songUrl", evenifitkillsme);
		songRepo.save(brokenHeart);
		Song helloHelicopter = new Song("Hello Helicopter", 4, 23, "Epitaph Records", "songUrl", evenifitkillsme);
		songRepo.save(helloHelicopter);
		Song whereIBelong = new Song("Where I Belong", 3, 23, "Epitaph Records", "songUrl", evenifitkillsme);
		songRepo.save(whereIBelong);
		Song pointOfExtinction = new Song("Point of Extinction", 2, 39, "Epitaph Records", "songUrl", evenifitkillsme);
		songRepo.save(pointOfExtinction);
		Song antonia = new Song("Antonia", 3, 16, "Epitaph Records", "songUrl", evenifitkillsme);
		songRepo.save(antonia);
		Song evenIfItKillsMe = new Song("Even If It Kills Me", 3, 51, "Epitaph Records", "songUrl", evenifitkillsme);
		songRepo.save(evenIfItKillsMe);
		
		// My Dinosaur Life
		Song workerBee = new Song("Worker Bee", 2, 25, "Columbia Records", "songUrl", mydinosaurlife);
		songRepo.save(workerBee);
		Song aLifeLessOrdinary = new Song("A Life Less Ordinary (Need a Little Help)", 3, 23, "Columbia Records", "songUrl", mydinosaurlife);
		songRepo.save(aLifeLessOrdinary);
		Song herWordsDestroyedMyPlanet = new Song("Her Words Destroyed My Planet", 3, 38, "Columbia Records", "songUrl", mydinosaurlife);
		songRepo.save(herWordsDestroyedMyPlanet);
		Song disappear = new Song("Disappear", 3, 12, "Columbia Records", "songUrl", mydinosaurlife);
		songRepo.save(disappear);
		Song delirium = new Song("Delirium", 3, 29, "Columbia Records", "songUrl", mydinosaurlife);
		songRepo.save(delirium);
		Song historyLesson = new Song("History Lesson", 2, 35, "Columbia Records", "songUrl", mydinosaurlife);
		songRepo.save(historyLesson);
		Song standTooClose = new Song("Stand Too Close", 2, 48, "Columbia Records", "songUrl", mydinosaurlife);
		songRepo.save(standTooClose);
		Song pulpFiction = new Song("Pulp Fiction", 3, 53, "Columbia Records", "songUrl", mydinosaurlife);
		songRepo.save(pulpFiction);
		Song symbols = new Song("@!#?@!", 3, 00, "Columbia Records", "songUrl", mydinosaurlife);
		songRepo.save(symbols);
		Song hysteria = new Song("Hysteria", 3, 05, "Columbia Records", "songUrl", mydinosaurlife);
		songRepo.save(hysteria);
		Song skinAndBones = new Song("Skin and Bones", 3, 36, "Columbia Records", "songUrl", mydinosaurlife);
		songRepo.save(skinAndBones);
		Song theWeakends = new Song("The Weakends", 4, 48, "Columbia Records", "songUrl", mydinosaurlife);
		songRepo.save(theWeakends);
		Song sunnyDay = new Song("Sunny Day", 3, 10, "Columbia Records", "songUrl", mydinosaurlife);
		songRepo.save(sunnyDay);
		Song soLongFarewell = new Song("So Long Farewell", 3, 07, "Columbia Records", "songUrl", mydinosaurlife);
		songRepo.save(soLongFarewell);
		
		// Go
		Song circuitsAndWires = new Song("Circuits and Wires", 3, 07, "Epitaph Records", "songUrl", gomcs);
		songRepo.save(circuitsAndWires);
		Song trueRomance = new Song("True Romance", 3, 21, "Epitaph Records", "songUrl", gomcs);
		songRepo.save(trueRomance);
		Song sonOfAGun = new Song("Son of a Gun", 3, 20, "Epitaph Records", "songUrl", gomcs);
		songRepo.save(sonOfAGun);
		Song timelines = new Song("Timelines", 4, 04, "Epitaph Records", "songUrl", gomcs);
		songRepo.save(timelines);
		Song everyoneWillDie = new Song("Everyone Will Die", 2, 46, "Epitaph Records", "songUrl", gomcs);
		songRepo.save(everyoneWillDie);
		Song theComaKid = new Song("The Coma Kid", 3, 30, "Epitaph Records", "songUrl", gomcs);
		songRepo.save(theComaKid);
		Song boxelder = new Song("Boxelder", 3, 20, "Epitaph Records", "songUrl", gomcs);
		songRepo.save(boxelder);
		Song theWorstIsYetToCome = new Song("The Worst Is Yet to Come", 3, 56, "Epitaph Records", "songUrl", gomcs);
		songRepo.save(theWorstIsYetToCome);
		Song badIdea = new Song("Bad Idea", 3, 04, "Epitaph Records", "songUrl", gomcs);
		songRepo.save(badIdea);
		Song happyAnniversary = new Song("Happy Anniversary", 4, 17, "Epitaph Records", "songUrl", gomcs);
		songRepo.save(happyAnniversary);
		Song floatingDownTheRiver = new Song("Floating Down the River", 3, 9, "Epitaph Records", "songUrl", gomcs);
		songRepo.save(floatingDownTheRiver);
		Song bottomFeeder = new Song("Bottom Feeder", 3, 21, "Epitaph Records", "songUrl", gomcs);
		songRepo.save(bottomFeeder);
		Song giveUpGiveIn = new Song("Give Up/Give In", 3, 39, "Epitaph Records", "songUrl", gomcs);
		songRepo.save(giveUpGiveIn);
		Song alcoholEyes = new Song("Alcohol Eyes", 2, 57, "Epitaph Records", "songUrl", gomcs);
		songRepo.save(alcoholEyes);
		
		// Panic Stations
		Song anythingAtAll = new Song("Anything At All", 2, 40, "Epitaph Records", "songUrl", panicstations);
		songRepo.save(anythingAtAll);
		Song tKO = new Song("TKO", 3, 38, "Epitaph Records", "songUrl", panicstations);
		songRepo.save(tKO);
		Song iCanFeelYou = new Song("I Can Feel You", 4, 47, "Epitaph Records", "songUrl", panicstations);
		songRepo.save(iCanFeelYou);
		Song loseControl = new Song("Lose Control", 2, 31, "Epitaph Records", "songUrl", panicstations);
		songRepo.save(loseControl);
		Song heavyBoots = new Song("Heavy Boots", 3, 01, "Epitaph Records", "songUrl", panicstations);
		songRepo.save(heavyBoots);
		Song itsAPleasureToMeetYou = new Song("It's a Pleasure to Meet You", 3, 43, "Epitaph Records", "songUrl", panicstations);
		songRepo.save(itsAPleasureToMeetYou);
		Song overItNow = new Song("Over It Now", 2, 46, "Epitaph Records", "songUrl", panicstations);
		songRepo.save(overItNow);
		Song brokenArrow = new Song("Broken Arrow", 3, 11, "Epitaph Records", "songUrl", panicstations);
		songRepo.save(brokenArrow);
		Song gravity = new Song("Gravity", 2, 59, "Epitaph Records", "songUrl", panicstations);
		songRepo.save(gravity);
		Song theSamuriaCode = new Song("The Samurai Code", 3, 54, "Epitaph Records", "songUrl", panicstations);
		songRepo.save(theSamuriaCode);
		Song daysWillRunAway = new Song("Days Will Run Away", 5, 23, "Epitaph Records", "songUrl", panicstations);
		songRepo.save(daysWillRunAway);
		
		// Femm-Isation
		Song weFloodTheNight = new Song("We Flood the Night", 3, 43, "Avex Music Creative Inc.", "songUrl", femmisation);
		songRepo.save(weFloodTheNight);
		Song astroboy = new Song("Astroboy", 4, 02, "Avex Music Creative Inc.", "songUrl", femmisation);
		songRepo.save(astroboy);
		Song killTheDJ = new Song("Kill the DJ", 3, 25, "Avex Music Creative Inc.", "songUrl", femmisation);
		songRepo.save(killTheDJ);
		Song partyAllNight = new Song("Party All Night", 3, 38, "Avex Music Creative Inc.", "songUrl", femmisation);
		songRepo.save(partyAllNight);
		Song theRealThing = new Song("The Real Thing", 3, 05, "Avex Music Creative Inc.", "songUrl", femmisation);
		songRepo.save(theRealThing);
		Song deadWrong = new Song("Dead Wrong", 2, 32, "Avex Music Creative Inc.", "songUrl", femmisation);
		songRepo.save(deadWrong);
		Song unbreakable = new Song("Unbreakable", 3, 55, "Avex Music Creative Inc.", "songUrl", femmisation);
		songRepo.save(unbreakable);
		Song girlsNightOut = new Song("Girls Night Out", 3, 06, "Avex Music Creative Inc.", "songUrl", femmisation);
		songRepo.save(girlsNightOut);
		Song kissTheRain = new Song("Kiss the Rain", 3, 35, "Avex Music Creative Inc.", "songUrl", femmisation);
		songRepo.save(kissTheRain);
		Song fxxkBoyzGetMoney = new Song("Fxxk Boyz Get Money", 3, 06, "Avex Music Creative Inc.", "songUrl", femmisation);
		songRepo.save(fxxkBoyzGetMoney);
		Song whiteNoise = new Song("White Noise", 3, 9, "Avex Music Creative Inc.", "songUrl", femmisation);
		songRepo.save(whiteNoise);
		Song whiplash = new Song("Whiplash", 3, 25, "Avex Music Creative Inc.", "songUrl", femmisation);
		songRepo.save(whiplash);
		Song wannabe = new Song("Wannabe", 2, 39, "Avex Music Creative Inc.", "songUrl", femmisation);
		songRepo.save(wannabe);
		
		// J-Pop Revival
		Song myRevolution = new Song("My Revolution", 4, 38, "Avex Music Creative Inc.", "songUrl", jpoprevival);
		songRepo.save(myRevolution);
		Song candyGirl = new Song("Candy Girl", 3, 56, "Avex Music Creative Inc.", "songUrl", jpoprevival);
		songRepo.save(candyGirl);
		Song lonesomeTropicalFish = new Song("Lonesome Tropical Fish", 4, 19, "Avex Music Creative Inc.", "songUrl", jpoprevival);
		songRepo.save(lonesomeTropicalFish);
		Song anyTime = new Song("Any Time", 4, 10, "Avex Music Creative Inc.", "songUrl", jpoprevival);
		songRepo.save(anyTime);
		Song septemberLove = new Song("September Love", 4, 55, "Avex Music Creative Inc.", "songUrl", jpoprevival);
		songRepo.save(septemberLove);
		Song thereWillBeLoveThere = new Song("There Will Be Love There", 3, 59, "Avex Music Creative Inc.", "songUrl", jpoprevival);
		songRepo.save(thereWillBeLoveThere);
		Song dearFriends = new Song("Dear Friends", 4, 15, "Avex Music Creative Inc.", "songUrl", jpoprevival);
		songRepo.save(dearFriends);
		Song romanticFlight = new Song("Romantic Flight", 4, 38, "Avex Music Creative Inc.", "songUrl", jpoprevival);
		songRepo.save(romanticFlight);
		Song graduate = new Song("Graduate", 4, 42, "Avex Music Creative Inc.", "songUrl", jpoprevival);
		songRepo.save(graduate);
		Song believeInLove = new Song("Believe In Love", 4, 10, "Avex Music Creative Inc.", "songUrl", jpoprevival);
		songRepo.save(believeInLove);
		Song sevenDaysWar = new Song("Seven Days War", 4, 16, "Avex Music Creative Inc.", "songUrl", jpoprevival);
		songRepo.save(sevenDaysWar);
		Song boogieBackTonight = new Song("Boogie Back Tonight", 4, 38, "Avex Music Creative Inc.", "songUrl", jpoprevival);
		songRepo.save(boogieBackTonight);
	}
	
}
