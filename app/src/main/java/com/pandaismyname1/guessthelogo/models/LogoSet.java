package com.pandaismyname1.guessthelogo.models;

import com.pandaismyname1.guessthelogo.R;

import java.util.ArrayList;
import java.util.Collections;

public class LogoSet {
    private ArrayList<Logo> logos;

    private PlayableSet set;

    public void InitializeSet(PlayableSet set) {
        logos = new ArrayList<>();
        if(set == PlayableSet.Cars || set == PlayableSet.All) {
            logos.add(new Logo("Acura",R.drawable.acura));
            logos.add(new Logo("Audi",R.drawable.audi));
            logos.add(new Logo("Bentley",R.drawable.bentley));
            logos.add(new Logo("BMW",R.drawable.bmw));
            logos.add(new Logo("Cadillac",R.drawable.cadillac));
            logos.add(new Logo("Chevrolet",R.drawable.chevrolet));
            logos.add(new Logo("Chrysler",R.drawable.chrysler));
            logos.add(new Logo("Dacia",R.drawable.dacia));
            logos.add(new Logo("Ferrari",R.drawable.ferrari));
            logos.add(new Logo("Fiat",R.drawable.fiat));
            logos.add(new Logo("Ford",R.drawable.ford));
            logos.add(new Logo("Honda",R.drawable.honda));
            logos.add(new Logo("Hyundai",R.drawable.hyundai));
            logos.add(new Logo("Jaguar",R.drawable.jaguar));
            logos.add(new Logo("Jeep",R.drawable.jeep));
            logos.add(new Logo("Kia",R.drawable.kia));
            logos.add(new Logo("Koenigsegg",R.drawable.koenigsegg));
            logos.add(new Logo("Lancia",R.drawable.lancia));
            logos.add(new Logo("Land Rover",R.drawable.land_rover));
            logos.add(new Logo("Lexus",R.drawable.lexus));
            logos.add(new Logo("Maserati",R.drawable.maserati));
            logos.add(new Logo("Mazda",R.drawable.mazda));
            logos.add(new Logo("Mercedes",R.drawable.mercedes));
            logos.add(new Logo("Mini Cooper",R.drawable.mini_cooper));
            logos.add(new Logo("Nissan",R.drawable.nissan));
            logos.add(new Logo("Opel",R.drawable.opel));
            logos.add(new Logo("Pontiac",R.drawable.pontiac));
            logos.add(new Logo("Porche",R.drawable.porche));
            logos.add(new Logo("Smart",R.drawable.smart));
            logos.add(new Logo("Suzuki",R.drawable.suzuki));
            logos.add(new Logo("Tesla",R.drawable.tesla));
            logos.add(new Logo("Toyota",R.drawable.toyota));
            logos.add(new Logo("Volkswagen",R.drawable.volkswagen));
            logos.add(new Logo("Volvo",R.drawable.volvo));
        }
        if (set == PlayableSet.All) {
            logos.add(new Logo("Adidas",R.drawable.adidas));
            logos.add(new Logo("Amazon",R.drawable.amazon));
            logos.add(new Logo("Android",R.drawable.android));
            logos.add(new Logo("Apple",R.drawable.apple));
            logos.add(new Logo("Atari",R.drawable.atari));
            logos.add(new Logo("BBC",R.drawable.bbc));
            logos.add(new Logo("Best Buy",R.drawable.best_buy));
            logos.add(new Logo("Block Busters",R.drawable.blockbusters));
            logos.add(new Logo("Chrome",R.drawable.chrome));
            logos.add(new Logo("Cisco",R.drawable.cisco));
            logos.add(new Logo("Coca Cola",R.drawable.coca_cola));
            logos.add(new Logo("Disney",R.drawable.disney));
            logos.add(new Logo("Dolby",R.drawable.dolby));
            logos.add(new Logo("EA Games",R.drawable.ea_games));
            logos.add(new Logo("Ebay",R.drawable.ebay));
            logos.add(new Logo("Facebook",R.drawable.facebook));
            logos.add(new Logo("Fanta",R.drawable.fanta));
            logos.add(new Logo("Firefox",R.drawable.firefox));
            logos.add(new Logo("Gilette",R.drawable.gilette));
            logos.add(new Logo("Google",R.drawable.google));
            logos.add(new Logo("Ikea",R.drawable.ikea));
            logos.add(new Logo("Lay's",R.drawable.lays));
            logos.add(new Logo("Lego",R.drawable.lego));
            logos.add(new Logo("Loreal",R.drawable.loreal));
            logos.add(new Logo("Mastercard",R.drawable.mastercard));
            logos.add(new Logo("Mc Donald's",R.drawable.mc));
            logos.add(new Logo("Michellin",R.drawable.michellin));
            logos.add(new Logo("MSN",R.drawable.msn));
            logos.add(new Logo("National Geographic",R.drawable.national_geographic));
            logos.add(new Logo("Nivea",R.drawable.nivea));
            logos.add(new Logo("Pepsi",R.drawable.pepsi));
            logos.add(new Logo("Pixar",R.drawable.pixar));
            logos.add(new Logo("Playstation",R.drawable.playstation));
            logos.add(new Logo("Pringles",R.drawable.pringles));
            logos.add(new Logo("Reebok",R.drawable.reebok));
            logos.add(new Logo("Rockstar Games",R.drawable.rockstar_games));
            logos.add(new Logo("Sega",R.drawable.sega));
            logos.add(new Logo("Shell",R.drawable.shell));
            logos.add(new Logo("Skype",R.drawable.skype));
            logos.add(new Logo("Sony",R.drawable.sony));
            logos.add(new Logo("Steam",R.drawable.steam));
            logos.add(new Logo("Toys R Us",R.drawable.toys_r_us));
            logos.add(new Logo("Twitter",R.drawable.twitter));
            logos.add(new Logo("Wallmart",R.drawable.wallmart));
        }
    }

    public void ScrambleSet() {
        Collections.shuffle(logos);
    }

    public Logo Get(int index) {
        return logos.get(index);
    }
    public int LastIndex() {
        return logos.size() - 1;
    }
}
