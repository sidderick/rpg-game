package com.gamefiles.rpggame.playercharacter;

import com.gamefiles.rpggame.utils.PlayerInput;

public class PlayerCharacter {

    int playerCharacterHealth = 100;
    int playerCharacterDamage = 2;
    String playerName = "";


    public PlayerCharacter() {

    }

    public String PlayerName() {
        playerName = PlayerInput.playerInputString("What is your name adventurer?");
        return playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerCharacterHealth() {
        return playerCharacterHealth;
    }

    public void setPlayerCharacterHealth(int playerCharacterHealth) {
        this.playerCharacterHealth = playerCharacterHealth;
    }

    public int getPlayerDamage() {
        return playerCharacterDamage;
    }

    public void setPlayerDamage(int playerDamage) {
        this.playerCharacterDamage = playerDamage;
    }
}
