package image;
import javafx.scene.paint.Color;
import java.util.HashMap;
import java.util.Map;

public class SparseRasterImage extends RasterImage {

    Map<Point,Color> pixelmap;

    //CONSTRUCTEURS//

    public SparseRasterImage(Color color, int width, int height){
        super(color, width, height);
    }

    public SparseRasterImage(Color[][] pixels){
        super(pixels);
    }

    //METHODES//

    public void createRepresentation(){
        this.pixelmap = new HashMap<>();
    }

    public void setPixelColor(Color color, int x, int y) {
        Point point = new Point(x,y);
        pixelmap.put(point, color);
    }

    public Color getPixelColor(int x, int y){
        Point point = new Point(x,y);
        return pixelmap.getOrDefault(point, Color.WHITE);
    }

    public void setPixelsColor(Color[][] pixels){
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                setPixelColor(pixels[x][y], x, y);
            }
        }
    }

    public void setPixelsColor(Color color){
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                setPixelColor(color, x, y);
            }
        }
    }

}
