package cn.cairenhe.model;

import java.awt.*;

/**
 * Created by cairenhe on 2015/9/8.
 */
public abstract class AbstractItemFactory {
    abstract public Item newInstance(int locationX, int locationY, int width, int height, java.util.List<Image> pictures, int currentPictureIndex, boolean visitable, boolean enable, int type, int state, int arrayLocationX, int arrayLocationY);
}
