package cn.cairenhe.model;

import java.awt.Image;
import java.util.*;

/**
 * Created by cairenhe on 2015/9/8.
 */
public class ItemFactory extends AbstractItemFactory {

    @Override
    public Item newInstance(int locationX, int locationY, int width, int height, List<Image> pictures, int currentPictureIndex, boolean visitable, boolean enable, int type, int state, int arrayLocationX, int arrayLocationY) {
        return new Item(locationX,locationY,width,height,pictures,currentPictureIndex,visitable,enable,type,state,arrayLocationX,arrayLocationY);
    }
}
