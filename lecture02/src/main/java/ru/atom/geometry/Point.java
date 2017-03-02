package ru.atom.geometry;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Template class for
 */
public class Point implements Collider /* super class and interfaces here if necessary */ {
    int x;
    int y;

    public boolean isColliding(Collider other) {
        if (this.equals(other)) return true;
        else return false;
    }

    /**
     * @param o - other object to check equality with
     * @return true if two points are equal and not null.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        // cast from Object to Point
        Point point = (Point) o;
        if ((this.x == point.x) && (this.y == point.y)) return true;
        else return false;

    }
}
