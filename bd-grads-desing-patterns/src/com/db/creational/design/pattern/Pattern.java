package com.db.creational.design.pattern;

/**
 * 
 * @author Vaman Deshmukh Abstract Factory Pattern
 */

// create shapes - rectangle, square, circle... 

interface Shape {
	public abstract void drawShape();
}

class Square implements Shape {
	@Override
	public void drawShape() {
		System.out.println("Draw square");
	}
}

class Rectangle implements Shape {
	@Override
	public void drawShape() {
		System.out.println("Draw rectangle");
	}
}

class Circle implements Shape {
	@Override
	public void drawShape() {
		System.out.println("Draw circle");
	}
}

class Oval implements Shape {
	@Override
	public void drawShape() {
		System.out.println("Draw Oval");
	}
}

abstract class AbstractFactory {
	abstract Shape getShape(String typeOfShape);
}

class ShapeFactory extends AbstractFactory {
	@Override
	Shape getShape(String typeOfShape) {
		if (typeOfShape == "rectangle") {
			return new Rectangle();
		} else if (typeOfShape == "square") {
			return new Square();
		} else {
			return null;
		}
	}
}

class RoundedShapeFactory extends AbstractFactory {
	@Override
	Shape getShape(String typeOfShape) {
		if (typeOfShape == "circle") {
			return new Circle();
		} else if (typeOfShape == "oval") {
			return new Oval();
		} else {
			return null;
		}
	}
}

class FactoryGenerator {

	public static AbstractFactory getFactory(boolean isRounded) {
		if (isRounded) {
			return new RoundedShapeFactory();
		} else {
			return new ShapeFactory();
		}

	}

}

public class Pattern {

	public static void main(String[] args) {
		
		AbstractFactory factory1 = FactoryGenerator.getFactory(true); // false 
		Shape shape1 = factory1.getShape("oval"); // other shapes 
		shape1.drawShape();
		
		
//		ShapeFactory sf = new ShapeFactory();
//		sf.getShape("rectangle").drawShape();
//		sf.getShape("square").drawShape();
	}
}
