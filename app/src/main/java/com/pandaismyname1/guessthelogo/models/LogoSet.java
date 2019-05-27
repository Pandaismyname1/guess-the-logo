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
            Logos.add(new Logo("Volvo",R.drawable.adidas));
            Logos.add(new Logo("Volvo",R.drawable.amazon));
            Logos.add(new Logo("Volvo",R.drawable.android));
            Logos.add(new Logo("Volvo",R.drawable.apple));
            Logos.add(new Logo("Volvo",R.drawable.atari));
            Logos.add(new Logo("Volvo",R.drawable.bbc));
            Logos.add(new Logo("Volvo",R.drawable.best_buy));
            Logos.add(new Logo("Volvo",R.drawable.blockbusters));
            Logos.add(new Logo("Volvo",R.drawable.chrome));
            Logos.add(new Logo("Volvo",R.drawable.cisco));
            Logos.add(new Logo("Volvo",R.drawable.coca_cola));
            Logos.add(new Logo("Volvo",R.drawable.disney));
            Logos.add(new Logo("Volvo",R.drawable.dolby));
            Logos.add(new Logo("Volvo",R.drawable.ea_games));
            Logos.add(new Logo("Volvo",R.drawable.ebay));
            Logos.add(new Logo("Volvo",R.drawable.facebook));
            Logos.add(new Logo("Volvo",R.drawable.fanta));
            Logos.add(new Logo("Volvo",R.drawable.firefox));
            Logos.add(new Logo("Volvo",R.drawable.gilette));
            Logos.add(new Logo("Volvo",R.drawable.google));
            Logos.add(new Logo("Volvo",R.drawable.ikea));
            Logos.add(new Logo("Volvo",R.drawable.lays));
            Logos.add(new Logo("Volvo",R.drawable.lego));
            Logos.add(new Logo("Volvo",R.drawable.loreal));
            Logos.add(new Logo("Volvo",R.drawable.mastercard));
            Logos.add(new Logo("Volvo",R.drawable.mc));
            Logos.add(new Logo("Volvo",R.drawable.michellin));
            Logos.add(new Logo("Volvo",R.drawable.msn));
            Logos.add(new Logo("Volvo",R.drawable.national_geographic));
            Logos.add(new Logo("Volvo",R.drawable.nivea));
            Logos.add(new Logo("Volvo",R.drawable.pepsi));
            Logos.add(new Logo("Volvo",R.drawable.pixar));
            Logos.add(new Logo("Volvo",R.drawable.playstation));
            Logos.add(new Logo("Volvo",R.drawable.pringles));
            Logos.add(new Logo("Volvo",R.drawable.reebok));
            Logos.add(new Logo("Volvo",R.drawable.rockstar_games));
            Logos.add(new Logo("Volvo",R.drawable.sega));
            Logos.add(new Logo("Volvo",R.drawable.shell));
            Logos.add(new Logo("Volvo",R.drawable.skype));
            Logos.add(new Logo("Volvo",R.drawable.sony));
            Logos.add(new Logo("Volvo",R.drawable.steam));
            Logos.add(new Logo("Volvo",R.drawable.toys_r_us));
            Logos.add(new Logo("Volvo",R.drawable.twitter));
            Logos.add(new Logo("Volvo",R.drawable.wallmart));
        }
    }
}
