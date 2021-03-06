package com.cfarrend.AusTravelSim;

import java.util.Scanner;

public class AusTravelSim {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to AusTravelSim, type EXIT or exit to quit the game");

        /* Game Variables */
        Game game = new Game();

        while (game.isActive()) {
            game.printStatus();
            String command = input.next();

            switch (command) {
                case "INFO":
                case "info":
                    game.printTownInfo();
                    break;
                case "EXIT":
                case "exit":
                    game.close();
                    break;
                default:
                    game.move(Direction.parseDir(command));
                    break;
            }
        }

        /* Just to make debugging easier

        System.out.println("Areas to travel too: ");
        System.out.println("\t1. Sydney\n\t2. Canberra\n\t3. Melbourne\n\t4. Brisbane\n\t5. Adelaide\n\t6. Perth\n\t7. Darwin\n\t8. Tamworth\n\t9. End Game");
        System.out.print("Choose a City via #: ");

        int selection = input.nextInt();
        String currentLocation;

        switch (selection) {

                case 1:
                    currentLocation = "You are now in: Sydeny";
                    break;
                case 2:
                    currentLocation = "You are now in: Canberra";
                    break;
                case 3:
                    currentLocation = "You are now in: Melbourne";
                    break;
                case 4:
                    currentLocation = "You are now in: Brisbane";
                    break;
                case 5:
                    currentLocation = "You are now in: Adelaide";
                    break;
                case 6:
                    currentLocation = "You are now in: Perth";
                    break;
                case 7:
                    currentLocation = "You are now in: Darwin";
                    break;
                case 8:
                    currentLocation = "You are now in: Tamworth";
                    break;
                default:
                    currentLocation = "You are now in: You tell me";
                    break;

        }
        System.out.println("\n" + currentLocation);
        */
    }
}
