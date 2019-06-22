package com.gradle.study;

public class Rectangle {
    private long length;
    private long width;

    Rectangle(long length, long width) {
        this.length = length;
        this.width = width;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public long calculateArea() {
        return length * width;
    }

    public long calculateCircumference() {
        return (length + width) * 2;
    }
}
