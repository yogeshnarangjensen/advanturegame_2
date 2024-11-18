package se.yogesh.model;

import se.yogesh.game.GameVariables;

public class CentralRoom  {
    public void enterRoom(){

//Check if the player is already in the Central Room
if (GameVariables.currentLocation.equals(GameVariables.CentralRoom)){
    System.out.println("You are already in the central room!");
} else {
    //Update the current Location to Central Room
    GameVariables.currentLocation = GameVariables.CentralRoom;
    System.out.println("You are now in the central room!");
}



            //Inform the player about their option

             System.out.println("You are in central room. You can go to, Kitchen, Bedroom, Hall, or Office;");


             System.out.println("Current location"+GameVariables.currentLocation+"!");
    }



}
