package com.learning.designpatterns.behavioral.visitor.element;

import com.learning.designpatterns.behavioral.visitor.visitor.Visitor;

// element interface
public interface Shape {
    void accept(Visitor visitor);
}
