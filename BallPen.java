import android.util.Log;

public class BallPen extends Pens {
    public BallPen() {
        Log.d("BallPen", "BallPen: this is the child");
    }

    @Override
    public void printSizeAndColor() {
        super.printSizeAndColor(3, "orange");
    }
}
