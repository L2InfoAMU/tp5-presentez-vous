package image;


import javafx.scene.paint.Color;
import util.Matrices;

public abstract class RasterImage {
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

    protected abstract void setPixelsColor(Color color);

    protected abstract void setPixelsColor(Color[][] pixels);

    protected abstract void createRepresentation();





    //METHODES




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
