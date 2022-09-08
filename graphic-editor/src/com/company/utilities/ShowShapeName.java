package com.company.utilities;

import com.company.abstact.Shape;

public class ShowShapeName {

    private ShowShapeName() {
        throw new IllegalStateException("Utility class");
    }
    public static void showShapeName(Shape shape){
        System.out.println(shape.getName());
    }
}
