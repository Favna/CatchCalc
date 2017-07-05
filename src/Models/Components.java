package Models;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

public class Components {
//<editor-fold defaultstate="collapsed" desc="Variables">

//<editor-fold defaultstate="collapsed" desc="Pokemon">
    private String[] gen1 = {"Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon",
        "Charizard", "Squirtle", "Wartortle", "Blastoise", "Caterpie", "Metapod",
        "Butterfree", "Weedle", "Kakuna", "Beedrill", "Pidgey", "Pidgeotto", "Pidgeot",
        "Rattata", "Raticate", "Spearow", "Fearow", "Ekans", "Arbok", "Pikachu", "Raichu",
        "Sandshrew", "Sandslash", "Nidoran F", "Nidorina", "Nidoqueen", "Nidoran M",
        "Nidorino", "Nidoking", "Clefairy", "Clefable", "Vulpix", "Ninetales",
        "Jigglypuff", "Wigglytuff", "Zubat", "Golbat", "Oddish", "Gloom", "Vileplume", "Paras",
        "Parasect", "Venonat", "Venomoth", "Diglett", "Dugtrio", "Meowth", "Persian",
        "Psyduck", "Golduck", "Mankey", "Primeape", "Growlithe", "Arcanine", "Poliwag",
        "Poliwhirl", "Poliwrath", "Abra", "Kadabra", "Alakazam", "Machop", "Machoke",
        "Machamp", "Bellsprout", "Weepinbell", "Victreebell", "Tentacool", "Tentacruel", "Geodude",
        "Graveler", "Golem", "Ponyta", "Rapidash", "Slowpoke", "Slowbro", "Magnemite", "Magneton",
        "Farfetch'd", "Doduo", "Dodrio", "Seel", "Dewgong", "Grimer", "Muk", "Shellder",
        "Cloyster", "Gastly", "Haunter", "Gengar", "Onix", "Drowzee", "Hypno", "Krabby",
        "Kingler", "Voltorb", "Electrode", "Exeggcute", "Exeggutor", "Cubone", "Marowak",
        "Hitmonlee", "Hitmonchan", "Lickitung", "Koffing", "Weezing", "Rhyhorn", "Rhydon",
        "Chansey", "Tangela", "Kangaskhan", "Horsea", "Seadra", "Goldeen", "Seaking",
        "Staryu", "Starmie", "Mr. Mime", "Scyther", "Jynx", "Electabuzz", "Magmar",
        "Pinsir", "Tauros", "Magikarp", "Gyarados", "Lapras", "Ditto", "Eevee",
        "Vaporeon", "Jolteon", "Flareon", "Porygon", "Omanyte", "Omastar", "Kabuto",
        "Kabutops", "Aerodactyl", "Snorlax", "Articuno", "Zapdos", "Moltres",
        "Dratini", "Dragonair", "Dragonite", "Mewtwo", "Mew"};

    private String[] gen2 = {"Chikorita", "Bayleef", "Meganium", "Cyndaquil", "Quilava",
        "Typhlosion", "Totodile", "Croconaw", "Feraligatr", "Sentret", "Furret",
        "Hoothoot", "Noctowl", "Ledyba", "Ledian", "Spinarak", "Ariados", "Crobat",
        "Chinchou", "Lanturn", "Pichu", "Cleffa", "Igglybuff", "Togepi", "Togetic",
        "Natu", "Xatu", "Mareep", "Flaaffy", "Ampharos", "Bellossom", "Marill",
        "Azumarill", "Sudowoodo", "Politoed", "Hoppip", "Skiploom", "Jumpluff",
        "Aipom", "Sunkern", "Sunflora", "Yanma", "Wooper", "Quagsire", "Espeon",
        "Umbreon", "Murkrow", "Slowking", "Misdreavus", "Unown", "Wobbuffet",
        "Girafarig", "Pineco", "Forretress", "Dunsparce", "Gligar", "Steelix",
        "Snubbull", "Granbull", "Qwilfish", "Scizor", "Shuckle", "Heracross",
        "Sneasel", "Teddiursa", "Ursaring", "Slugma", "Magcargo", "Swinub",
        "Piloswine", "Corsola", "Remoraid", "Octillery", "Delibird", "Mantine",
        "Skarmory", "Houndour", "Houndoom", "Kingdra", "Phanpy", "Donphan",
        "Porygon2", "Stantler", "Smeargle", "Tyrogue", "Hitmontop", "Smoochum",
        "Elekid", "Magby", "Miltank", "Blissey", "Raikou", "Entei", "Suicune",
        "Larvitar", "Pupitar", "Tyranitar", "Lugia", "Ho-Oh", "Celebi"};

