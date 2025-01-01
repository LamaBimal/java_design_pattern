package com.learning.designpatterns.behavioral.visitor.visitor;

import com.learning.designpatterns.behavioral.visitor.concrete.Circle;
import com.learning.designpatterns.behavioral.visitor.concrete.Rectangle;

public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
