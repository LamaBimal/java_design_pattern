package com.learning.designpatterns.structural.proxyPattern;

import com.learning.designpatterns.structural.proxyPattern.proxy.ProxyImage;
import com.learning.designpatterns.structural.proxyPattern.subject.Image;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("Image1.png");
        Image image1 = new ProxyImage("Image2.png");

        image.display(); // load from disk

        image.display(); // Not loading from disk
        image1.display(); // loading from disk
        image1.display(); // Not loading from disk

    }
}