    private String[] gen3 = {"Treecko", "Grovyle", "Sceptile", "Torchic", "Combusken",
        "Blaziken", "Mudkip", "Marshtomp", "Swampert", "Poochyena", "Mightyena",
        "Zigzagoon", "Linoone", "Wurmple", "Silcoon", "Beautifly", "Cascoon",
        "Dustox", "Lotad", "Lombre", "Ludicolo", "Seedot", "Nuzleaf", "Shiftry",
        "Taillow", "Swellow", "Wingull", "Pelipper", "Ralts", "Kirlia", "Gardevoir",
        "Surskit", "Masquerain", "Shroomish", "Breloom", "Slakoth", "Vigoroth",
        "Slaking", "Nincada", "Ninjask", "Shedinja", "Whismur", "Loudred", "Exploud",
        "Makuhita", "Hariyama", "Azurill", "Nosepass", "Skitty", "Delcatty",
        "Sableye", "Mawile", "Aron", "Lairon", "Aggron", "Meditite", "Medicham",
        "Electrike", "Manectric", "Plusle", "Minun", "Volbeat", "Illumise",
        "Roselia", "Gulpin", "Swalot", "Carvanha", "Sharpedo", "Wailmer",
        "Wailord", "Numel", "Camerupt", "Torkoal", "Spoink", "Grumpig",
        "Spinda", "Trapinch", "Vibrava", "Flygon", "Cacnea", "Cacturne",
        "Swablu", "Altaria", "Zangoose", "Seviper", "Lunatone", "Solrock",
        "Barboach", "Whiscash", "Corphish", "Crawdaunt", "Baltoy", "Claydol",
        "Lileep", "Cradily", "Anorith", "Armaldo", "Feebas", "Milotic",
        "Castform", "Kecleon", "Shuppet", "Banette", "Duskull", "Dusclops",
        "Tropius", "Chimecho", "Absol", "Wynaut", "Snorunt", "Glalie",
        "Spheal", "Sealeo", "Walrein", "Clamperl", "Huntail", "Gorebyss",
        "Relicanth", "Luvdisc", "Bagon", "Shelgon", "Salamence", "Beldum",
        "Metang", "Metagross", "Regirock", "Regice", "Registeel", "Latias",
        "Latios", "Kyogre", "Groudon", "Rayquaza", "Jirachi", "Deoxys"};

    private String[] gen4 = {"Turtwig", "Grotle", "Torterra", "Chimchar", "Monferno",
        "Infernape", "Piplup", "Prinplup ", "Empoleon", "Starly", "Staravia",
        "Staraptor", "Bidoof", "Bibarel", "Kricketot", "Kricketune", "Shinx",
        "Luxio", "Luxray", "Budew", "Roserade", "Cranidos", "Rampardos", "Shieldon",
        "Bastiodon", "Burmy", "Wormadam", "Mothim", "Combee", "Vespiquen",
        "Pachirisu", "Buizel", "Floatzel", "Cherubi", "Cherrim", "Shellos",
        "Gastrodon", "Ambipom", "Drifloon", "Drifblim", "Buneary", "Lopunny",
        "Mismagius", "Honchkrow", "Glameow", "Purugly", "Chingling", "Stunky",
        "Skuntank", "Bronzor", "Bronzong", "Bonsly", "Mime Jr.", "Happiny",
        "Chatot", "Spiritomb", "Gible", "Gabite", "Garchomp", "Munchlax", "Riolu",
        "Lucario", "Hippopotas", "Hippowdon", "Skorupi", "Drapion", "Croagunk",
        "Toxicroak", "Carnivine", "Finneon", "Lumineon", "Mantyke", "Snover",
        "Abomasnow", "Weavile", "Magnezone", "Lickylicky", "Rhyperior", "Tangrowth",
        "Electivire", "Magmortar", "Togekiss", "Yanmega", "Leafeon", "Glaceon",
        "Gliscor", "Mamoswine", "Porygon-Z", "Gallade", "Probopass", "Dusknoir",
        "Froslass", "Rotom", "Uxie", "Mesprit", "Azelf", "Dialga", "Palkia", "Heatran",
        "Regigigas", "Giratina", "Cresselia", "Phione", "Manaphy", "Darkrai",
        "Shaymin", "Arceus"};

