import android.util.Log;

public class Pens {
    private int size;
    private String color;

    public Pens(){
        Log.d("Pens", "Pens: this is the parent");
    }

    public int getSize() {
        return size;
    }
    public void setSize(int sizeName) {
        size=sizeName;
    }
    public void printSizeAndColor() {
        Log.d("Tag", "printSizeAndColor: color and size ");
    }
    public void printSizeAndColor(int size, String color){
        Log.d("Tag", "printSizeAndColor: color and size "+ size+color);
    }
}
