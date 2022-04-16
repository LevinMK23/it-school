package com.samsung.module4.sort;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rectangle implements Comparable<Rectangle> {

    private int width;
    private int length;

    @Override
    public int compareTo(Rectangle o) {
        if (getWidth() - o.getWidth() != 0) {
            return getWidth() - o.getWidth();
        }
        return getLength() - o.getLength();
    }
}
