package se.yogesh.game;

import se.yogesh.model.*;

import java.util.Scanner;

import static se.yogesh.game.GameVariables.currentLocation;


public class Game {    // creates Characters and room clases
    private Resident resident = new Resident();
    private Burglar burglar = new Burglar();
    private CentralRoom centralRoom = new CentralRoom();
    private Kitchen kitchen = new Kitchen();
    private Bedroom bedroom = new Bedroom();
    private Hall hall = new Hall();
    private Office office = new Office();
    private boolean running = true;
    private  Scanner scanner = new Scanner(System.in);


    public void start() {
        System.out.println("Welcome to the Advanture Game");

        //Display central room
        centralRoom.enterRoom();

//Main game Loop
        while (running && resident.isConscious()) {
            System.out.print("\nChoose a room (Central Room,Kitchen, Bedroom, Hall, Office );");
            String choice = scanner.nextLine().toLowerCase();
            //Navigate to the chosen room
            switch (choice) {

                case "kitchen":
                    kitchen.enterRoom(resident);
                    break;

                case "central room":
                    System.out.println("case works!");
                    centralRoom.enterRoom();
                    break;

                case "bedroom":
                    bedroom.enterRoom();
                    break;
                case "hall":
                    hall.enterRoom(resident,burglar);
                    if (!resident.isConscious()) {
                        running = false;//End game if resident is loos
                    }

                    break;
                case "office":
                    office.enterRoom(burglar);
                    if (office.isGameWon()) {
                        running = false;   //End game if player has won
                    }
                    break;
                default:
                    System.out.println("write properly");
            }
        }
        System.out.println("Game Over!");
    }
}













