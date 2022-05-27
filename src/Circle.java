public class Circle {
        private static final double PI = 3.14;
        private static final int CONST_TWO = 2;
        private static double radius = 4;
        public Circle() {
        }
        public static double getPerimeter() {
            return CONST_TWO * PI * radius;
        }
        public double getArea() {
            return PI * radius * radius;
        }
}
