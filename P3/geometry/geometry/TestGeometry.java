package geometry;

public class TestGeometry {
    
    public static void main(String[] args) {
        
        TestRecangle testRectangle = new TestRectangle();
        TestPoint2D testPoint2D = new TestPoint2D();

        testRectangle.testAll();
        testPoint2D.testAll();

        System.out.println("All test finished with " + testUtils.Assert.getNrErrors() + " errors");
    }
}
