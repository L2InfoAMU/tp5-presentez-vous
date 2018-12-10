package image;


import javafx.scene.paint.Color;
import util.Matrices;

import java.util.List;

public abstract class RasterImage implements Image{
    int width;
    int height;




    //CONSTRUCTEUR

    public RasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        createRepresentation();
        setPixelsColor(color);
    }

    public RasterImage(Color[][] colors){
        this.width = Matrices.getRowCount(colors);
        this.height = Matrices.getColumnCount(colors);
        createRepresentation();
        setPixelsColor(colors);
    }

    protected abstract void setPixelsColor(Color[][] pixels);

    protected abstract void createRepresentation();





    //METHODES
    public void setPixelsColor(Color color) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                setPixelColor(color, x, y);
            }
        }
    }

    protected abstract void setPixelColor(Color color, int x, int y);


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    protected void setWidth(int width){
        this.width = width;
    }

    protected void setHeight(int height){
        this.height = height;
    }


}
