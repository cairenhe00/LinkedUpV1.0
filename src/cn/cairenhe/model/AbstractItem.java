package cn.cairenhe.model;

import java.awt.*;
import java.util.*;

/**
 * Created by cairenhe on 2015/9/8.
 */
public abstract class AbstractItem extends AbstractSprite{
    private int state;
    private final int type;
    private int arrayLocationX;
    private int arrayLocationY;

    public AbstractItem(int locationX, int locationY, int width, int height, java.util.List<Image> pictures, int currentPictureIndex, boolean visitable, boolean enable, int type, int state, int arrayLocationX, int arrayLocationY) {
        super(locationX, locationY, width, height, pictures, currentPictureIndex, visitable, enable);
        this.type = type;
        this.state = state;
        this.arrayLocationX = arrayLocationX;
        this.arrayLocationY = arrayLocationY;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getArrayLocationY() {
        return arrayLocationY;
    }

    public void setArrayLocationY(int arrayLocationY) {
        this.arrayLocationY = arrayLocationY;
    }

    public int getArrayLocationX() {
        return arrayLocationX;
    }

    public void setArrayLocationX(int arrayLocationX) {
        this.arrayLocationX = arrayLocationX;
    }

    public int getType() {
        return type;
    }
}