    private String[] gen5 = {"Victini", "Snivy", "Servine", "Serperior", "Tepig", "Pignite",
        "Emboar", "Oshawott", "Dewott", "Samurott", "Patrat", "Watchog", "Lillipup",
        "Herdier", "Stoutland", "Purrloin", "Liepard", "Pansage", "Simisage",
        "Pansear", "Simisear", "Panpour", "Simipour", "Munna", "Musharna", "Pidove",
        "Tranquill", "Unfezant", "Blitzle", "Zebstrika", "Roggenrola", "Boldore",
        "Gigalith", "Woobat", "Swoobat", "Drilbur", "Excadrill", "Audino", "Timburr",
        "Gurdurr", "Conkeldurr", "Tympole", "Palpitoad", "Seismitoad", "Throh",
        "Sawk", "Sewaddle", "Swadloon", "Leavanny", "Venipede", "Whirlipede",
        "Scolipede", "Cottonee", "Whimsicott", "Petilil", "Lilligant", "Basculin",
        "Sandile", "Krokorok", "Krookodile", "Darumaka", "Darmanitan", "Maractus",
        "Dwebble", "Crustle", "Scraggy", "Scrafty", "Sigilyph", "Yamask",
        "Cofagrigus", "Tirtouga", "Carracosta", "Archen", "Archeops", "Trubbish",
        "Garbodor", "Zorua", "Zoroark", "Minccino", "Cinccino", "Gothita",
        "Gothorita", "Gothitelle", "Solosis", "Duosion", "Reuniclus", "Ducklett",
        "Swanna", "Vanillite", "Vanillish", "Vanilluxe", "Deerling", "Sawsbuck",
        "Emolga", "Karrablast", "Escavalier", "Foongus", "Amoonguss", "Frillish",
        "Jellicent", "Alomomola", "Joltik", "Galvantula", "Ferroseed", "Ferrothorn",
        "Kilnk", "Klang", "Klinklang", "Tynamo", "Eelektrik", "Eelektross", "Elgyem",
        "Beheeyem", "Litwick", "Lampent", "Chandelure", "Axew", "Fraxure", "Haxorus",
        "Cubchoo", "Beartic", "Cryogonal", "Shelmet", "Accelgor", "Stunfisk",
        "Mienfoo", "Mienshao", "Druddigon", "Golett", "Golurk", "Pawniard", "Bisharp",
        "Bouffalant", "Rufflet", "Braviary", "Vullaby", "Mandibuzz", "Heatmor",
        "Durant", "Deino", "Zweilous", "Hydreigon", "Larvesta", "Volcarona",
        "Cobalion", "Terrakion", "Virizon", "Tornadus", "Thundurus", "Reshiram",
        "Zekrom", "Landorus", "Kyurem", "Keldeo", "Meloetta", "Genesect"};

    private String[] gen6 = {"Chespin", "Quilladin", "Chesnaught", "Fennekin", "Braixen",
        "Delphox", "Froakie", "Frogadier", "Greninja", "Bunnelby", "Diggersby",
        "Fletchling", "Fletchinder", "Talonflame", "Scatterbug", "Spewpa", "Vivillon",
        "Litleo", "Pyroar", "Flabébé", "Floette", "Florges", "Skiddo", "Gogoat",
        "Pancham", "Pangoro", "Furfrou", "Espurr", "Meowstic", "Honedge", "Doublade",
        "Aegislash", "Spritzee", "Aromatisse", "Swirlix", "Slurpuff", "Inkay",
        "Malamar", "Binacle", "Barbaracle", "Skrelp", "Dragalge", "Clauncher",
        "Clawitzer", "Helioptile", "Heliolisk", "Tyrunt", "Tyrantrum", "Amaura",
        "Aurorus", "Sylveon", "Hawlucha", "Dedenne", "Carbink", "Goomy", "Sliggoo",
        "Goodra", "Klefki", "Phantump", "Trevenant", "Pumpkaboo", "Gourgeist",
        "Bergmite", "Avalugg", "Noibat", "Noivern", "Xerneas", "Yveltal", "Zygarde",
        "Diancie", "Hoopa-Confined", "Volcanion", "Primal Kyogre", "Primal Groudon"};
//</editor-fold>

