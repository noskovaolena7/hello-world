package lesson_28_inharitance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    @Test
    void testCircleArea() {
            Circle c = new Circle(5);
            double expected = 3.14 * 25;
            assertEquals(expected, c.calculateArea(), 0.0001);
        }

    @Test
    void testRectangleArea() {
            Rectangle r = new Rectangle(4, 7);
            assertEquals(28.0, r.calculateArea());
        }

    @Test
    void testSquareArea() {
        Square s = new Square(5);
        assertEquals( 25, s.calculateArea());
    }
}