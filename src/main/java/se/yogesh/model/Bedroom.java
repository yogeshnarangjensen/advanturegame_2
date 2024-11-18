package se.yogesh.model;


//import se.yogesh.game.Game;

import se.yogesh.game.GameVariables;

public class Bedroom {
    public void enterRoom() {
        if (GameVariables.currentLocation.equals(GameVariables.CentralRoom)) {
            //you can enter
            System.out.println(GameVariables.Bedroom);
            System.out.println("Nothing looks like here. Go to Cental Room");

            //set currentLocation
            GameVariables.currentLocation = GameVariables.Bedroom;
        } else {
            System.out.println("You have to go to center Room");
            //you can not enter

        }
    }

}






