
public interface ShapeVisitor {
    void visitCircleAsVector(Circle circle);
    void visitTriangleAsVector(Triangle triangle);
    void visitRectangleAsVector(Rectangle rectangle);

    void visitCircleAsRaster(Circle circle);
    void visitTriangleAsRaster(Triangle triangle);
    void visitRectangleAsRaster(Rectangle rectangle);
}
