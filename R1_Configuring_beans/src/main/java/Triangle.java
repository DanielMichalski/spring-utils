/**
 * Author: Daniel
 */
public class Triangle {
    private String type;
    private int height;

    public void draw() {
        String text = String.format("%s triangle with height %d drawn.", type, height);
        System.out.println(text);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
