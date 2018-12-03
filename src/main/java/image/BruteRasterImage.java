package image;

import image.Image;
import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage implements Image {

    // VARIABLES
    Color[][] colors;
    int width;
    int height;

    // CONSTRUCTEURS
    public BruteRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        createRepresentation();
        setPixelsColor(color);
    }

    public BruteRasterImage(Color[][] colors){
        width = Matrices.getRowCount(colors);
        height = Matrices.getColumnCount(colors);
        createRepresentation();
        setPixelsColor(colors);
    }

    // METHODES // GETTERS // SETTERS
    public void createRepresentation(){
        this.colors = new Color[this.width][this.height];
    }


    public void setPixelColor(Color color, int x, int y){
        colors[x][y] = color;
    }

    public void setPixelsColor(Color[][] pixels) {
        width = Matrices.getRowCount(colors);
        height = Matrices.getColumnCount(colors);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                this.colors[x][y] = pixels[x][y];
            }
        }
    }

    private void setPixelsColor(Color color){
        width = Matrices.getColumnCount(colors);   //largeur
        height = Matrices.getRowCount(colors);     //hauteur
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                setPixelColor(color, x, y);
            }
        }
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return colors[x][y];
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
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
