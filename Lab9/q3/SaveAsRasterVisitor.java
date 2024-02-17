
public class SaveAsRasterVisitor implements ShapeVisitor {
    public void visitCircleAsVector(Circle circle) {
        // This visitor does not handle vector
    }

    public void visitTriangleAsVector(Triangle triangle) {
        // This visitor does not handle vector
    }

    public void visitRectangleAsVector(Rectangle rectangle) {
        // This visitor does not handle vector
    }

    public void visitCircleAsRaster(Circle circle) {
        System.out.println("Saving the circle as raster with radius= " + circle.getRadius() + " at position " + circle.getxPos() + ", " + circle.getyPos());
    }

    public void visitTriangleAsRaster(Triangle triangle) {
        System.out.println("Saving the triangle as raster with base= " + triangle.getBase() + " height= " + triangle.getHeight() + " at position " + triangle.getxPos() + ", " + triangle.getyPos());
    }

    public void visitRectangleAsRaster(Rectangle rectangle) {
        System.out.println("Saving the rectangle as raster with width= " + rectangle.getWidth() + " height= " + rectangle.getHeight() + " at position " + rectangle.getxPos() + ", " + rectangle.getyPos());
    }
}
