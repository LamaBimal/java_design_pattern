package com.learning.designpatterns.creational.abstractfactory;

import com.learning.designpatterns.creational.abstractfactory.factory.MacOsUIFactory;
import com.learning.designpatterns.creational.abstractfactory.factory.UIFactory;
import com.learning.designpatterns.creational.abstractfactory.factory.WindowsUIFactory;
import com.learning.designpatterns.creational.abstractfactory.product.Button;
import com.learning.designpatterns.creational.abstractfactory.product.Checkbox;
import com.learning.designpatterns.exception.UnsupportedTypeException;

// AbstractFactory Design Pattern
public class AbstractFactoryDemo {

    public static void renderUI(UIFactory factory){
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        button.render();
        checkbox.render();
    }

    public static void main(String[] args) {
        String os = "MacOs";
        UIFactory factory = null;

        switch (os.toLowerCase()){
            case "windows":
                factory = new WindowsUIFactory();
                break;
            case "macos":
                factory = new MacOsUIFactory();
                break;
            default:
                try {
                    throw new UnsupportedTypeException(" Following OS Product "+os+ " Not Available.");
                } catch (UnsupportedTypeException e) {
                    e.printStackTrace();
                }
                break;
        }

        renderUI(factory);
    }
}
