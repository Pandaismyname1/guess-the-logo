package com.pandaismyname1.guessthelogo.models;

import com.pandaismyname1.guessthelogo.R;

import java.util.ArrayList;

public class LogoSet {
    public ArrayList<Logo> Logos;

    public PlayableSet Set;

    public void InitializeSet(PlayableSet set) {
        Logos = new ArrayList<>();
        if(set == PlayableSet.Cars || set == PlayableSet.All) {
            Logos.add(new Logo("Acura",R.drawable.acura));
            Logos.add(new Logo("Audi",R.drawable.audi));
            Logos.add(new Logo("Bentley",R.drawable.bentley));
            Logos.add(new Logo("BMW",R.drawable.bmw));
            Logos.add(new Logo("Cadillac",R.drawable.cadillac));
            Logos.add(new Logo("Chevrolet",R.drawable.chevrolet));
            Logos.add(new Logo("Chrysler",R.drawable.chrysler));
            Logos.add(new Logo("Dacia",R.drawable.dacia));
            Logos.add(new Logo("Ferrari",R.drawable.ferrari));
            Logos.add(new Logo("Fiat",R.drawable.fiat));
            Logos.add(new Logo("Ford",R.drawable.ford));
            Logos.add(new Logo("Honda",R.drawable.honda));
            Logos.add(new Logo("Hyundai",R.drawable.hyundai));
            Logos.add(new Logo("Jaguar",R.drawable.jaguar));
            Logos.add(new Logo("Jeep",R.drawable.jeep));
            Logos.add(new Logo("Kia",R.drawable.kia));
            Logos.add(new Logo("Koenigsegg",R.drawable.koenigsegg));
            Logos.add(new Logo("Lancia",R.drawable.lancia));
            Logos.add(new Logo("Land Rover",R.drawable.land_rover));
            Logos.add(new Logo("Lexus",R.drawable.lexus));
            Logos.add(new Logo("Maserati",R.drawable.maserati));
            Logos.add(new Logo("Mazda",R.drawable.mazda));
            Logos.add(new Logo("Mercedes",R.drawable.mercedes));
            Logos.add(new Logo("Mini Cooper",R.drawable.mini_cooper));
            Logos.add(new Logo("Nissan",R.drawable.nissan));
            Logos.add(new Logo("Opel",R.drawable.opel));
            Logos.add(new Logo("Pontiac",R.drawable.pontiac));
            Logos.add(new Logo("Porche",R.drawable.porche));
            Logos.add(new Logo("Smart",R.drawable.smart));
            Logos.add(new Logo("Suzuki",R.drawable.suzuki));
            Logos.add(new Logo("Tesla",R.drawable.tesla));
            Logos.add(new Logo("Toyota",R.drawable.toyota));
            Logos.add(new Logo("Volkswagen",R.drawable.volkswagen));
            Logos.add(new Logo("Volvo",R.drawable.volvo));
        }
        if (set == PlayableSet.All) {
            Logos.add(new Logo("Adidas",R.drawable.adidas));
            Logos.add(new Logo("Amazon",R.drawable.amazon));
            Logos.add(new Logo("Android",R.drawable.android));
            Logos.add(new Logo("Apple",R.drawable.apple));
            Logos.add(new Logo("Atari",R.drawable.atari));
            Logos.add(new Logo("BBC",R.drawable.bbc));
            Logos.add(new Logo("Best Buy",R.drawable.best_buy));
            Logos.add(new Logo("Block Busters",R.drawable.blockbusters));
            Logos.add(new Logo("Chrome",R.drawable.chrome));
            Logos.add(new Logo("Cisco",R.drawable.cisco));
            Logos.add(new Logo("Coca Cola",R.drawable.coca_cola));
            Logos.add(new Logo("Disney",R.drawable.disney));
            Logos.add(new Logo("Dolby",R.drawable.dolby));
            Logos.add(new Logo("EA Games",R.drawable.ea_games));
            Logos.add(new Logo("Ebay",R.drawable.ebay));
            Logos.add(new Logo("Facebook",R.drawable.facebook));
            Logos.add(new Logo("Fanta",R.drawable.fanta));
            Logos.add(new Logo("Firefox",R.drawable.firefox));
            Logos.add(new Logo("Gilette",R.drawable.gilette));
            Logos.add(new Logo("Google",R.drawable.google));
            Logos.add(new Logo("Ikea",R.drawable.ikea));
            Logos.add(new Logo("Lay's",R.drawable.lays));
            Logos.add(new Logo("Lego",R.drawable.lego));
            Logos.add(new Logo("Loreal",R.drawable.loreal));
            Logos.add(new Logo("Mastercard",R.drawable.mastercard));
            Logos.add(new Logo("Mc Donald's",R.drawable.mc));
            Logos.add(new Logo("Michellin",R.drawable.michellin));
            Logos.add(new Logo("MSN",R.drawable.msn));
            Logos.add(new Logo("National Geographic",R.drawable.national_geographic));
            Logos.add(new Logo("Nivea",R.drawable.nivea));
            Logos.add(new Logo("Pepsi",R.drawable.pepsi));
            Logos.add(new Logo("Pixar",R.drawable.pixar));
            Logos.add(new Logo("Playstation",R.drawable.playstation));
            Logos.add(new Logo("Pringles",R.drawable.pringles));
            Logos.add(new Logo("Reebok",R.drawable.reebok));
            Logos.add(new Logo("Rockstar Games",R.drawable.rockstar_games));
            Logos.add(new Logo("Sega",R.drawable.sega));
            Logos.add(new Logo("Shell",R.drawable.shell));
            Logos.add(new Logo("Skype",R.drawable.skype));
            Logos.add(new Logo("Sony",R.drawable.sony));
            Logos.add(new Logo("Steam",R.drawable.steam));
            Logos.add(new Logo("Toys R Us",R.drawable.toys_r_us));
            Logos.add(new Logo("Twitter",R.drawable.twitter));
            Logos.add(new Logo("Wallmart",R.drawable.wallmart));
        }
    }
}
