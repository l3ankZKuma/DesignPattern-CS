public class ImageManager {
    private Stategy renderer;
    public void setRenderer(Stategy renderer) {
		this.renderer = renderer;
	}
	public void show() {
		renderer.showImage();
	}
}

