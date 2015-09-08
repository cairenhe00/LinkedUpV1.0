package cn.cairenhe.model;

import java.awt.Image;
import java.util.List;

/**
 * Created by cairenhe on 2015/9/8.
 */
public class SelectedFrame extends AbstractSprite{
    public SelectedFrame(int locationX, int locationY, int width, int height, List<Image> pictures, int currentPictureIndex, boolean visitable, boolean enable) {
        super(locationX, locationY, width, height, pictures, currentPictureIndex, visitable, enable);
    }
}
