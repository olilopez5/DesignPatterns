package structuralpatterns.flyweight.assets;

public class Texture {
    public String texture;

    public Texture(String texture) {
        this.texture = texture;
    }

    @Override
    public String toString() {
        return texture;
    }
}
