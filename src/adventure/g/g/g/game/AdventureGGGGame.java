/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure.g.g.g.game;

/**
 *
 * @author Jason A Minto
 */
public class AdventureGGGGame {
     public Room [][] dungeon ;
     
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x_pos = 0;
        int y_pos = 0;
        AdventureGGGGame game = new AdventureGGGGame();
        game.CreateDungeon();
        System.out.println("You are in the " + game.dungeon[x_pos][y_pos].strRoomDesc);
    }
    
    private void CreateDungeon() {
        this.dungeon = new Room[2][2];
        this.dungeon[0][0] = new Room("entrance");
        this.dungeon[0][1] = new Room("hallway");
        this.dungeon[1][0] = new Room("courtyard");
        this.dungeon[1][1] = new Room("keyroom");
    } // CreateDungeon

}
