package com.gamefiles.rpggame.playercharacter;

public class PlayerCharacter {

    int playerCharacterHealth = 100;
    int playerCharacterDamage = 2;

    public PlayerCharacter() {

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
