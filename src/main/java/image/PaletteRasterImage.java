package image;

import javafx.scene.paint.Color;
import util.Matrices;
import java.util.List;

public class PaletteRasterImage implements Image {

    // VARIABLES
    List<Color> palette;
    int[][] indexesOfColors;
    int width;
    int height;


    // CONSTRUCTEURS
    public PaletteRasterImage(Color color, int width, int height){
        //construisant une image de
        //la taille spécifiée et dont tous les pixels sont de la couleur spécifiée
        this.width = width;
        this.height = height;
        createRepresentation();
        for(int x = 0 ; x < this.width; x++) {
            for(int y = 0; y < this.height; y++) {
                palette.add(color);
            }
        }
    }

    public PaletteRasterImage(Color[][] pixels){
        //construisant une image à partir de la matrice
        //donnée en paramètre. Le premier indice correspondant à la coordonnée en x et le deuxième indice
        //correspondant à la coordonnée en y
        width = indexesOfColors.length;
        height = indexesOfColors[0].length;
        createRepresentation();
        setPixelsColor(pixels);

    }

    // METHODES // GETTERS // SETTERS

    public void createRepresentation(){
        //alloue la liste pour stocker la palette et la matrice représentant
        //l’image (à utiliser dans le constructeur)

    }

    public void setPixelColor(Color color, int x, int y){
        //fixe la couleur d’un pixel (en ajoutant
        //la couleur à la palette si elle n’était pas dans la palette)
        indexesOfColors[x][y] = palette.indexOf(color);
    }

    public Color getPixelColor(int x, int y){
        //retourne la couleur d’un pixel
        return palette.get(indexesOfColors[x][y]);
    }


    public void setPixelsColor(Color[][] pixels) {
        //met à jour les valeurs de couleurs de l’image
        //en utilisant les valeurs de la matrice donnée en paramètre
        width = Matrices.getRowCount(pixels);
        height = Matrices.getColumnCount(pixels);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                setPixelColor(pixels[x][y], x, y);
            }
        }
    }


    private void setPixelsColor(Color color) {
        //change les valeurs de tous les pixels pour qu’ils
        //soient tous de la couleur donnée en paramètre.
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                setPixelColor(color, x, y);
            }
        }
    }

    public int getWidth() {
        //retourne la largeur de l’image
        return width;
    }

    public int getHeight(){
        //retourne la hauteur de l’image
        return height;
    }

    protected void setWidth(int width){
        //fixe la largeur de l’image
        this.width = width;
    }

    protected void setHeight(int height){
        //fixe la hauteur de l’image
        this.height = height;
    }

}