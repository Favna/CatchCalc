package Models;

import Controllers.Controller;

public class Pokemon {

    private double catchRate;
    private boolean waterOrBug;
    private int species;
    private int generation;
    private int game;

    public void pokeProperties() {
        waterOrBug = false;
        catchRate = 45;
        species = Controller.selectedSpecies;
        generation = Controller.selectedGeneration;
        game = Controller.selectedGame;

        //<editor-fold defaultstate="collapsed" desc="Generation 1">
        if (generation == 0) {
            switch (species) {
                case 6:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 7:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 8:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 9:
                    waterOrBug = true;
                    catchRate = 255;
                    break;
                case 10:
                    waterOrBug = true;
                    catchRate = 120;
                    break;
                case 11:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 12:
                    waterOrBug = true;
                    catchRate = 255;
                    break;
                case 13:
                    waterOrBug = true;
                    catchRate = 120;
                    break;
                case 14:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 15:
                    catchRate = 255;
                    break;
                case 16:
                    catchRate = 120;
                    break;
                case 18:
                    catchRate = 255;
                    break;
                case 19:
                    catchRate = 127;
                    break;
                case 20:
                    catchRate = 255;
                    break;
                case 21:
                    catchRate = 90;
                    break;
                case 22:
                    catchRate = 255;
                    break;
                case 23:
                    catchRate = 90;
                    break;
                case 24:
                    catchRate = 190;
                    break;
                case 25:
                    catchRate = 75;
                    break;
                case 26:
                    catchRate = 255;
                    break;
                case 27:
                    catchRate = 90;
                    break;
                case 28:
                    catchRate = 235;
                    break;
                case 29:
                    catchRate = 120;
                    break;
                case 31:
                    catchRate = 235;
                    break;
                case 32:
                    catchRate = 120;
                    break;
                case 34:
                    catchRate = 150;
                    break;
                case 35:
                    catchRate = 25;
                    break;
                case 36:
                    catchRate = 190;
                    break;
                case 37:
                    catchRate = 75;
                    break;
                case 38:
                    catchRate = 170;
                    break;
                case 39:
                    catchRate = 50;
                    break;
                case 40:
                    catchRate = 255;
                    break;
                case 41:
                    catchRate = 90;
                    break;
                case 42:
                    catchRate = 255;
                    break;
                case 43:
                    catchRate = 120;
                    break;
                case 45:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 46:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 47:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 48:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 49:
                    catchRate = 255;
                    break;
                case 50:
                    catchRate = 50;
                    break;
                case 51:
                    catchRate = 255;
                    break;
                case 52:
                    catchRate = 90;
                    break;
                case 53:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 54:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 55:
                    catchRate = 190;
                    break;
                case 56:
                    catchRate = 75;
                    break;
                case 57:
                    catchRate = 190;
                    break;
                case 58:
                    catchRate = 75;
                    break;
                case 59:
                    waterOrBug = true;
                    catchRate = 255;
                    break;
                case 60:
                    waterOrBug = true;
                    catchRate = 120;
                    break;
                case 61:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 62:
                    catchRate = 200;
                    break;
                case 63:
                    catchRate = 100;
                    break;
                case 64:
                    catchRate = 50;
                    break;
                case 65:
                    catchRate = 180;
                    break;
                case 66:
                    catchRate = 90;
                    break;
                case 68:
                    catchRate = 255;
                    break;
                case 69:
                    catchRate = 120;
                    break;
                case 71:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 72:
                    waterOrBug = true;
                    catchRate = 60;
                    break;
                case 73:
                    catchRate = 255;
                    break;
                case 74:
                    catchRate = 120;
                    break;
                case 76:
                    catchRate = 190;
                    break;
                case 77:
                    catchRate = 60;
                    break;
                case 78:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 79:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 80:
                    catchRate = 190;
                    break;
                case 81:
                    catchRate = 60;
                    break;
                case 83:
                    catchRate = 190;
                    break;
                case 85:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 86:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 87:
                    catchRate = 190;
                    break;
                case 88:
                    catchRate = 75;
                    break;
                case 89:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 90:
                    waterOrBug = true;
                    catchRate = 60;
                    break;
                case 91:
                    catchRate = 190;
                    break;
                case 92:
                    catchRate = 90;
                    break;
                case 95:
                    catchRate = 190;
                    break;
                case 96:
                    catchRate = 75;
                    break;
                case 97:
                    waterOrBug = true;
                    catchRate = 225;
                    break;
                case 98:
                    waterOrBug = true;
                    catchRate = 60;
                    break;
                case 99:
                    catchRate = 190;
                    break;
                case 100:
                    catchRate = 60;
                    break;
                case 101:
                    catchRate = 90;
                    break;
                case 103:
                    catchRate = 190;
                    break;
                case 104:
                    catchRate = 75;
                    break;
                case 108:
                    catchRate = 190;
                    break;
                case 109:
                    catchRate = 60;
                    break;
                case 110:
                    catchRate = 120;
                    break;
                case 111:
                    catchRate = 60;
                    break;
                case 112:
                    catchRate = 30;
                    break;
                case 115:
                    waterOrBug = true;
                    catchRate = 225;
                    break;
                case 116:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 117:
                    waterOrBug = true;
                    catchRate = 225;
                    break;
                case 118:
                    waterOrBug = true;
                    catchRate = 60;
                    break;
                case 119:
                    waterOrBug = true;
                    catchRate = 225;
                    break;
                case 120:
                    catchRate = 60;
                    break;
                case 122:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 126:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 128:
                    waterOrBug = true;
                    catchRate = 225;
                    break;
                case 129:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 130:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 131:
                    catchRate = 35;
                    break;
                case 137:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 138:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 139:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 140:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 142:
                    catchRate = 25;
                    break;
                case 143:
                    catchRate = 3;
                    break;
                case 144:
                    catchRate = 3;
                    break;
                case 145:
                    catchRate = 3;
                    break;
                case 149:
                    catchRate = 3;
                    break;
                default:
                    waterOrBug = false;
                    catchRate = 45;
                    break;
            }
        } //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Generation 2">
        else if (generation == 1) { //Generation 2
            switch (species) {
                case 6:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 7:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 8:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 9:
                    catchRate = 255;
                    break;
                case 10:
                    catchRate = 90;
                    break;
                case 11:
                    catchRate = 255;
                    break;
                case 12:
                    catchRate = 90;
                    break;
                case 13:
                    waterOrBug = true;
                    catchRate = 255;
                    break;
                case 14:
                    waterOrBug = true;
                    catchRate = 90;
                    break;
                case 15:
                    waterOrBug = true;
                    catchRate = 255;
                    break;
                case 16:
                    waterOrBug = true;
                    catchRate = 90;
                    break;
                case 17:
                    catchRate = 90;
                    break;
                case 18:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 19:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 20:
                    catchRate = 190;
                    break;
                case 21:
                    catchRate = 150;
                    break;
                case 22:
                    catchRate = 170;
                    break;
                case 23:
                    catchRate = 190;
                    break;
                case 24:
                    catchRate = 75;
                    break;
                case 25:
                    catchRate = 190;
                    break;
                case 26:
                    catchRate = 75;
                    break;
                case 27:
                    catchRate = 235;
                    break;
                case 28:
                    catchRate = 120;
                    break;
                case 31:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 32:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 33:
                    catchRate = 65;
                    break;
                case 34:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 35:
                    catchRate = 255;
                    break;
                case 36:
                    catchRate = 120;
                    break;
                case 39:
                    catchRate = 235;
                    break;
                case 40:
                    catchRate = 120;
                    break;
                case 41:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 42:
                    waterOrBug = true;
                    catchRate = 255;
                    break;
                case 43:
                    waterOrBug = true;
                    catchRate = 90;
                    break;
                case 46:
                    catchRate = 30;
                    break;
                case 47:
                    waterOrBug = true;
                    catchRate = 70;
                    break;
                case 49:
                    catchRate = 255;
                case 51:
                    catchRate = 60;
                    break;
                case 52:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 53:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 54:
                    catchRate = 190;
                    break;
                case 55:
                    catchRate = 60;
                    break;
                case 56:
                    catchRate = 25;
                    break;
                case 57:
                    catchRate = 190;
                    break;
                case 58:
                    catchRate = 75;
                    break;
                case 59:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 60:
                    waterOrBug = true;
                    catchRate = 25;
                    break;
                case 61:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 62:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 63:
                    catchRate = 60;
                    break;
                case 64:
                    catchRate = 120;
                    break;
                case 65:
                    catchRate = 60;
                    break;
                case 66:
                    catchRate = 190;
                    break;
                case 67:
                    catchRate = 75;
                    break;
                case 68:
                    catchRate = 225;
                    break;
                case 69:
                    catchRate = 75;
                    break;
                case 70:
                    waterOrBug = true;
                    catchRate = 60;
                    break;
                case 71:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 72:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 74:
                    waterOrBug = true;
                    catchRate = 25;
                    break;
                case 75:
                    catchRate = 25;
                    break;
                case 76:
                    catchRate = 120;
                    break;
                case 78:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 79:
                    catchRate = 120;
                    break;
                case 80:
                    catchRate = 60;
                    break;
                case 84:
                    catchRate = 75;
                    break;
                case 90:
                    catchRate = 30;
                    break;
                case 91:
                    catchRate = 3;
                    break;
                case 92:
                    catchRate = 3;
                    break;
                case 93:
                    waterOrBug = true;
                    catchRate = 3;
                    break;
                case 97:
                    catchRate = 3;
                    break;
                case 98:
                    catchRate = 3;
                    break;
                default:
                    waterOrBug = false;
                    catchRate = 45;
                    break;
            }
        } //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Generation 3">
        else if (generation == 2) { //Generation 3
            switch (species) {
                case 6:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 7:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 8:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 9:
                    catchRate = 255;
                    break;
                case 10:
                    catchRate = 127;
                    break;
                case 11:
                    catchRate = 255;
                    break;
                case 12:
                    catchRate = 90;
                    break;
                case 13:
                    waterOrBug = true;
                    catchRate = 255;
                    break;
                case 14:
                    waterOrBug = true;
                    catchRate = 120;
                    break;
                case 15:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 16:
                    waterOrBug = true;
                    catchRate = 120;
                    break;
                case 17:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 18:
                    waterOrBug = true;
                    catchRate = 255;
                    break;
                case 19:
                    waterOrBug = true;
                    catchRate = 120;
                    break;
                case 20:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 21:
                    catchRate = 255;
                    break;
                case 22:
                    catchRate = 120;
                    break;
                case 24:
                    catchRate = 200;
                    break;
                case 26:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 27:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 28:
                    catchRate = 235;
                    break;
                case 29:
                    catchRate = 120;
                    break;
                case 31:
                    waterOrBug = true;
                    catchRate = 200;
                    break;
                case 32:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 33:
                    catchRate = 255;
                    break;
                case 34:
                    catchRate = 90;
                    break;
                case 35:
                    catchRate = 255;
                    break;
                case 36:
                    catchRate = 120;
                    break;
                case 38:
                    waterOrBug = true;
                    catchRate = 255;
                    break;
                case 39:
                    waterOrBug = true;
                    catchRate = 120;
                    break;
                case 40:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 41:
                    catchRate = 190;
                    break;
                case 42:
                    catchRate = 120;
                    break;
                case 44:
                    catchRate = 180;
                    break;
                case 45:
                    catchRate = 200;
                    break;
                case 46:
                    catchRate = 150;
                    break;
                case 47:
                    catchRate = 255;
                    break;
                case 48:
                    catchRate = 255;
                    break;
                case 49:
                    catchRate = 60;
                    break;
                case 52:
                    catchRate = 180;
                    break;
                case 53:
                    catchRate = 90;
                    break;
                case 55:
                    catchRate = 180;
                    break;
                case 56:
                    catchRate = 90;
                    break;
                case 57:
                    catchRate = 120;
                    break;
                case 59:
                    catchRate = 200;
                    break;
                case 60:
                    catchRate = 200;
                    break;
                case 61:
                    waterOrBug = true;
                    catchRate = 150;
                    break;
                case 62:
                    waterOrBug = true;
                    catchRate = 150;
                    break;
                case 63:
                    catchRate = 150;
                    break;
                case 64:
                    catchRate = 225;
                    break;
                case 65:
                    catchRate = 75;
                    break;
                case 66:
                    waterOrBug = true;
                    catchRate = 225;
                    break;
                case 67:
                    waterOrBug = true;
                    catchRate = 60;
                    break;
                case 68:
                    waterOrBug = true;
                    catchRate = 125;
                    break;
                case 69:
                    waterOrBug = true;
                    catchRate = 60;
                    break;
                case 70:
                    catchRate = 255;
                    break;
                case 71:
                    catchRate = 150;
                    break;
                case 72:
                    catchRate = 90;
                    break;
                case 73:
                    catchRate = 255;
                    break;
                case 74:
                    catchRate = 60;
                    break;
                case 75:
                    catchRate = 255;
                    break;
                case 76:
                    catchRate = 255;
                    break;
                case 77:
                    catchRate = 120;
                    break;
                case 79:
                    catchRate = 190;
                    break;
                case 80:
                    catchRate = 60;
                    break;
                case 81:
                    catchRate = 255;
                    break;
                case 83:
                    catchRate = 90;
                    break;
                case 84:
                    catchRate = 90;
                    break;
                case 87:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 88:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 89:
                    waterOrBug = true;
                    catchRate = 205;
                    break;
                case 90:
                    waterOrBug = true;
                    catchRate = 155;
                    break;
                case 91:
                    catchRate = 255;
                    break;
                case 92:
                    catchRate = 90;
                    break;
                case 95:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 96:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 97:
                    waterOrBug = true;
                    catchRate = 255;
                    break;
                case 98:
                    waterOrBug = true;
                    catchRate = 60;
                    break;
                case 100:
                    catchRate = 200;
                    break;
                case 101:
                    catchRate = 225;
                    break;
                case 103:
                    catchRate = 190;
                    break;
                case 104:
                    catchRate = 90;
                    break;
                case 105:
                    catchRate = 200;
                    break;
                case 107:
                    catchRate = 30;
                    break;
                case 108:
                    catchRate = 125;
                    break;
                case 109:
                    catchRate = 190;
                    break;
                case 110:
                    catchRate = 75;
                    break;
                case 111:
                    waterOrBug = true;
                    catchRate = 255;
                    break;
                case 112:
                    waterOrBug = true;
                    catchRate = 120;
                    break;
                case 113:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 114:
                    waterOrBug = true;
                    catchRate = 255;
                    break;
                case 115:
                    waterOrBug = true;
                    catchRate = 60;
                    break;
                case 116:
                    waterOrBug = true;
                    catchRate = 60;
                    break;
                case 117:
                    waterOrBug = true;
                    catchRate = 25;
                    break;
                case 118:
                    waterOrBug = true;
                    catchRate = 225;
                    break;
                case 122:
                    catchRate = 3;
                    break;
                case 123:
                    catchRate = 3;
                    break;
                case 124:
                    catchRate = 3;
                    break;
                case 125:
                    catchRate = 3;
                    break;
                case 126:
                    catchRate = 3;
                    break;
                case 127:
                    catchRate = 3;
                    break;
                case 128:
                    catchRate = 3;
                    break;
                case 129:
                    catchRate = 3;
                    break;
                case 130:
                    waterOrBug = true;
                    if (game == 0) {
                        catchRate = 5;
                    } else {
                        catchRate = 3;
                    }
                    break;
                case 131:
                    if (game == 0) {
                        catchRate = 5;
                    } else {
                        catchRate = 3;
                    }
                    break;
                case 132:
                    if (game == 0) {
                        catchRate = 3;
                    } else {
                        catchRate = 45;
                    }
                    break;
                case 133:
                    catchRate = 3;
                    break;
                case 134:
                    catchRate = 3;
                    break;
                default:
                    waterOrBug = false;
                    catchRate = 45;
                    break;
            }
        } //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Generation 4">
        else if (generation == 3) { //Generation 4
            switch (species) {
                case 0:
                    catchRate = 45;
                    break;
                case 1:
                    catchRate = 45;
                    break;
                case 2:
                    catchRate = 45;
                    break;
                case 3:
                    catchRate = 45;
                    break;
                case 4:
                    catchRate = 45;
                    break;
                case 5:
                    catchRate = 45;
                    break;
                case 6:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 7:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 8:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 9:
                    catchRate = 255;
                    break;
                case 10:
                    catchRate = 120;
                    break;
                case 11:
                    catchRate = 45;
                    break;
                case 12:
                    catchRate = 255;
                    break;
                case 13:
                    waterOrBug = true;
                    catchRate = 127;
                    break;
                case 14:
                    waterOrBug = true;
                    catchRate = 255;
                    break;
                case 15:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 16:
                    catchRate = 235;
                    break;
                case 17:
                    catchRate = 120;
                    break;
                case 18:
                    catchRate = 45;
                    break;
                case 19:
                    catchRate = 255;
                    break;
                case 20:
                    catchRate = 75;
                    break;
                case 21:
                    catchRate = 45;
                    break;
                case 22:
                    catchRate = 45;
                    break;
                case 23:
                    catchRate = 45;
                    break;
                case 24:
                    catchRate = 45;
                    break;
                case 25:
                    waterOrBug = true;
                    catchRate = 120;
                    break;
                case 26:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 27:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 28:
                    waterOrBug = true;
                    catchRate = 120;
                    break;
                case 29:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 30:
                    catchRate = 200;
                    break;
                case 31:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 32:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 33:
                    catchRate = 190;
                    break;
                case 34:
                    catchRate = 75;
                    break;
                case 35:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 36:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 37:
                    catchRate = 45;
                    break;
                case 38:
                    catchRate = 125;
                    break;
                case 39:
                    catchRate = 60;
                    break;
                case 40:
                    catchRate = 190;
                    break;
                case 41:
                    catchRate = 60;
                    break;
                case 42:
                    catchRate = 45;
                    break;
                case 43:
                    catchRate = 30;
                    break;
                case 44:
                    catchRate = 190;
                    break;
                case 45:
                    catchRate = 75;
                    break;
                case 46:
                    catchRate = 120;
                    break;
                case 47:
                    catchRate = 225;
                    break;
                case 48:
                    catchRate = 60;
                    break;
                case 49:
                    catchRate = 255;
                    break;
                case 50:
                    catchRate = 90;
                    break;
                case 51:
                    catchRate = 255;
                    break;
                case 52:
                    catchRate = 145;
                    break;
                case 53:
                    catchRate = 130;
                    break;
                case 54:
                    catchRate = 30;
                    break;
                case 55:
                    catchRate = 100;
                    break;
                case 56:
                    catchRate = 45;
                    break;
                case 57:
                    catchRate = 45;
                    break;
                case 58:
                    catchRate = 45;
                    break;
                case 59:
                    catchRate = 50;
                    break;
                case 60:
                    catchRate = 75;
                    break;
                case 61:
                    catchRate = 45;
                    break;
                case 62:
                    catchRate = 140;
                    break;
                case 63:
                    catchRate = 60;
                    break;
                case 64:
                    waterOrBug = true;
                    catchRate = 120;
                    break;
                case 65:
                    catchRate = 45;
                    break;
                case 66:
                    catchRate = 140;
                    break;
                case 67:
                    catchRate = 75;
                    break;
                case 68:
                    catchRate = 200;
                    break;
                case 69:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 70:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 71:
                    waterOrBug = true;
                    catchRate = 25;
                    break;
                case 72:
                    catchRate = 120;
                    break;
                case 73:
                    catchRate = 45;
                    break;
                case 74:
                    catchRate = 30;
                    break;
                case 75:
                    catchRate = 30;
                    break;
                case 76:
                    catchRate = 30;
                    break;
                case 77:
                    catchRate = 30;
                    break;
                case 78:
                    catchRate = 30;
                    break;
                case 79:
                    catchRate = 30;
                    break;
                case 80:
                    catchRate = 30;
                    break;
                case 81:
                    catchRate = 30;
                    break;
                case 82:
                    catchRate = 30;
                    break;
                case 83:
                    catchRate = 45;
                    break;
                case 84:
                    catchRate = 45;
                    break;
                case 85:
                    catchRate = 30;
                    break;
                case 86:
                    catchRate = 50;
                    break;
                case 87:
                    catchRate = 30;
                    break;
                case 88:
                    catchRate = 45;
                    break;
                case 89:
                    catchRate = 60;
                    break;
                case 90:
                    catchRate = 45;
                    break;
                case 91:
                    catchRate = 75;
                    break;
                case 92:
                    catchRate = 45;
                    break;
                case 93:
                    catchRate = 3;
                    break;
                case 94:
                    catchRate = 3;
                    break;
                case 95:
                    catchRate = 3;
                    break;
                case 96:
                    if (game == 0) {
                        catchRate = 30;
                    } else {
                        catchRate = 3;
                    }
                    break;
                case 97:
                    waterOrBug = true;
                    if (game == 0) {
                        catchRate = 30;
                    } else {
                        catchRate = 3;
                    }
                    break;
                case 98:
                    catchRate = 3;
                    break;
                case 99:
                    catchRate = 3;
                    break;
                case 100:
                    catchRate = 3;
                    break;
                case 101:
                    catchRate = 3;
                    break;
                case 102:
                    waterOrBug = true;
                    catchRate = 30;
                    break;
                case 103:
                    waterOrBug = true;
                    catchRate = 3;
                    break;
                case 104:
                    catchRate = 3;
                    break;
                case 105:
                    catchRate = 45;
                    break;
                case 106:
                    catchRate = 3;
                    break;
                default:
                    waterOrBug = false;
                    catchRate = 45;
                    break;
            }

        }//</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Generation 5">
        else if (generation == 4) { //Generation 5
            switch (species) {
                case 0:
                    catchRate = 3;
                    break;
                case 7:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 8:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 9:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 10:
                    catchRate = 255;
                    break;
                case 11:
                    catchRate = 255;
                    break;
                case 12:
                    catchRate = 255;
                    break;
                case 13:
                    catchRate = 120;
                    break;
                case 15:
                    catchRate = 255;
                    break;
                case 16:
                    catchRate = 90;
                    break;
                case 17:
                    catchRate = 190;
                    break;
                case 18:
                    catchRate = 75;
                    break;
                case 19:
                    catchRate = 190;
                    break;
                case 20:
                    catchRate = 75;
                    break;
                case 21:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 22:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 23:
                    catchRate = 190;
                    break;
                case 24:
                    catchRate = 75;
                    break;
                case 25:
                    catchRate = 255;
                    break;
                case 26:
                    catchRate = 120;
                    break;
                case 28:
                    catchRate = 190;
                    break;
                case 29:
                    catchRate = 75;
                    break;
                case 30:
                    catchRate = 255;
                    break;
                case 31:
                    catchRate = 120;
                    break;
                case 33:
                    catchRate = 190;
                    break;
                case 35:
                    catchRate = 120;
                    break;
                case 36:
                    catchRate = 60;
                    break;
                case 37:
                    catchRate = 255;
                    break;
                case 38:
                    catchRate = 180;
                    break;
                case 39:
                    catchRate = 90;
                    break;
                case 41:
                    waterOrBug = true;
                    catchRate = 255;
                    break;
                case 42:
                    waterOrBug = true;
                    catchRate = 120;
                    break;
                case 43:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 46:
                    waterOrBug = true;
                    catchRate = 255;
                    break;
                case 47:
                    waterOrBug = true;
                    catchRate = 120;
                    break;
                case 48:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 49:
                    waterOrBug = true;
                    catchRate = 255;
                    break;
                case 50:
                    waterOrBug = true;
                    catchRate = 120;
                    break;
                case 51:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 52:
                    catchRate = 190;
                    break;
                case 53:
                    catchRate = 75;
                    break;
                case 54:
                    catchRate = 190;
                    break;
                case 55:
                    catchRate = 75;
                    break;
                case 56:
                    waterOrBug = true;
                    catchRate = 25;
                    break;
                case 57:
                    catchRate = 180;
                    break;
                case 58:
                    catchRate = 90;
                    break;
                case 60:
                    catchRate = 120;
                    break;
                case 61:
                    catchRate = 60;
                    break;
                case 62:
                    catchRate = 255;
                    break;
                case 63:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 64:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 65:
                    catchRate = 180;
                    break;
                case 66:
                    catchRate = 90;
                    break;
                case 68:
                    catchRate = 190;
                    break;
                case 69:
                    catchRate = 90;
                    break;
                case 70:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 71:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 74:
                    catchRate = 190;
                    break;
                case 75:
                    catchRate = 60;
                    break;
                case 76:
                    catchRate = 75;
                    break;
                case 78:
                    catchRate = 255;
                    break;
                case 79:
                    catchRate = 60;
                    break;
                case 80:
                    catchRate = 200;
                    break;
                case 81:
                    catchRate = 100;
                    break;
                case 82:
                    catchRate = 50;
                    break;
                case 83:
                    catchRate = 200;
                    break;
                case 84:
                    catchRate = 100;
                    break;
                case 85:
                    catchRate = 50;
                    break;
                case 86:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 88:
                    waterOrBug = true;
                    catchRate = 255;
                    break;
                case 89:
                    catchRate = 120;
                    break;
                case 91:
                    catchRate = 190;
                    break;
                case 92:
                    catchRate = 75;
                    break;
                case 93:
                    catchRate = 200;
                    break;
                case 94:
                    waterOrBug = true;
                    catchRate = 200;
                    break;
                case 95:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 96:
                    catchRate = 190;
                    break;
                case 97:
                    catchRate = 75;
                    break;
                case 98:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 99:
                    waterOrBug = true;
                    catchRate = 60;
                    break;
                case 100:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 101:
                    waterOrBug = true;
                    catchRate = 190;
                    break;
                case 102:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 103:
                    catchRate = 255;
                    break;
                case 104:
                    catchRate = 90;
                    break;
                case 105:
                    catchRate = 130;
                    break;
                case 106:
                    catchRate = 60;
                    break;
                case 107:
                    catchRate = 30;
                    break;
                case 108:
                    catchRate = 190;
                    break;
                case 109:
                    catchRate = 60;
                    break;
                case 110:
                    catchRate = 30;
                    break;
                case 111:
                    catchRate = 255;
                    break;
                case 112:
                    catchRate = 90;
                    break;
                case 113:
                    catchRate = 190;
                    break;
                case 114:
                    catchRate = 90;
                    break;
                case 116:
                    catchRate = 75;
                    break;
                case 117:
                    catchRate = 60;
                    break;
                case 119:
                    catchRate = 120;
                    break;
                case 120:
                    catchRate = 60;
                    break;
                case 121:
                    catchRate = 25;
                    break;
                case 122:
                    waterOrBug = true;
                    catchRate = 200;
                    break;
                case 123:
                    waterOrBug = true;
                    catchRate = 75;
                    break;
                case 124:
                    catchRate = 75;
                    break;
                case 125:
                    catchRate = 180;
                    break;
                case 128:
                    catchRate = 190;
                    break;
                case 129:
                    catchRate = 90;
                    break;
                case 130:
                    catchRate = 120;
                    break;
                case 133:
                    catchRate = 190;
                    break;
                case 134:
                    catchRate = 60;
                    break;
                case 135:
                    catchRate = 190;
                    break;
                case 136:
                    catchRate = 60;
                    break;
                case 137:
                    catchRate = 90;
                    break;
                case 138:
                    waterOrBug = true;
                    catchRate = 90;
                    break;
                case 142:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 143:
                    waterOrBug = true;
                    catchRate = 15;
                    break;
                case 144:
                    catchRate = 3;
                    break;
                case 145:
                    catchRate = 3;
                    break;
                case 146:
                    catchRate = 3;
                    break;
                case 147:
                    catchRate = 3;
                    break;
                case 148:
                    catchRate = 3;
                    break;
                case 149:
                    if (game == 0) {
                        catchRate = 45;
                    } else {
                        catchRate = 3;
                    }
                    break;
                case 150:
                    if (game == 0) {
                        catchRate = 45;
                    } else {
                        catchRate = 3;
                    }
                    break;
                case 151:
                    catchRate = 3;
                    break;
                case 152:
                    catchRate = 3;
                    break;
                case 153:
                    waterOrBug = true;
                    catchRate = 3;
                    break;
                case 154:
                    catchRate = 3;
                    break;
                case 155:
                    waterOrBug = true;
                    catchRate = 3;
                    break;

                default:
                    waterOrBug = false;
                    catchRate = 45;
                    break;
            }
        }//</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Generation 6">
        else if (generation == 5) { //Generation 6
            switch (species) {
                case 6:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 7:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 8:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 9:
                    catchRate = 255;
                    break;
                case 10:
                    catchRate = 127;
                    break;
                case 11:
                    catchRate = 255;
                    break;
                case 12:
                    catchRate = 120;
                    break;
                case 14:
                    waterOrBug = true;
                    catchRate = 255;
                    break;
                case 15:
                    waterOrBug = true;
                    catchRate = 120;
                    break;
                case 16:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 17:
                    catchRate = 220;
                    break;
                case 18:
                    catchRate = 65;
                    break;
                case 19:
                    catchRate = 225;
                    break;
                case 20:
                    catchRate = 120;
                    break;
                case 22:
                    catchRate = 200;
                    break;
                case 24:
                    catchRate = 220;
                    break;
                case 25:
                    catchRate = 65;
                    break;
                case 26:
                    catchRate = 160;
                    break;
                case 27:
                    catchRate = 190;
                    break;
                case 28:
                    catchRate = 75;
                    break;
                case 29:
                    catchRate = 180;
                    break;
                case 30:
                    catchRate = 90;
                    break;
                case 32:
                    catchRate = 200;
                    break;
                case 33:
                    catchRate = 140;
                    break;
                case 34:
                    catchRate = 200;
                    break;
                case 35:
                    catchRate = 140;
                    break;
                case 36:
                    catchRate = 190;
                    break;
                case 37:
                    catchRate = 80;
                    break;
                case 38:
                    waterOrBug = true;
                    catchRate = 120;
                    break;
                case 39:
                    waterOrBug = true;
                    catchRate = 45;
                    break;
                case 40:
                    waterOrBug = true;
                    catchRate = 225;
                    break;
                case 41:
                    catchRate = 55;
                    break;
                case 42:
                    waterOrBug = true;
                    catchRate = 225;
                    break;
                case 43:
                    waterOrBug = true;
                    catchRate = 55;
                    break;
                case 44:
                    catchRate = 190;
                    break;
                case 45:
                    catchRate = 75;
                    break;
                case 51:
                    catchRate = 100;
                    break;
                case 52:
                    catchRate = 180;
                    break;
                case 53:
                    catchRate = 60;
                    break;
                case 57:
                    catchRate = 75;
                    break;
                case 58:
                    catchRate = 120;
                    break;
                case 59:
                    catchRate = 60;
                    break;
                case 60:
                    catchRate = 120;
                    break;
                case 61:
                    catchRate = 60;
                    break;
                case 62:
                    catchRate = 190;
                    break;
                case 63:
                    catchRate = 55;
                    break;
                case 64:
                    catchRate = 190;
                    break;
                case 68:
                    catchRate = 3;
                    break;
                case 69:
                    catchRate = 3;
                    break;
                case 70:
                    catchRate = 3;
                    break;
                case 71:
                    waterOrBug = true;
                    catchRate = 3;
                    break;
                case 72:
                    waterOrBug = true;
                    catchRate = 3;
                    break;
                case 73:
                    catchRate = 3;
                    break;
                default:
                    waterOrBug = false;
                    catchRate = 45;
                    break;
            }
        } //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Default">
        else {
            waterOrBug = false;
            catchRate = 45;
        }
//</editor-fold>
    }

    public double getCatchRate() {
        return catchRate;
    }

    public void setCatchRate(double catchRate) {
        this.catchRate = catchRate;
    }

    public boolean isWaterOrBug() {
        return waterOrBug;
    }

    public void setWaterOrBug(boolean waterOrBug) {
        this.waterOrBug = waterOrBug;
    }

}
