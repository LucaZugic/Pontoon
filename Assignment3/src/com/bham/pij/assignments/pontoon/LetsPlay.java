package com.bham.pij.assignments.pontoon;

class LetsPlay{

    public static void main(String[] args) {
        
        Pontoon game = new Pontoon(2);
        
        System.out.println("\nThe Pontoon game has " + String.valueOf(game.playerNum) + " players.\n");

        for (Player player : game.players) {
            System.out.println(player.getName()+" was dealt the cards:\n"+player.getCards().get(0).getSuit()+" "+player.getCards().get(0).getValue()+"\n"+player.getCards().get(1).getSuit()+" "+player.getCards().get(1).getValue());
            if (player.getBestNumericalHandValue() <= 16) {
                player.dealToPlayer(game.deck.dealRandomCard());
                System.out.println("\nAs the best value of this hand is less than or equal to 16, the player wanted an extra card, and has been dealt one.");
                System.out.println("This new card is: " + player.getCards().get(2).getSuit() + " " + player.getCards().get(2).getValue() + "\n");
            }
            System.out.println("Therefore, the best numerical hand value of the players hand is: " + player.getBestNumericalHandValue() + "\n");
        }

        switch (game.compareHands(game.players.get(0), game.players.get(1))) {
            case -1:
            System.out.println("\nTherefore, " + game.players.get(0).getName() + " won!");
            break;
            case 1:
            System.out.println("\nTherefore, " + game.players.get(1).getName() + " won!");
            break;
            case 0:
            System.out.println("Therefore, the game is a draw.\n");
            break;
        }
    }
}