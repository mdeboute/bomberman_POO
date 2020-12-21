package fr.ubx.poo.model;

import fr.ubx.poo.model.go.character.Player;

public abstract class Entity {

    public void traitement(Player player) {
    }

    public boolean canWalk(Player player) {
        return false;
    }

}
