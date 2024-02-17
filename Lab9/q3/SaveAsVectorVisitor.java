
public class SaveAsVectorVisitor implements ShapeVisitor {
    public void visitCircleAsVector(Circle circle) {
        System.out.println("Saving the circle as vector with radius= " + circle.getRadius() + " at position " + circle.getxPos() + ", " + circle.getyPos());
    }

    public void visitTriangleAsVector(Triangle triangle) {
        System.out.println("Saving the triangle as vector with base= " + triangle.getBase() + " height= " + triangle.getHeight() + " at position " + triangle.getxPos() + ", " + triangle.getyPos());
    }

    public void visitRectangleAsVector(Rectangle rectangle) {
        System.out.println("Saving the rectangle as vector with width= " + rectangle.getWidth()+ " height= " + rectangle.getWidth() + " at position " + rectangle.getyPos() + ", " + rectangle.getyPos());
    }

    public void visitCircleAsRaster(Circle circle) {
        // This visitor does not handle raster
    }

    public void visitTriangleAsRaster(Triangle triangle) {
        // This visitor does not handle raster
    }

    public void visitRectangleAsRaster(Rectangle rectangle) {
        // This visitor does not handle raster
    }
}
