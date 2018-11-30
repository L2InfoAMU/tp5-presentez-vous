package image;

public class PaletteRasterImage implements Image {

    // CONSTRUCTEURS
    public PaletteRasterImage(Color color, int width, int height){
        //construisant une image de
        //la taille spécifiée et dont tous les pixels sont de la couleur spécifiée
    }

    public PaletteRasterImage(Color[][] pixels){
        //construisant une image à partir de la matrice
        //donnée en paramètre. Le premier indice correspondant à la coordonnée en x et le deuxième indice
        //correspondant à la coordonnée en y
    }

    // METHODES // GETTERS // SETTERS

    public void createRepresentation(){
        //alloue la liste pour stocker la palette et la matrice représentant
        //l’image (à utiliser dans le constructeur)
    }

    public void setPixelColor(Color color, int x, int y){
        //fixe la couleur d’un pixel (en ajoutant
        //la couleur à la palette si elle n’était pas dans la palette)
    }

    public Color getPixelColor(int x, int y){
        //retourne la couleur d’un pixel
    }


    public void setPixelsColor(Color[][] pixels){
        //met à jour les valeurs de couleurs de l’image
        //en utilisant les valeurs de la matrice donnée en paramètre
    }


    private void setPixelsColor(Color color){
        //met à jour les valeurs de couleurs de l’image
        //en utilisant les valeurs de la matrice donnée en paramètre
    }

    public int getWidth() {
        //retourne la largeur de l’image
    }

    public int getHeight(){
        //retourne la hauteur de l’image
    }

    protected void setWidth(int width){
        //fixe la largeur de l’image
    }

    protected void setHeight(int height){
        //fixe la hauteur de l’image
    }

}
