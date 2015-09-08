package cn.cairenhe.model;

import java.awt.Image;
import java.util.List;

/**
 * Created by cairenhe on 2015/9/8.
 */
public abstract class AbstractSprite {
    private int locationX;
    private int locationY;
    private int width;
    private int height;
    private List<Image> pictures;
    private int currentPictureIndex;
    private boolean enable;
    private boolean visitable;

    public AbstractSprite(int locationX, int locationY, int width, int height, List<Image> pictures, int currentPictureIndex, boolean visitable, boolean enable) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.width = width;
        this.height = height;
        this.pictures = pictures;
        this.currentPictureIndex = currentPictureIndex;
        this.visitable = visitable;
        this.enable = enable;
    }

    public List<Image> getPictures() {
        return pictures;
    }

    public void setPictures(List<Image> pictures) {
        this.pictures = pictures;
    }

    public int getCurrentPictureIndex() {
        return currentPictureIndex;
    }

    public void setCurrentPictureIndex(int currentPictureIndex) {
        this.currentPictureIndex = currentPictureIndex;
    }

    public boolean isVisitable() {
        return visitable;
    }

    public void setVisitable(boolean visitable) {
        this.visitable = visitable;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public int getLocationX() {
        return locationX;
    }

    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
