package se.yogesh.model;


//import se.yogesh.game.Game;

import se.yogesh.game.GameVariables;

public class Office {
    private boolean gameWon = false;

    public void enterRoom(Burglar burglar) {
        // Check if the player is coming from the Central Room
        if (GameVariables.currentLocation.equals(GameVariables.CentralRoom)) {
            // Update current location to Office
            GameVariables.currentLocation = GameVariables.Office;

            System.out.println("You are entered the office.");
            // Check the burglar's status
            if (!burglar.isConscious()) {
                System.out.println("The burglar is knocked out. You call the police, and the game ends!");
                gameWon = true;
            } else {
                // Burglar is still conscious; game cannot be won yet
                System.out.println("You are too stressed to call the police while the burglar is conscious!");
            }
        } else {
            // Deny entry if the player is not in the Central Room
            System.out.println("You need to go back to the Central Room before entering the Office.");
        }
    }
    // Check if the game is won

    public boolean isGameWon() {
        return gameWon;
    }
}




