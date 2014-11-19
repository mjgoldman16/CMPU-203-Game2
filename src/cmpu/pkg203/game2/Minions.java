/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmpu.pkg203.game2;


import javalib.worldimages.*;

/**
 *
 * @author michaelgoldman
 */
public class Minions {
    Posn pos;
    int width, height;
    User user;
    //position of minion
    int xm = this.pos.x;
    int ym = this.pos.y;
    //position of user
    int xu = user.pos.x;
    int yu = user.pos.y;
    
    public Minions(Posn pos) {
        this.pos = pos;
    }
    
    public Minions move() {
        
        if(xm < xu) {
            return new Minions(new Posn(xm+1,ym));
        }
        else if(xm > xu) {
            return new Minions(new Posn(xm-1, ym));
        }
        else if(ym < yu) {
            return new Minions(new Posn(xm, ym+1));
        }
        else {
            return new Minions(new Posn(xm, ym-1));
        }
    }
    
    public boolean onUserHuh() {   
        if(xm == xu && ym == yu) {
            return true;
        }
        else {
            return false;
        }
    }
}
