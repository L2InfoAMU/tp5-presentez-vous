package image;

import javafx.scene.paint.Color;
import util.Matrices;
import java.util.ArrayList;
import java.util.List;


public class PaletteRasterImage extends RasterImage implements Image {

    // VARIABLES
    //dans classe abstract
    List<Color> palette;
    int[][] indexesOfColors;


    // CONSTRUCTEURS
    public PaletteRasterImage(Color color, int width, int height){
        //construisant une image de
        //la taille spécifiée et dont tous les pixels sont de la couleur spécifiée
        super(color,width,height);
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
       super(pixels);

    }

    // METHODES // GETTERS // SETTERS

    public void createRepresentation(){
        //alloue la liste pour stocker la palette et la matrice représentant
        //l’image (à utiliser dans le constructeur)
        this.palette = new ArrayList<>();
        this.indexesOfColors = new int[this.width][this.height];

    }

    public void setPixelColor(Color color, int x, int y) {
        //fixe la couleur d’un pixel (en ajoutant
        //la couleur à la palette si elle n’était pas dans la palette)
        if (!palette.contains(color))
        {
            palette.add(color);
        }
            this.indexesOfColors[x][y] = palette.indexOf(color);
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


    public Color getPixelColor(int x, int y){
        //retourne la couleur d’un pixel
        return palette.get(indexesOfColors[x][y]);
    }

}