package image;

import javafx.scene.paint.Color;
import util.Matrices;


public class BruteRasterImage extends RasterImage implements Image  {

    // VARIABLES
    Color[][] colors;

    // CONSTRUCTEURS
    public BruteRasterImage(Color color, int width, int height) {
     super(color,width,height);
    }

    public BruteRasterImage(Color[][] colors){
    super(colors);
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

    public void setPixelsColor(Color color){
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


}
