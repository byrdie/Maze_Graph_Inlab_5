/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Maze_Graph;

/**
 *
 * @author byrdie
 */
public class Move {
    public int x;
    public int y;
    public String f;
    
    public Move(int i, int j, String facing){
        x = i;
        y = j;
        f = facing;
    }
            
    
}