    private String[] diveArray = {"On land", "Surfing", "Diving", "Fishing"};
    private String[] genArray = {"Generation 1 (1-151)", "Generation 2 (152-251)",
        "Generation 3 (252-386)", "Generation 4 (387-493)", "Generation 5 (494-649)",
        "Generation 6 (650-721)"};
    private String[] quickArray = {"First turn", "Not first turn"};
    private String[] timeArray = {"Day", "Night"};
    private String[] simpleArray = {"No", "Yes"};
    private String[] statusArray = {"None", "Sleeping", "Frozen", "Paralyzed", "Poisoned", "Burned"};
    private String[] oPowerArray = {"No Capture Power", "Capture Power Lvl. 1", "Capture Power Lvl. 2", "Capture Power Lvl. 3", "Capture Power S", "Capture Power MAX"};
    private String[] emptyArray = {};
    private String[] gameArray = {"XY", "ORAS"};
    private String[] ballArray = {"Poké Ball", "Great Ball", "Ultra Ball", "Master Ball",
        "Safari Ball", "Net Ball", "Nest Ball", "Repeat Ball", "Timer Ball", "Premier Ball",
        "Luxury Ball", "Dive Ball", "Dusk Ball", "Quick Ball", "Heal Ball", "Cherish Ball"};

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Creating Combo Box Models">
    private ComboBoxModel genSelect = new DefaultComboBoxModel(genArray);
    private ComboBoxModel gen1species = new DefaultComboBoxModel(gen1);
    private ComboBoxModel gen2species = new DefaultComboBoxModel(gen2);
    private ComboBoxModel gen3species = new DefaultComboBoxModel(gen3);
    private ComboBoxModel gen4species = new DefaultComboBoxModel(gen4);
    private ComboBoxModel gen5species = new DefaultComboBoxModel(gen5);
    private ComboBoxModel gen6species = new DefaultComboBoxModel(gen6);

    private ComboBoxModel divingSelect = new DefaultComboBoxModel(diveArray);
    private ComboBoxModel quickSelect = new DefaultComboBoxModel(quickArray);
    private ComboBoxModel timeSelect = new DefaultComboBoxModel(timeArray);
    private ComboBoxModel simpleSelect = new DefaultComboBoxModel(simpleArray);
    private ComboBoxModel emptySelect = new DefaultComboBoxModel(emptyArray);
    private ComboBoxModel ballOptions = new DefaultComboBoxModel(ballArray);
    private ComboBoxModel statusOptions = new DefaultComboBoxModel(statusArray);
    private ComboBoxModel oPowerOptions = new DefaultComboBoxModel(oPowerArray);
    private ComboBoxModel gameOptions = new DefaultComboBoxModel(gameArray);
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Getters">
    public ComboBoxModel getGenSelect() {
        return genSelect;
    }

    public ComboBoxModel getGen1species() {
        return gen1species;
    }

    public ComboBoxModel getGen2species() {
        return gen2species;
    }

    public ComboBoxModel getGen3species() {
        return gen3species;
    }

    public ComboBoxModel getGen4species() {
        return gen4species;
    }

    public ComboBoxModel getGen5species() {
        return gen5species;
    }

    public ComboBoxModel getGen6species() {
        return gen6species;
    }

    public ComboBoxModel getDivingSelect() {
        return divingSelect;
    }

    public ComboBoxModel getQuickSelect() {
        return quickSelect;
    }

    public ComboBoxModel getTimerSelect() {
        return timeSelect;
    }

    public ComboBoxModel getSimpleSelect() {
        return simpleSelect;
    }

    public ComboBoxModel getEmptySelect() {
        return emptySelect;
    }

    public ComboBoxModel getBallOptions() {
        return ballOptions;
    }

    public ComboBoxModel getStatusOptions() {
        return statusOptions;
    }

    public ComboBoxModel getoPowerOptions() {
        return oPowerOptions;
    }

    public ComboBoxModel getGameOptions() {
        return gameOptions;
    }

    //</editor-fold>
}
