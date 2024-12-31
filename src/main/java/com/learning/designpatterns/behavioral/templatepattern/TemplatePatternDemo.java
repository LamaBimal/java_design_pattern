package com.learning.designpatterns.behavioral.templatepattern;

import com.learning.designpatterns.behavioral.templatepattern.concrete.CSVDataProcessor;
import com.learning.designpatterns.behavioral.templatepattern.concrete.JSONDataProcessor;
import com.learning.designpatterns.behavioral.templatepattern.template.DataProcessor;

// client code
public class TemplatePatternDemo {
    public static void main(String[] args) {
        System.out.println(" Processing CSV File");
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.processData();

        System.out.println("Processing JSON File ");
        DataProcessor jsonProcessor = new JSONDataProcessor();
        jsonProcessor.processData();
    }
}
