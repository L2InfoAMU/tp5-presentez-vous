package image;

import java.util.List;
import javafx.scene.paint.Color;


public class VectorImage implements Image {

    List<Shape> shapes;
    int width;
    int height;

    //CONSTRUCTEUR//

    VectorImage(List<Shape> shapes, int width, int height){
        this.shapes = shapes;
        this.width = width;
        this.height = height;
    }

    //METHODES//

    public Color getPixelColor(int x, int y){
        for(Shape color:shapes){
            if(color.contains(new Point(x,y)))
                return color.getColor();
        }
        return Color.WHITE;
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
