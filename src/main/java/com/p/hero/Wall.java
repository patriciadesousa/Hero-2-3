package com.p.hero;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Wall {
    private Position position;

    public Wall(int x, int y){
        position = new Position(x,y);

    }

    public Position getPosition(){
        return position;
    }

    public void draw(TextGraphics graphics){
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFF34"));
        graphics.putString(new TerminalPosition(this.position.getX(),this.position.getY()), "%");
    }

}