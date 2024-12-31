package com.learning.designpatterns.behavioral.templatepattern.concrete;

import com.learning.designpatterns.behavioral.templatepattern.template.DataProcessor;

public class CSVDataProcessor extends DataProcessor {
    @Override
    protected void process() {
        System.out.println("Processing CSV Data");
    }
}
