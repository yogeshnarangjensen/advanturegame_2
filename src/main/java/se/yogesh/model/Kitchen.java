package se.yogesh.model;

import se.yogesh.game.Game;
import se.yogesh.game.GameVariables;

public class Kitchen {
    private boolean fryingPanFound = false;

    public void enterRoom(Resident resident) {
        if (GameVariables.currentLocation.equals(GameVariables.CentralRoom)) {
            GameVariables.currentLocation = GameVariables.Kitchen;
            System.out.println("You entered the kitchen room");

            if (!fryingPanFound) {
                System.out.println("You found a frying pan! Now your attack damage increases.");
                resident.addDamage(3);
                fryingPanFound = true;
            } else {
                System.out.println("Kitchen is empty now.");
            }
        } else {
            System.out.println("You need to go back to the Central Room before entering the kitchen room.");

        }
        System.out.println("Current location: " + GameVariables.currentLocation);

}
}


