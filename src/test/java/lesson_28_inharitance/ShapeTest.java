package lesson_28_inharitance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    @Test
    void testCircleArea() {
        // given
        Circle c = new Circle(5);
        // when
        double expected = c.calculateArea();
        // then
        assertEquals(expected, c.calculateArea(), 0.0001);
    }

    @Test
    void testRectangleArea() {
        // given
        Rectangle r = new Rectangle(4, 7);
        // when
        double expected = r.calculateArea();
        // then
        assertEquals(28.0, r.calculateArea());
    }

    @Test
    void testSquareArea() {
        // given
        Square s = new Square(5);
        // when
        double expected = s.calculateArea();
        // then
        assertEquals(25, s.calculateArea());
    }


    @Test
    void testCirclePerimeter() {
        // given
        Shape shape = new Circle(5);
        // when
        double result = shape.calculatePerimeter();
        // then
        double expected = 2 * 3.14 * 5;
        assertEquals(expected, result, 0.0001);
    }

    @Test
    void testRectanglePerimeter() {
        // given
        Shape shape = new Rectangle(4, 7);
        // when
        double result = shape.calculatePerimeter();
        // then
        assertEquals(22.0, result);
    }

    @Test
    void testSquarePerimeter() {
        // given
        Shape shape = new Square(5);
        // when
        double result = shape.calculatePerimeter();
        // then
        assertEquals(20.0, result);
    }
}