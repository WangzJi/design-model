package com.p6.demo.review.liskov_substitution_principle;

/**
 * @author 扫地僧 xshlxx@126.com
 * @since 2020/11/18
 */
public class SimpleTest {

    public static void resize(Rectangle rectangle) {

        while (rectangle.getWidth() >= rectangle.getHeight()) {

            rectangle.setHeight(rectangle.getHeight() + 1);
            System.out.println("width: " + rectangle.getWidth() + ",Height" + rectangle.getHeight());
        }

        System.out.println("resize() End, width: " + rectangle.getWidth() + ",Height" + rectangle.getHeight());
    }

    public static void main(String[] args) {

//        Rectangle rectangle = new Rectangle();
//
//        rectangle.setWidth(20);
//        rectangle.setHeight(10);
//
//        resize(rectangle);

        Square square = new Square();

        square.setLength(10);
        resize(square);

    }
}
