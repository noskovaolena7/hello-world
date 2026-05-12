package lesson_20_homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void mustBeAbleToDrive() {
        // given
        Car car = new Car(50, 8, LocalDate.of(2026, 12, 31));

        // when
        boolean result = car.canDrive();

        //then
        Assertions.assertTrue(result);
    }

    @Test
    void mustBeNotAbleToDrive() {
        // given
        Car car = new Car(0, 8, LocalDate.of(2026, 12, 31));

        // when
        boolean result = car.canDrive();

        //then
        Assertions.assertFalse(result);
    }

    @Test
    void mustCalculateRangeCorrectly() {
        // given
        Car car = new Car(50, 8, LocalDate.of(2026, 12, 31));

        // when
        double result = car.calculateRange();

        // then
        Assertions.assertEquals(625.0, result);
    }

    @Test
    void mustReturnZeroWhenFuelLevelIsZero() {
        // given
        Car car = new Car(0, 8, LocalDate.of(2026, 12, 31));

        // when
        double result = car.calculateRange();

        // then
        Assertions.assertEquals(0, result);
    }

    @Test
    void mustBeAllowedToDriveWhenInspectionDateInFuture() {
        // given
        Car car = new Car(50, 8, LocalDate.now().plusDays(30));

        // when
        boolean result = car.isAllowedToDrive();

        // then
        Assertions.assertTrue(result);
    }

    @Test
    void mustNotBeAllowedToDriveWhenInspectionDatePassed() {
        // given
        Car car = new Car(50, 8, LocalDate.now().minusDays(1));

        // when
        boolean result = car.isAllowedToDrive();

        // then
        Assertions.assertFalse(result);
    }

    @Test
    void mustBeAllowedToDriveOnInspectionDate() {
        // given
        Car car = new Car(50, 8, LocalDate.now());

        // when
        boolean result = car.isAllowedToDrive();

        // then
        Assertions.assertTrue(result);
    }

}