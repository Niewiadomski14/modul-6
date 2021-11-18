package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

interface Shape{
    String getShapeName();
    Double getField();
}

class Circle implements Shape{

    private Double radius;
    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public Double getField() {
        return Math.PI * Math.pow(radius, 2.0);
    }
}

class Triangle implements Shape{

    private Double height;
    private Double sideTriangle;

    public Triangle(Double height, Double sideTriangle) {
        this.height = height;
        this.sideTriangle = sideTriangle;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public Double getField() {
        return (sideTriangle * height) / 2;
    }
}

class Square implements Shape {

    private Double side;

    public Square(Double side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public Double getField() {
        return Math.pow(side, 2.0);
    }
}

class ShapeCollector{
    private List<Shape> shapeList = new ArrayList<Shape>();

    public boolean addFigure(Shape shape){
        boolean result = false;
        shapeList.add(shape);
        if (shapeList.contains(shape)) {
            result = true;
        }
        return result;
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(shapeList.contains(shape)) {
            shapeList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape figure = null;
        if((n >= 0) && (n <= shapeList.size())) {
            figure = shapeList.get(n);
        }
        return figure;
    }

    public ArrayList<String> showFigure() {
        ArrayList<String> showList = new ArrayList<String>();
        for (Shape currentShape : shapeList) {
            String currentShowFigure = (currentShape.getShapeName() + " " + currentShape.getField());
            showList.add(currentShowFigure);
        }
        return showList;
    }
    public int shapesListSize() {
        return shapeList.size();
    }

}