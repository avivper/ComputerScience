package EpisodeD;

// Part of D1

public class Rectangle {
    public double length;
    public double width;

    public double getPerimeter() {
        return (2*this.length + 2*this.width);
    }

    public double getArea() {
        return this.length * this.width;
    }

    public boolean isBiggerThan(Rectangle rectangle) {
        return (this.getArea() > rectangle.getArea());
    }

    public String toString() {
        String length = "";
        for (int i = 0; i < (int) this.length; i++) {
            for (int j = 0; j < (int) this.width; j++) {
                length += "*";
            }
            length += "\n";
        }
        return length;
    }

    public boolean equals(Rectangle rectangle) {
        return (rectangle.length == this.length && rectangle.width == this.width ||
                rectangle.length == this.width && rectangle.width == this.length);
    }
}
