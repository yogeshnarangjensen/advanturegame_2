package se.yogesh.model;

import se.yogesh.game.Game;
import se.yogesh.game.GameVariables;

public class Hall {
    public boolean enterRoom(Resident resident, Burglar burglar) {
        if (GameVariables.currentLocation.equals(GameVariables.CentralRoom)) {
            GameVariables.currentLocation = GameVariables.Hall;
            System.out.println("You have entered the room");

            System.out.println("You encounter a burglar! A fight breaks out.");
            //combat loop between resident and burglar
            while (resident.isConscious() && burglar.isConscious()) {
                //Resident attacks burglar and resident
                resident.punch(burglar);
                if (burglar.isConscious()) {
                    burglar.punch(resident);
                }
                System.out.println("Resident health: " + resident.getHealth() + ", burglar health: " + burglar.getHealth());

            }
            if (resident.isConscious()) {
                System.out.println("You knocked out the burglar!");
                return true;
            } else {
                System.out.println("You have been defeated by the burglar!");
                return false;
            }
        } else {
            System.out.println("You need to go back to Central Room!");


            return true;
        }


    }
}






